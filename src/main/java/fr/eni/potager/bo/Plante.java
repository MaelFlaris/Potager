package fr.eni.potager.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
public class Plante {
	@Id
	@GeneratedValue
	private Integer idPlante;
	private String nom;
	private String type;
	private String variete;
	private Integer surface;
	
	//mappedBy - permet de définir la direction
	@OneToMany(mappedBy = "plante")
	@ToString.Exclude
	private List<Plantation> lstPlantation = new ArrayList<>();
	
	public Plante(String nom, String type, String variete, Integer surface) {
		super();
		this.nom = nom;
		this.type = type;
		this.variete = variete;
		this.surface = surface;
	}
	

	
	
}
