package com.homeloan.homeloan.loginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.homeloan.loginDomain.Login;
import com.homeloan.homeloan.loginRepo.LoginRepository;
 
 
 
 
@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repo;
  
  public Login login(String username, String password) {
	  Login user = repo.findByUsernameAndPassword(username, password);
  	return user;
  }
	
 

}