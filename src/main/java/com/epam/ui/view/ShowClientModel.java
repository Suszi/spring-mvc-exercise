package com.epam.ui.view;

public class ShowClientModel {
	private Long id;
	private String name;
	private String backUrl;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBackUrl() {
		return backUrl;
	}

	public ShowClientModel(Long id, String name, String backUrl) {
		super();
		this.id = id;
		this.name = name;
		this.backUrl = backUrl;
	}
}
