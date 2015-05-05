package com.zzy.biz.impl;

import java.util.List;

import com.zzy.biz.IEventBiz;
import com.zzy.dao.EventDao;
import com.zzy.dao.impl.EventDaoImpl;
import com.zzy.model.Event;
import com.zzy.util.Paging;



public class EventBizImpl implements IEventBiz{

	EventDao  eventDao=null;
	
	
	public EventBizImpl() {
		super();
		eventDao=new EventDaoImpl();
		
	}


	public List<Event> findEvent(Paging paging) {
		return eventDao.findByPage(paging);
	}


}
