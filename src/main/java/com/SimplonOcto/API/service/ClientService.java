package com.SimplonOcto.API.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimplonOcto.API.model.Client;
import com.SimplonOcto.API.model.ClientRepository;

import lombok.Data;

@Data
@Service
public class ClientService {
	@Autowired
	private ClientRepository cr;
	
	public Optional<Client> getClient(final String id) {
		return cr.findById(id);
	}
	
	public Iterable<Client> getAllClients(){
		return cr.findAll();
	}
	
	public void deleteClient(final String id) {
		cr.deleteById(id);
	}
	
	public void insertClient(Client client) {
		cr.save(client);
	}
}
