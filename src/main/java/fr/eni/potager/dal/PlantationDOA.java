package fr.eni.potager.dal;

import org.springframework.data.repository.CrudRepository;

import fr.eni.potager.bo.Plantation;

public interface PlantationDOA extends CrudRepository<Plantation, Integer> {

}
