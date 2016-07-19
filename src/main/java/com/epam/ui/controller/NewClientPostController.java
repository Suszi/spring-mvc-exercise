package com.epam.ui.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epam.backend.service.BankService;
import com.epam.ui.transformer.NewClientRequestToClientTransformer;
import com.epam.ui.view.NewClientRequestModel;
import com.epam.ui.view.UrlConstants;

@Controller
public class NewClientPostController {

	private BankService bankService;

	private NewClientRequestToClientTransformer transformer;

	@Autowired
	public NewClientPostController(BankService bankService, NewClientRequestToClientTransformer transformer) {
		super();
		this.bankService = bankService;
		this.transformer = transformer;
	}
	
	@ModelAttribute
	public void process(@Valid NewClientRequestModel newClientRequestModel, BindingResult errors) {
		if (!errors.hasErrors()) {
			bankService.saveClient(transformer.transform(newClientRequestModel));
		}
	}

	@RequestMapping(value = UrlConstants.NEW_CLIENT_POST, method = RequestMethod.POST)
	public String newClient(@Valid NewClientRequestModel newClientRequestModel, BindingResult errors) {
		System.out.println("Van hiba? " + (errors.hasErrors() ? "van" : "nincs"));
		if (errors.hasErrors()) {
			return "newClient";
		}
		return "redirect:" + UrlConstants.LIST_CLIENTS;
	}
}