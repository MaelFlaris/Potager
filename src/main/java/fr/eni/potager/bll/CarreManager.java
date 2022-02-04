package fr.eni.potager.bll;

import java.util.List;

import fr.eni.potager.bo.Carre;
import fr.eni.potager.bo.Potager;

/**
 * Bll - ObjetManager - permet de définir les méthodes d'un objets
 * @author Maël
 *
 */
public interface CarreManager {
	public void addCarre(Carre carre, Potager potager);
	public void deleteCarre(Carre carre);
	public List<Carre> getAllCarre();
}
