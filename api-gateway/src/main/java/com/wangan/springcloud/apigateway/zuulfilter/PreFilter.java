package com.wangan.springcloud.apigateway.zuulfilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;


/**
 * @author wangan on 2018/7/23
 * @description
 */
public class PreFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		String accessToken = request.getParameter("accessToken");
		System.out.println("uri="+request.getRequestURI());
		System.out.println("url="+request.getRequestURL());
		if(accessToken==null){
			ctx.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
			ctx.setSendZuulResponse(false);
		}
		return null;
	}
}
