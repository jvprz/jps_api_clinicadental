package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClientDAO;
import com.example.demo.dto.Client;

@Service
public class ClientService {

	@Autowired
	ClientDAO clientDAO;
	
	// CRUD
	public List<Client> listClients() {
		return clientDAO.findAll();
	}
	
	public Client saveClient(Client client) {
		return clientDAO.save(client);
	}
	
	public Client clientById(Long id) {
		return clientDAO.findById(id).get();
	}
	
	public Client updateClient(Client client) {
		return clientDAO.save(client);
	}
	
	public void deleteClient(Long id) {
		clientDAO.deleteById(id);
	}
}
