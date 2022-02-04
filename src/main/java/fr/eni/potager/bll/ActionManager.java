package fr.eni.potager.bll;

import java.util.List;

import fr.eni.potager.bo.Action;
import fr.eni.potager.bo.Carre;
import fr.eni.potager.bo.Potager;


/**
 * Bll - ObjetManager - permet de d�finir les m�thodes d'un objets
 * @author Ma�l
 *
 */
public interface ActionManager {
	void deleteAction(Action action);
	void addAction(Action action, Carre carre);
	void addAction(Action action, Potager potager);
	List<Action> getAllAction();
	List<Action> getAll2WeekAction();
}
