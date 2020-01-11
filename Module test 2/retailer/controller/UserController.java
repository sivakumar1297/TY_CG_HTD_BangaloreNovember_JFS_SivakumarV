package com.capgrmini.retailer.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgrmini.retailer.dto.UserInfo;
import com.capgrmini.retailer.dto.UserInfoResponse;
import com.capgrmini.retailer.service.UserService;
@CrossOrigin
@RestController
public class UserController {
	
	
	@Autowired
	private UserService service;

	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse login(@RequestBody UserInfo info) {
		UserInfo user = service.login(info);
		UserInfoResponse userInfoResponse = new UserInfoResponse();
		if (user != null) {
			userInfoResponse.setStatusCode(201);
			userInfoResponse.setMessage("Success");
			userInfoResponse.setDescription("Login Success");
			userInfoResponse.setAccount(Arrays.asList(user));
		} 
		return userInfoResponse;

	}

	@PostMapping(path = "/signup", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse signup(@RequestBody UserInfo info) {
		UserInfoResponse userInfoResponse = new UserInfoResponse();
		if (service.signup(info)) {
			userInfoResponse.setStatusCode(201);
			userInfoResponse.setMessage("Success");
			userInfoResponse.setDescription("User Siggned In");

		}
		return userInfoResponse;

	}



	@PutMapping(path = "/change-password", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse changePassword(@RequestBody UserInfo info) {

		UserInfoResponse userInfoResponse = new UserInfoResponse();
		if (service.changePassword(info.getId(),info.getPassword())) {
			userInfoResponse.setStatusCode(201);
			userInfoResponse.setMessage("success");
			userInfoResponse.setDescription("password changed");
		} else {
			userInfoResponse.setStatusCode(401);
			userInfoResponse.setMessage("failure");
			userInfoResponse.setDescription("not changed");
		}
		return userInfoResponse;

	}

}
