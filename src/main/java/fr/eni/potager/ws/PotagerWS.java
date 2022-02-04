package fr.eni.potager.ws;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.eni.cours.biere.bo.Biere;

import fr.eni.potager.bll.PotagerManager;
import fr.eni.potager.bo.Potager;

//Pour définir restcontroller
@RestController
public class PotagerWS { 
	@Autowired
	PotagerManager manager;

	//Déclaration des micro services 
	@GetMapping("/potager/{id}")
	public Optional<Potager> getPotagerById(@PathVariable("id") Integer id) {
		return manager.getPotagerById(id);
		
	}
	
	@GetMapping("/potager")
	public List<Potager> getAll(){
		return manager.getAll();
	}
	
	@GetMapping("/potager/{id}")
	public Potager getOne(@PathVariable("id") Integer id){
		return manager.getPotagerFromId(id);
	}
}
