package fr.eni.potager.bo;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Action {

	@Id
	@GeneratedValue
	private Integer idAction;
	private LocalDate date;
	private String evenement;
	private String lieu;
	
	//Cascade permet de d'insere une action et un carre si celui si n'est pas déja insérer
	@ManyToOne(cascade = CascadeType.ALL)
	private Carre carre;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Potager potager;
	
	public Action(LocalDate date, String evenement, String lieu) {
		super();
		this.date = date;
		this.evenement = evenement;
		this.lieu = lieu;
	}
	
	
}
