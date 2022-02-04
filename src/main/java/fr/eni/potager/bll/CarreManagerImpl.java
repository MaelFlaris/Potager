package fr.eni.potager.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.potager.bo.Carre;
import fr.eni.potager.bo.Potager;
import fr.eni.potager.dal.CarreDAO;

/**
 * BLL- ObjetManagerImpl -  alimlente les méthodes de l'interface
 * @author Maël
 *
 */
@Service
public class CarreManagerImpl implements CarreManager{

	@Autowired
	CarreDAO dao;
	
	@Override
	public void addCarre(Carre carre, Potager potager) {
		carre.setPotager(potager);
		dao.save(carre);
		potager.getLstCarres().add(carre);
		

	}

	@Override
	public void deleteCarre(Carre carre) {
		dao.delete(carre);
	}

	@Override
	public List<Carre> getAllCarre() {
		return (List<Carre>) dao.findAll();
	}

}
