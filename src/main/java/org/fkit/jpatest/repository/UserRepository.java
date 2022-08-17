package org.fkit.jpatest.repository;

import java.util.List;

import org.fkit.jpatest.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface UserRepository extends  CrudRepository<User, Long> {
	
	
	List<User> findByName(String name);
	
	List<User> findByEmailAndName(String email,String name);
	
	@Query(value="select t from User t where t.name like %?1%")
	List<User> findByNameLike(String name);
	
	
	
	
	
	

}
