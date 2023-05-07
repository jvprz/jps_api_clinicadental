package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Client;
import com.example.demo.dto.Odontologist;
import com.example.demo.dto.Visit;
import com.example.demo.service.ClientService;
import com.example.demo.service.OdontologistService;
import com.example.demo.service.VisitService;

@RestController
@RequestMapping("/api")
public class ClientController {

	@Autowired
	ClientService clientService;
	
	@Autowired
	OdontologistService odontologistService;
	
	@Autowired
	VisitService visitService;
	
	@GetMapping("/client")
	public List<Client> listClients() {
		return clientService.listClients();
	}
	
	@GetMapping("/client/{id}")
	public Client clientById(@PathVariable(name = "id") Long id) {
		return clientService.clientById(id);
	}
	
	//Get list of odontologists for client
	@GetMapping("/client/odontologist")
	public List<Odontologist> lisOdontologists() {
		return odontologistService.listOdontologists();
	}
	
	//Get list of visits for client
	@GetMapping("/client/{clientId}/visit")
	public List<Visit> liVisits(@PathVariable(name = "clientId") Long clientId) {
		return visitService.listVisitsByClientId(clientId);
	}
	
	@PostMapping("/client")
	public Client saveClient(@RequestBody Client client) {
		return clientService.saveClient(client);
	}
	
	@PutMapping("/client/{id}")
	public Client updateClient(@PathVariable(name = "id") Long id, @RequestBody Client client) {
		Client selectedClient = new Client(id, client.getDni(), client.getNames(), client.getPhone(), client.getEmail());
		return clientService.updateClient(selectedClient);
	}
	
	@DeleteMapping("/client/{id}")
	public void deleteClient(@PathVariable(name = "id") Long id) {
		clientService.deleteClient(id);
	}
}
