package com.epam.ui.view;

public class ListClientsModel {
	private Iterable<ClientDto> clients;

	private String newClientUrl;

	public Iterable<ClientDto> getClients() {
		return this.clients;
	}

	public String getNewClientUrl() {
		return this.newClientUrl;
	}

	public ListClientsModel(Iterable<ClientDto> clients, String newClientUrl) {
		super();
		this.clients = clients;
		this.newClientUrl = newClientUrl;
	}
}