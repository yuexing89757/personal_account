package com.zzy.dao;

import java.util.List;

import com.zzy.model.Event;
import com.zzy.util.Paging;



public interface EventDao {
	public List<Event> findByPage(Paging paging);

}
