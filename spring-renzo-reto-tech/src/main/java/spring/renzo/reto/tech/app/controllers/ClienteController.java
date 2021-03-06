package spring.renzo.reto.tech.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.renzo.reto.tech.app.models.ClienteDTO;
import spring.renzo.reto.tech.app.repositories.ClienteDAO;

@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	private ClienteDAO repository;
	
	@PostMapping("/cliente")
	public ClienteDTO create(@Validated @RequestBody ClienteDTO c) {
		return repository.insert(c);
	}
	
	@GetMapping("/cliente")
	public List<ClienteDTO> readAll(){
		return repository.findAll();
	}
	
	
	
}
