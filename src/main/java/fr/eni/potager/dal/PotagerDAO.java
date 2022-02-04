package fr.eni.potager.dal;

import org.springframework.data.repository.CrudRepository;

import fr.eni.potager.bo.Potager;

/**
 * @author Maël
 * DAL -permet de crée des methodes specifiques et non disponible dans le crudRepository 
 */
public interface PotagerDAO extends CrudRepository<Potager, Integer>{

}
