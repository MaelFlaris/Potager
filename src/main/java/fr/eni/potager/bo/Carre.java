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
public class Carre {
	@Id
	@GeneratedValue
	private Integer idCarre;
	private Integer surface;
	private String typeSol;
	private String typeExposition;
	
	//mappedBy - permet de d?finir la direction
	@OneToMany(mappedBy="carre",cascade =CascadeType.ALL )
	@ToString.Exclude
	private List<Plantation> lstPlantation = new ArrayList<>();
	
	//mappedBy - permet de d?finir la direction
	@OneToMany(mappedBy="carre",cascade = CascadeType.ALL)
	@ToString.Exclude
	private List<Action> lstAction = new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Potager potager;
	
	public Carre(Integer surface, String typeSol, String typeExposition) {
		super();
		this.surface = surface;
		this.typeSol = typeSol;
		this.typeExposition = typeExposition;
	}
	
	

}
