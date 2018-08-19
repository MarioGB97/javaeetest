package com.hamp.javaee.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.hamp.javaee.dao.IPersonDAO;
import com.hamp.javaee.model.Person;

@Named
public class PersonDAO implements IPersonDAO,Serializable {

	
	private static final long serialVersionUID = 1L;

	@Override
	public List<Person> findAll() {
		List<Person> lista = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Person per = new Person();
			per.setIdPerson(i);
			per.setName("Henry Antonio");
			per.setLastName("Mendoza Puerta");
			per.setAge(38);
			lista.add(per);
		}

		return lista;
	}

}
