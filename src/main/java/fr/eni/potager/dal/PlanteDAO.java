package fr.eni.potager.dal;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.eni.potager.bo.Plantation;
import fr.eni.potager.bo.Plante;

/**
 * @author Maël
 * DAL -permet de crée des methodes specifiques et non disponible dans le crudRepository 
 */
public interface PlanteDAO extends CrudRepository<Plante, Integer> {
	
	@Query("SELECT p.lstPlantation FROM Plante p WHERE p = :plante")
	public List<Plantation> getLocPlante(@Param("plante") Plante plante);

}
