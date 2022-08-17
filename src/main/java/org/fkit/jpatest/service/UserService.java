package org.fkit.jpatest.service;

import org.fkit.jpatest.domain.User;


public interface UserService {
	
/*	@GetMapping(path="/findbyname")
	@ResponseBody
	public Iterable<User> findbyname(@RequestParam String name){
		return userRepository.findByName(name);
	}
	*/
	
	Iterable<User>  getUserListByName(String name);
	
	
	

}
