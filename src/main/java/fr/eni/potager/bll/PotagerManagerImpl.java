package fr.eni.potager.bll;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.potager.bo.Potager;
import fr.eni.potager.dal.PotagerDAO;

@Service
public class PotagerManagerImpl implements PotagerManager {

	@Autowired
	PotagerDAO dao;
	
	@Override
	public void addPotager(Potager potager) {
		dao.save(potager);
		System.out.println("Potager ajouté");
	}

	@Override
	public void deletePotager(Potager potager) {
		dao.delete(potager);
		
	}

	@Override
	public List<Potager> getAllPotager() {
		return (List<Potager>) dao.findAll();
	}

	@Override
	public Optional<Potager> getPotagerById(Integer id) {
		return dao.findById(id);
	}

}
