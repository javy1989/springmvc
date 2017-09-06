package com.spring.real.component;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.spring.real.repository.LogRepository;

@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	@Qualifier("logRepository")
	private LogRepository logRepository;
	
	private static final Log LOG = LogFactory.getLog(RequestTimeInterceptor.class);

	// PRIMERO
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		request.setAttribute("startTime", System.currentTimeMillis());
		return true;
	}

	// SEGUNDO
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long startTime=(long)request.getAttribute("startTime");
		String url=request.getRequestURL().toString();
		LOG.info("URL to:'"+url+"' in :'"+(System.currentTimeMillis()-startTime)+"'ms");
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		String username="";
		if (auth!=null && auth.isAuthenticated()) {
			username=auth.getName();
		}
		com.spring.real.entity.Log log =new com.spring.real.entity.Log();
		log.setUrl(url);
		log.setDate(Calendar.getInstance().getTime());
		log.setUsername(username);
		log.setDetails(auth.getDetails().toString());
		
		logRepository.save(log);
		
	}

}
