package com.epam.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.epam.backend.domain.Client;
import com.epam.backend.service.BankService;
import com.epam.ui.view.UrlConstants;

@RestController
public class RestClientController {
	private BankService bankService;

	@Autowired
	public RestClientController(BankService bankService) {
		super();
		this.bankService = bankService;
	}

	@RequestMapping(value = UrlConstants.REST, method = RequestMethod.GET)
	public Iterable<Client> listClientsRest() {
		return bankService.listClients();
	}
}