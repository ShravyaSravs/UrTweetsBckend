package com.niit.dao;

import com.niit.model.Event;

public interface EventDAO {

	public boolean saveOrUpdate(Event event);
	public boolean delete(Event event);
}
