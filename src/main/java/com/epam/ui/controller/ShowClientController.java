package com.epam.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epam.backend.service.BankService;
import com.epam.backend.service.ClientNotFoundException;
import com.epam.ui.transformer.ClientToShowClientModelTransformer;
import com.epam.ui.view.ShowClientModel;
import com.epam.ui.view.UrlConstants;

@Controller
public class ShowClientController {
	private BankService bankService;

	private ClientToShowClientModelTransformer transformer;

	@Autowired
	public ShowClientController(BankService bankService, ClientToShowClientModelTransformer transformer) {
		super();
		this.bankService = bankService;
		this.transformer = transformer;
	}

	@ModelAttribute
	public ShowClientModel showClientModel(Long id) throws ClientNotFoundException {
		return transformer.transform(bankService.findClientById(id));
	}

	@RequestMapping(value = UrlConstants.SHOW_CLIENT, method = RequestMethod.GET)
	public String showClient() {
		return "showClient";
	}
}
