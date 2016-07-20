package com.epam.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.epam.backend.service.BankService;
import com.epam.ui.view.UrlConstants;

@Controller
public class LoginController {

	private BankService bankService;

	@Autowired
	public LoginController(BankService bankService) {
		super();
		this.bankService = bankService;
	}

	@RequestMapping(value = UrlConstants.LOGIN, method = RequestMethod.GET)
	public String login(@RequestParam(value = "login_error", required = false) Long errorCode) {
		if (errorCode != null && errorCode == 1) {
			return "loginFailed";
		}
		
		return "login";
	}
}