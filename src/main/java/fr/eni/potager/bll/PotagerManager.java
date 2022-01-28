package fr.eni.potager.bll;

import java.util.List;

import fr.eni.potager.bo.Potager;

public interface PotagerManager {

	public void addPotager(Potager potager);
	public void deletePotager(Potager potager);
	public List<Potager> getAllPotager();
}
