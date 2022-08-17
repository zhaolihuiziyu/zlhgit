package org.fkit.jpatest.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.fkit.jpatest.repository.UserRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//@WebListener  //此时无法注入service组件
@Component
public class UserListener implements ServletContextListener {
	
//	Logger logger=LogManager.getLogger(UserListener.class);
	
//	private static final Logger logger=LoggerFactory.getLogger(UserListener.class.getName());
	
//	@Autowired
//	private RedisTemplate redisTemplate;

	@Autowired
	private UserRepository userRepository;

	private static final String ALL_USER="ALL_USER_LIST";
	
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
/*		Iterable<User> list=userRepository.findAll();
		
		List<User> userlist  =IteratorUtils.toList(list.iterator());   
		
		redisTemplate.delete(ALL_USER);
		//
		redisTemplate.opsForList().leftPushAll(ALL_USER, userlist);
		
		List<User> arr=redisTemplate.opsForList().range(ALL_USER, 0, -1);
		System.out.println("初始化缓存用户数："+arr.size());*/


		
		System.out.println("初始化=================================");
//		logger.info("servletContext上下文初始化");
//		
//		logger.info("servletContext上下文初始化");
		
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext上下文销毁");
	}
	

}
