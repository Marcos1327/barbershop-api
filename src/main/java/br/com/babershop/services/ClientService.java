package br.com.babershop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.babershop.model.Client;
import br.com.babershop.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	public Client create(Client client) {
		
		client.setId(null);
		client.setName(client.getName());
		client.setNumberPhone(client.getNumberPhone());
		
		clientRepository.save(client);
		
		return client;
	}
	
	public void delete(Long id) throws Exception {
		
		clientRepository.findById(id).orElseThrow(() -> new Exception("Client not found"));
		clientRepository.deleteById(id);
		
	}
	
	

}
