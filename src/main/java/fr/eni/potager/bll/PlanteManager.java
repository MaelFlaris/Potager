package fr.eni.potager.bll;

import java.util.List;
import fr.eni.potager.bo.Plantation;
import fr.eni.potager.bo.Plante;

/**
 * Bll - ObjetManager - permet de définir les méthodes d'un objets
 * @author Maël
 *
 */
public interface PlanteManager {
	public void addPlante(Plante plante);
	public void deletePlante(Plante plante);
	public List<Plantation> getLocPlante(Plante plante);
	public List<Plante> getAllPlante();
}
