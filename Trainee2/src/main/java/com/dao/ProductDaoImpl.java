package com.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.model.TraineeDetails;
@Component("dao")
@Repository
@ComponentScan("com")
public class ProductDaoImpl implements ProductDao{
	
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public int addTrainee(TraineeDetails details) {
		entityManager.persist(details);
		return 0;
	}
	@Override
	public int updateTrainee(TraineeDetails details) {
		// TODO Auto-generated method stub
		entityManager.merge(details);
		return 0;
	}
	@Override
	public int deleteTrainee(int pId) {
		// TODO Auto-generated method stub
		TraineeDetails details = new TraineeDetails();
		details.setId(pId);
		entityManager.remove(getByPid(pId));
		return 0;
	}
//	@Override
//	public Product getAll() {
//		entityManager.find(Product.class,prpId );
//		return null;
//	}
	@Override
	public TraineeDetails  getByPid(int pId) {
		TraineeDetails details=entityManager.find(TraineeDetails.class, pId);
		return details;
	}
	@Override
	public ArrayList<TraineeDetails> getAll() {
		/*TypedQuery<Product> query =entityManager.createQuery("SELECT products FROM Product products", Product.class);
		  ArrayList<Product> results = (ArrayList<Product>) query.getResultList();*/
		
		Query query = (Query) entityManager.createQuery("from Product ");
		ArrayList<TraineeDetails > list = (ArrayList<TraineeDetails >) query.list();
		return list;
	}

}
