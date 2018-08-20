package com.hamp.javaee.dao.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.hamp.javaee.dao.Conexion;
import com.hamp.javaee.dao.IPersonDAO;
import com.hamp.javaee.model.Person;

@Named
public class PersonDAO implements IPersonDAO, Serializable {

	private static final long serialVersionUID = 1L;

	private Connection cx;

	public PersonDAO() {
		cx = Conexion.conectar();
	}

	@Override
	public List<Person> findAll() {
		List<Person> lista = new ArrayList<>();
		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Person");
			while (resultSet.next()) {
				Person person = new Person();
				person.setIdPerson(resultSet.getInt("idPerson"));
				person.setName(resultSet.getString("name"));
				person.setLastName(resultSet.getString("lastName"));
				person.setAge(resultSet.getInt("age"));
				lista.add(person);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

}
