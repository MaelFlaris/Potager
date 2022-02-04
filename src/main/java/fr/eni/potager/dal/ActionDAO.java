package fr.eni.potager.dal;

import org.springframework.data.repository.CrudRepository;

import fr.eni.potager.bo.Action;

/**
 * @author Maël
 * DAL -permet de crée des methodes specifiques et non disponible dans le crudRepository 
 */
public interface ActionDAO extends CrudRepository<Action, Integer> {

	
}
