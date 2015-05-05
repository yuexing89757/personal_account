/**    
 * Project name:ads-emaila1
 *
 * Copyright Pzoomtech.com 2011, All Rights Reserved.
 *  
 */
package com.zzy.webapi.api.test;

import org.junit.Test;

import com.zzy.webapi.api.EmailApi;
import com.zzy.webapi.api.EventApi;


public class TestEventApi extends WebSendMailTest<EventApi> {


	@Test
	public void testSelectEvent() { // 获取全部news
		this.setUp(this.getUrl("/event/select"));
		this.addParam("iDisplayStart", 0);
		this.addParam("iDisplayLength", 20);
		this.testResonse(this.createApiRequest());
	}
}
