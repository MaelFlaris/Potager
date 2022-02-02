package fr.eni.potager.bll;

import fr.eni.potager.bo.Plantation;

public interface PlantationManager {
	
	void addPLantation(Plantation plantation);
	void deletePlantation(Plantation plantation);
	void listAllPlantation();

}
