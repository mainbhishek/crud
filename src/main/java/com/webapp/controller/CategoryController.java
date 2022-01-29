package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.model.Category;
import com.webapp.service.categoryService;

@RestController
public class CategoryController {

	@Autowired
	categoryService ser;

	@GetMapping("/getData")
	public ResponseEntity<List<Category>> getAllData() {

		return new ResponseEntity<List<Category>>(ser.getAllData(), HttpStatus.OK);
	}

	@PostMapping("/saveData")
	public ResponseEntity<Category> saveData(@RequestBody Category cat) {

		return new ResponseEntity<Category>(ser.saveData(cat), HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/deleteData/{cId}")
	public void  deleteData(@PathVariable long cId){
		
		
		ser.deleteData(cId);
		
		
	}
	
	
	@PutMapping("/updateData/{cId}")
	public ResponseEntity<Category> updateAll(@PathVariable long cId,@RequestBody Category cat){
		
		
		return new ResponseEntity<Category>(ser.updateData(cId,cat),HttpStatus.OK);
		
	}
	
	
	
	

}
