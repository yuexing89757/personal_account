package com.zzy.webapi.api;

import java.util.List;

import com.zzy.anotation.ApiPath;
import com.zzy.biz.IEventBiz;
import com.zzy.biz.impl.EventBizImpl;
import com.zzy.model.Event;
import com.zzy.util.Log;
import com.zzy.util.Paging;
import com.zzy.webapi.ApiRequest;
import com.zzy.webapi.ApiResult;
import com.zzy.webapi.ApiService;
import com.zzy.webapi.ApiUser;


public class EventApi extends BaseWebApi implements ApiService{
	private static Log log = Log.getLogger(EventApi.class);
	
	@ApiPath("/event/select")     //获取全部商品
	public static ApiResult selectEvent(ApiRequest request, ApiUser user) {
		IEventBiz eventBiz = new EventBizImpl();
		Paging paging = getPaging(request);
		List<Event> list = eventBiz.findEvent(paging);
		return getResult(list);
	}
	

}
