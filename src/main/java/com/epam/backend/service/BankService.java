package com.epam.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.backend.dao.ClientRepository;
import com.epam.backend.domain.Client;

@Service
public class BankService {
	private ClientRepository clientRepository;

	@Autowired
	public BankService(ClientRepository clientRepository) {
		super();
		this.clientRepository = clientRepository;
	}

	public Iterable<Client> listClients() {
		return clientRepository.findAll();
	}

	public void saveClient(Client client){
		clientRepository.save(client);
	}

	public Client findClientById(Long id) {
		return clientRepository.findOne(id);
	}
}