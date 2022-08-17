package org.fkit.jpatest.repository;

import org.fkit.jpatest.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserPagingAndSortingRepository extends PagingAndSortingRepository<User, Long> {

}
