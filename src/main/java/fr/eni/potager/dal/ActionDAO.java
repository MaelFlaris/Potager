package fr.eni.potager.dal;

import org.springframework.data.repository.CrudRepository;

import fr.eni.potager.bo.Action;

/**
 * @author Ma�l
 * DAL -permet de cr�e des methodes specifiques et non disponible dans le crudRepository 
 */
public interface ActionDAO extends CrudRepository<Action, Integer> {

	
}
