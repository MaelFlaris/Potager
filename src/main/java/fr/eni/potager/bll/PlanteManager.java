package fr.eni.potager.bll;

import java.util.List;

import fr.eni.potager.bo.Carre;
import fr.eni.potager.bo.Plante;

public interface PlanteManager {
	public void addPlante(Plante plante, Carre carre);
	public void deletePlante(Plante plante);
	public List<Plante> getAllPlante();
}
