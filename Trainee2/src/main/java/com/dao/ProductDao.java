package com.dao;

import java.util.ArrayList;

import com.model.TraineeDetails;

public interface ProductDao {

	int addTrainee(TraineeDetails details);
    int updateTrainee(TraineeDetails details);
	int deleteTrainee(int tId);
	ArrayList<TraineeDetails > getAll();
	TraineeDetails  getByPid(int tId);
}
