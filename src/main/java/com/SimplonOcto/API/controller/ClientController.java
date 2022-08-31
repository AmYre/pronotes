package com.SimplonOcto.API.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SimplonOcto.API.model.Client;
import com.SimplonOcto.API.service.ClientService;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService cls;

	@GetMapping("/clients")
	public Iterable<Client> getClients(){
		return cls.getAllClients();
	}
	
	@GetMapping("/client/{id}")
	public Optional<Client> getClient(@PathVariable("id") String id){
		return cls.getClient(id);
	}
}