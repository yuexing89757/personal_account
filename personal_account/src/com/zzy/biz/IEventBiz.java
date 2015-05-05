/**    
 * Project name:ads-mail
 *
 * Copyright Pzoomtech.com 2011, All Rights Reserved.
 *  
 */
package com.zzy.biz;

import java.util.List;

import com.zzy.enums.NewsType;
import com.zzy.model.Event;
import com.zzy.util.Paging;





public interface IEventBiz{
	public List<Event> findEvent(Paging paging);
}
