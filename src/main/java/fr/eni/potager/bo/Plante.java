package fr.eni.potager.bo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

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
	
	public Plante(String nom, String type, String variete, Integer surface) {
		super();
		this.nom = nom;
		this.type = type;
		this.variete = variete;
		this.surface = surface;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Carre carre;
	
	
}
