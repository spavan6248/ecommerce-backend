package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ecommerce.entity.User;

public interface UserRepo extends JpaRepository<User,Long>{

   public User findByUserName(String userName);
	

}
