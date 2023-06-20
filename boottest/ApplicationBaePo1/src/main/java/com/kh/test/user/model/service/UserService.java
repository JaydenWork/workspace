package com.kh.test.user.model.service;

import org.springframework.stereotype.Service;

import com.kh.test.user.model.vo.User;

@Service
public interface UserService {

	public User searchUser(String userId);
	
	

}
