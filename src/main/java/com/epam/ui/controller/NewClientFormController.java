package com.epam.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epam.backend.service.BankService;
import com.epam.ui.transformer.NewClientRequestToClientTransformer;
import com.epam.ui.view.NewClientRequestModel;
import com.epam.ui.view.UrlConstants;

@Controller
public class NewClientFormController {
	
	@ModelAttribute
	public NewClientRequestModel newClientRequestModel() {
		return new NewClientRequestModel();
	}

	@RequestMapping(value = UrlConstants.NEW_CLIENT, method = RequestMethod.GET)
	public String newClient() {
		return "newClient";
	}
}