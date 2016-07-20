package com.epam.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.AbstractResource;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.epam.backend.service.BankService;
import com.epam.backend.service.ClientNotFoundException;
import com.epam.ui.view.UrlConstants;

@Controller
public class PictureController {

	private BankService bankService;

	@Autowired
	public PictureController(BankService bankService) {
		super();
		this.bankService = bankService;
	}

	@RequestMapping(value = UrlConstants.SHOW_PICTURE, method = RequestMethod.GET)
	public @ResponseBody AbstractResource showPicture(long id, BindingResult errors) throws ClientNotFoundException {
		System.out.println("%%%%%%%%%%%%%%%"+errors.hasErrors());
		return new ByteArrayResource(bankService.findClientById(id).getPicture());
	}
}