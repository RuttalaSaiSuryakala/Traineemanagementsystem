package com.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;

import com.model.TraineeDetails;

@Component("products1")
@Service
@Transactional
public class productServiceImpl implements productService {

	@Autowired
	ProductDao dao;
	@Override
	public int addTrainee(TraineeDetails details) {
		
		return dao.addTrainee( details);
	}
	@Override
	public int updateTrainee(TraineeDetails details) {
		// TODO Auto-generated method stub
		return dao.updateTrainee(details);
	}
	
	@Override
	public TraineeDetails getByPid(int pId) {
		// TODO Auto-generated method stub
		return dao.getByPid(pId);
	}
	@Override
	public ArrayList<TraineeDetails> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}
	@Override
	public int deleteTrainee(int pId) {
		// TODO Auto-generated method stub
		 return dao.deleteTrainee(pId);
	}

}
