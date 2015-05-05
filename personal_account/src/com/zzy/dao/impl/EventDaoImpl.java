package com.zzy.dao.impl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import com.zzy.dao.EventDao;
import com.zzy.dao.impl.hibernate.GenericHbmDAO;
import com.zzy.model.Event;
import com.zzy.util.Paging;


public class EventDaoImpl extends GenericHbmDAO<Event, Long> implements EventDao {

	public List<Event> findByPage(Paging paging) {
	     Criteria criteria = this.createCriteria();
		 if (paging != null) {
			paging.setTotalRecord(getTotalRecords(criteria));
			criteria.setProjection(null);
			criteria.setResultTransformer(CriteriaSpecification.ROOT_ENTITY);
			criteria.setFirstResult(paging.getCurrentRecord()).setMaxResults(paging.getPageSize());
		}
		return criteria.list();
	}

}
