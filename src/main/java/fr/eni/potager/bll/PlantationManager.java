package fr.eni.potager.bll;

import fr.eni.potager.bo.Plantation;

/**
 * Bll - ObjetManager - permet de d�finir les m�thodes d'un objets
 * @author Ma�l
 *
 */
public interface PlantationManager {
	
	void addPLantation(Plantation plantation);
	void deletePlantation(Plantation plantation);
	void listAllPlantation();

}
