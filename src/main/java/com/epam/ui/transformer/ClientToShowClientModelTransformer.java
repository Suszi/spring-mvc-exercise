package com.epam.ui.transformer;

import org.springframework.stereotype.Component;

import com.epam.backend.domain.Client;
import com.epam.backend.service.ClientNotFoundException;
import com.epam.ui.view.ShowClientModel;
import com.epam.ui.view.UrlConstants;

@Component
public class ClientToShowClientModelTransformer {

	public ShowClientModel transform(Client client) throws ClientNotFoundException {
		if (client == null) {
			throw new ClientNotFoundException();
		}
		
		ShowClientModel showClientModel = new ShowClientModel();
		showClientModel.setId(client.getId());
		showClientModel.setName(client.getName());
		showClientModel.setPictureUrl(UrlConstants.showPicture(client.getId()));
		showClientModel.setBackUrl(UrlConstants.LIST_CLIENTS);
		return showClientModel;
	}
}