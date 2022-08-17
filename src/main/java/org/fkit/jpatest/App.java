package org.fkit.jpatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ServletComponentScan(basePackages="org.fkit.jpatest.*")  //启动监听器
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
