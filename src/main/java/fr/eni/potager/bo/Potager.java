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
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
public class Potager {
	@Id
	@GeneratedValue
	private Integer idPotager;
	private String nom;	
	private Integer surface;
	private String ville;
	
	@OneToMany(mappedBy="potager",cascade = CascadeType.ALL)
	@ToString.Exclude
	private List<Carre> lstCarres = new ArrayList<>();
	
	@OneToMany(mappedBy="potager",cascade = CascadeType.ALL)
	@ToString.Exclude
	private List<Action> lstAction = new ArrayList<>();
	
	
	public Potager( String nom, Integer surface, String ville) {
		super();
		this.nom = nom;
		this.surface = surface;
		this.ville = ville;
	}
	
	
}
