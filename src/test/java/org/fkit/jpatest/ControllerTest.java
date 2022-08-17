package org.fkit.jpatest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={App.class,MockServletContext.class})
public class ControllerTest {
	
	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext webApplicationContext; 
	@Before
	public void setUp(){
		mockMvc=MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void getUserByName(){
		
		try {
			MvcResult mvcResult=mockMvc.perform(MockMvcRequestBuilders.get("/demo/findbyname").param("name", "aaa")).andReturn();
			
			System.out.println(mvcResult.getResponse().getContentAsString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
