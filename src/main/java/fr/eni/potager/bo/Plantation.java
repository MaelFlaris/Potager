package fr.eni.potager.bo;

import java.time.LocalDate;

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
public class Plantation {
	@Id
	@GeneratedValue
	private Integer idPlantation;

	@ManyToOne(cascade = CascadeType.ALL)
	private Plante plante;
	
	@ManyToOne(cascade = CascadeType.ALL)	
	private Carre carre;
	
	private LocalDate datePlantation;
	private LocalDate dateRecolte;
	private Integer quantite;
	
	public Plantation(Plante plante, Carre carre, LocalDate datePlantation, LocalDate dateRecolte, Integer quantite) {
		super();
		this.plante = plante;
		this.carre = carre;
		this.datePlantation = datePlantation;
		this.dateRecolte = dateRecolte;
		this.quantite = quantite;
	}
	
	
}
