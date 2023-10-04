package br.com.babershop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.babershop.model.Client;
import br.com.babershop.services.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@PostMapping
	private	ResponseEntity<Client> create(@RequestBody Client client) {
		return ResponseEntity.ok().body(clientService.create(client));
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<Void> delete(@PathVariable Long id) throws Exception {
		clientService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	private ResponseEntity<List<Client>> getAllClient() {
		return ResponseEntity.ok(clientService.getAllClients());
	}

}
