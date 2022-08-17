package org.fkit.jpatest;

import java.util.List;

import org.fkit.jpatest.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=App.class)
@WebAppConfiguration  //启动web容器，测试监听器
@TestPropertySource(locations="classpath:application.properties")
public class RedisTest {
	
//	@Autowired
//	private RedisTemplate redisTemplate;
//	@Autowired
//	private StringRedisTemplate stringRedisTemplate;
	
	@Test
	public void testRedis(){
//		redisTemplate.opsForValue().set("name", "ay");
//		String name=(String)redisTemplate.opsForValue().get("name");
//		
//		System.out.println(name);
//		
//		redisTemplate.delete("name");
//		redisTemplate.opsForValue().set("name", "al");
//		name=stringRedisTemplate.opsForValue().get("name");
//		
//		System.out.println(name);
		

		
//		List<User> arr=redisTemplate.opsForList().range("ALL_USER_LIST", 0, -1);
//		System.out.println(arr.size());
		

	}
	

}
