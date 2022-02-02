package fr.eni.potager.bll;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.potager.bo.Carre;
import fr.eni.potager.bo.Plantation;
import fr.eni.potager.bo.Plante;
import fr.eni.potager.dal.PlanteDAO;

@Service
public class PlanteManagerImpl implements PlanteManager{

	@Autowired
	PlanteDAO dao;
	
	@Override
	public void addPlante(Plante plante) {
		dao.save(plante);
	}

	@Override
	public void deletePlante(Plante plante) {
		dao.delete(plante);
	}

	@Override
	public List<Plante> getAllPlante() {
		return (List<Plante>) getAllPlante();
	}

	@Override
	public List<Plantation> getLocPlante(Plante plante) {
		return dao.getLocPlante(plante);
	}
	



}
