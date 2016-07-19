package com.epam.backend.dao;

import org.springframework.data.repository.CrudRepository;

import com.epam.backend.domain.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {

}