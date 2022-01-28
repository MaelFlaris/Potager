package fr.eni.potager.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Potager {
	@Id
	@GeneratedValue
	private Integer idPotager;
	private String localisation;
	private String nom;	
	private Integer surface;
	private String ville;
	
	@OneToMany(mappedBy="potager",cascade = CascadeType.ALL)
	private List<Carre> lstCarres = new ArrayList<>();
	
	@OneToMany(mappedBy="potager",cascade = CascadeType.ALL)
	private List<Action> lstAction = new ArrayList<>();
	
	
	public Potager(String localisation, String nom, Integer surface, String ville) {
		super();
		this.localisation = localisation;
		this.nom = nom;
		this.surface = surface;
		this.ville = ville;
	}
	
	
}
