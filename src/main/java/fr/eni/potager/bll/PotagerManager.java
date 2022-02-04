package fr.eni.potager.bll;

import java.util.List;
import java.util.Optional;

import fr.eni.potager.bo.Potager;

/**
 * Bll - ObjetManager - permet de d�finir les m�thodes d'un objets
 * @author Ma�l
 *
 */
public interface PotagerManager {

	public void addPotager(Potager potager);
	public void deletePotager(Potager potager);
	public List<Potager> getAllPotager();
	public Optional<Potager> getPotagerById(Integer id);
}