package fr.eni.potager.bll;

import java.util.List;

import com.eni.cours.biere.bo.Biere;

import fr.eni.potager.bo.Plantation;

/**
 * Bll - ObjetManager - permet de définir les méthodes d'un objets
 * @author Maël
 *
 */
public interface PlantationManager {
	
	void addPLantation(Plantation plantation);
	void deletePlantation(Plantation plantation);
	void listAllPlantation();
	public Biere getPotagerFromId(Integer id);
	public Biere getOne(Integer integer);
	public List<Potager> getAll();
}
