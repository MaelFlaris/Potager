package fr.eni.potager.ws;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.potager.bll.PotagerManager;
import fr.eni.potager.bo.Potager;

@RestController
public class PotagerWS { 
	@Autowired
	PotagerManager potager;

	@GetMapping("/potager/{id}")
	public Optional<Potager> getPotagerById(@PathVariable("id") Integer id) {
		return potager.getPotagerById(id);
		
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Bonjour ";
	}

}
