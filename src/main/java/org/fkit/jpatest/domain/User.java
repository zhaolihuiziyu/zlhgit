package org.fkit.jpatest.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 create table `user`(
	`id` int(11) not null auto_increment,
	`name` varchar(50) default null,
	`email` varchar(200) default null,
	PRIMARY KEY (`id`)
);
 * @author DELL
 *
 */
@Entity
public class User  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4539434176350809459L;
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
