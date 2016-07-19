package com.epam.ui.transformer;

import org.springframework.stereotype.Component;

import com.epam.backend.domain.Client;
import com.epam.ui.view.ShowClientModel;
import com.epam.ui.view.UrlConstants;

@Component
public class ClientToShowClientModelTransformer {

	public ShowClientModel transform(Client client) {
		ShowClientModel showClientModel = new ShowClientModel(client.getId(), client.getName(),
				UrlConstants.LIST_CLIENTS);
		return showClientModel;
	}
}