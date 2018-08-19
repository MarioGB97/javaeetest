package com.hamp.javaee.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class IndexController implements Serializable {

	private static final long serialVersionUID = 1L;

	public String login() {
		String redireccion = null;
		try {

			redireccion = "/protegido/persons?faces-redirect=true";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return redireccion;
	}

}
