package com.hamp.javaee.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.hamp.javaee.dao.IPersonDAO;
import com.hamp.javaee.model.Person;
import com.hamp.javaee.service.IPersonService;

@Named
public class PersonService implements IPersonService, Serializable{


	private static final long serialVersionUID = 1L;
	@Inject
	private IPersonDAO pdao;

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return pdao.findAll();
	}

}
