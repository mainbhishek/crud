package com.webapp.service;

import java.util.List;

import com.webapp.model.Category;

public interface categoryService {

	

	List<Category> getAllData();

	Category saveData(Category cat);

	void deleteData(long cId);

	Category updateData(long cId, Category cat);

	

}
