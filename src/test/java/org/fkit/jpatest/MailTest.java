package org.fkit.jpatest;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {
	@Autowired
	private JavaMailSender javaMailSender;
	@Test
	public void sendTest(){
		SimpleMailMessage message=new SimpleMailMessage();
		message.setSubject("这是一封测试邮件");
		message.setFrom("zhaol_h@163.com");
		message.setTo("1005027126@qq.com");
		message.setSentDate(new Date());
		message.setText("这是测试邮件正文内容");
		javaMailSender.send(message);
	}
	

}
