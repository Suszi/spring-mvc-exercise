package com.epam.ui.view;

public class ClientDto {
	private long id;
	private String name;
	private String viewUrl;

	public ClientDto(long id, String name, String viewUrl) {
		super();
		this.id = id;
		this.name = name;
		this.viewUrl = viewUrl;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getViewUrl() {
		return viewUrl;
	}

}