package fr.eni.potager.bll;

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

}
