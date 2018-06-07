package edu.mum.preparation.midexam.SpringHelloWorldWebMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;

	@Override
	public List<EmployeeVO> getAllEmployees() {
		return dao.getAllEmployees();
	}

}
