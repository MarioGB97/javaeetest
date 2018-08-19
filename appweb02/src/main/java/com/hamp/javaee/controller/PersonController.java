package com.hamp.javaee.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.hamp.javaee.model.Person;
import com.hamp.javaee.service.IPersonService;


import java.io.Serializable;

@Named
@ViewScoped
public class PersonController implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private List<Person> listPersons;
	private Person person;

	@Inject
	private IPersonService pService;

	public PersonController() {
		listPersons = new ArrayList<>();

	}

	@PostConstruct
	public void init() {
		this.findAdll();
	}

	public void findAdll() {
		this.listPersons = pService.findAll();
	}
	
	public void showPerson(Person per) {
		this.person = per;
	}

	public List<Person> getListPersons() {
		return listPersons;
	}

	public void setListPersons(List<Person> listPersons) {
		this.listPersons = listPersons;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
