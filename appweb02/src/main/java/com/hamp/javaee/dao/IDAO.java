package com.hamp.javaee.dao;

import java.util.List;

public interface IDAO<T> {
	List<T> findAll();
}
