package com.webapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.model.Category;
import com.webapp.repositroy.CategoryRepository;
import com.webapp.service.categoryService;

@Service
public class CategoryServiceImpl implements categoryService {

	@Autowired
	CategoryRepository res;

	@Override
	public List<Category> getAllData() {
		// TODO Auto-generated method stub
		return res.findAll();
	}

	@Override
	public Category saveData(Category cat) {
		// TODO Auto-generated method stub
		return res.save(cat);
	}

	@Override
	public void deleteData(long cId) {

		res.deleteById(cId);

	}

	@Override
	public Category updateData(long cId, Category cat) {

		cat.setcId(cId);

		return res.save(cat);
	}

}
