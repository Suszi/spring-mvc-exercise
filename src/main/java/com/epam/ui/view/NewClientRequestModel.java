package com.epam.ui.view;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class NewClientRequestModel {

	@NotNull
	@NotBlank
	@Size(min = 5, max = 14)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}