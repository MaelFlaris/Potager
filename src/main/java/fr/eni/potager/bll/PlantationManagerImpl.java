package fr.eni.potager.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.potager.bo.Plantation;
import fr.eni.potager.dal.PlantationDOA;

/**
 * BLL- ObjetManagerImpl -  alimlente les m�thodes de l'interface
 * @author Ma�l
 *
 */
@Service
public class PlantationManagerImpl implements PlantationManager{

	@Autowired
	PlantationDOA dao;
	
	
	@Override
	public void addPLantation(Plantation plantation) {
		dao.save(plantation);
	}

	@Override
	public void deletePlantation(Plantation plantation) {
		dao.delete(plantation);
	}

	@Override
	public void listAllPlantation() {
		dao.findAll();
		
	}

}
