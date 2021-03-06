package com.epam.ui.transformer;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.epam.backend.domain.Client;
import com.epam.ui.view.NewClientRequestModel;

@Component
public class NewClientRequestToClientTransformer {

	public Client transform(NewClientRequestModel newClient) {
		Client client = new Client();
		client.setName(newClient.getName());
		try {
			client.setPicture(newClient.getPicture().getBytes());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return client;
	}
}