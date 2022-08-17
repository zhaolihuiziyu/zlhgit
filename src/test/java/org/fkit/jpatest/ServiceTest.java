package org.fkit.jpatest;

import java.util.Iterator;

import org.fkit.jpatest.domain.User;
import org.fkit.jpatest.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=App.class)
@TestPropertySource(locations="classpath:application.properties")
//@ActiveProfiles("dev")
public class ServiceTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testFindName(){
		Iterable<User> it=userService.getUserListByName("aaa");
		Iterator<User> list=  it.iterator();
		while(list.hasNext()){
			User user=list.next();
			System.out.println("name:"+user.getName()+",email:"+user.getEmail());
		}
	}

}
