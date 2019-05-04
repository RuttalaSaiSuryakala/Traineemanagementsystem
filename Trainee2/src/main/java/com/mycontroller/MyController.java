package com.mycontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.TraineeDetails;
import com.service.productService;
import com.uiexception.UserNotFoundException;

@RestController
public class MyController {
	
	@Autowired
	productService products1;
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	@PostMapping("/add")
	public ResponseEntity insertData(@RequestBody TraineeDetails details) {
		products1.addTrainee(details);
		return new ResponseEntity(HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity updateData(@RequestBody TraineeDetails details) {
		products1.updateTrainee(details);
		return new ResponseEntity(HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity deleteData(@RequestBody int pId) {
		products1.deleteTrainee(pId);
		return new ResponseEntity(HttpStatus.OK);
		
	}
	@GetMapping("/getById")
	public ResponseEntity getByPid(@RequestBody int pId) {
		TraineeDetails details=products1.getByPid(pId);
		if(details==null) {
			throw new UserNotFoundException("user not found "+pId);
		}
		else
			return new ResponseEntity("success",HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ArrayList<TraineeDetails> getAllProducts(){
		ArrayList<TraineeDetails> products = products1.getAll();
		return products;
	}
}
