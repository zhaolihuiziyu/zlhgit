package org.fkit.jpatest.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.fkit.jpatest.config.NotFoundException;
import org.fkit.jpatest.domain.User;
import org.fkit.jpatest.repository.UserPagingAndSortingRepository;
import org.fkit.jpatest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping(path="/demo")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserPagingAndSortingRepository  userPagingAndSortingRepository;
	
	@GetMapping(path="/add")
	public void addNewUser(@RequestParam String name,@RequestParam String email){
			User n=new User();
			n.setName(name);
			n.setEmail(email);
			userRepository.save(n);
	}
	
	@GetMapping(path="/all")
	@ResponseBody
	public Iterable<User> getAllUser(){
		return userRepository.findAll();
	}
	
	@GetMapping(path="/findbyname")
	@ResponseBody
	public Iterable<User> findbyname(@RequestParam String name){
		return userRepository.findByName(name);
	}
	
	@GetMapping(path="/findbyemailandname")
	@ResponseBody
	public Iterable<User> findbyemailandname(@RequestParam String email,@RequestParam String name){
		return userRepository.findByEmailAndName(email, name);
	}
	
	@GetMapping(path="/info")
	@ResponseBody
	public User findOne(@RequestParam Long id){
		Optional<User> ouser= userRepository.findById(id);
		if(ouser.isPresent()){
			return ouser.get();
		}
		return null;
	}
	
	@GetMapping(path="/delete")
	@ResponseBody
	public int delete(@RequestParam Long id){
		userRepository.deleteById(id);
		return 1;
	}
	
	@GetMapping(path="/page")
	@ResponseBody
	public Page<User> getAllUserByPage(){
		PageRequest  request=PageRequest.of(0, 2, Sort.by(Sort.Direction.ASC, "name"));
		return userPagingAndSortingRepository.findAll(request);

	}
	
	@GetMapping(path="/sort")
	@ResponseBody
	public Iterable<User> getAllUserBySort(){
		return userPagingAndSortingRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
	}
	
	

	
	@GetMapping(path="/findbynamelike")
	public List<User> findbynameLike(@RequestParam String name){
		return userRepository.findByNameLike(name);
	}
	
	
	@GetMapping(path="/showUsers")
	public String showUsers(Model model){
		Iterable<User> it= userRepository.findAll();
		Iterator<User>		list=		it.iterator();
		
		if(list!=null){
			model.addAttribute("users", list);
		} 
		 return "showUsers";
	}
	
	
	@RequestMapping(value="/saveUser",method=RequestMethod.POST)
	public String saveUser(User user){
		
		userRepository.save(user);
		 return "redirect:/demo/showUsers";
	}
	
	
	
	
	@GetMapping("/test1")
	 public String test404(Model model){
	    String a = null;
	    if(a == null) {
	        throw new NotFoundException();
	    }
	    System.out.println(a.toString());
	    return "showUsers";
	  }
	
	@GetMapping("/test2")
	 public String test500(Model model){
	    String a = null;
	    System.out.println(a.toString());
	    return "showUsers";
	  }

}
