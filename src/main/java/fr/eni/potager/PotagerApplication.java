package src.main.java.fr.eni.potager;

import java.time.LocalDate;
import java.util.Date;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.eni.potager.bll.ActionManager;
import fr.eni.potager.bll.CarreManager;
import fr.eni.potager.bll.PlantationManager;
import fr.eni.potager.bll.PlanteManager;
import fr.eni.potager.bll.PotagerManager;
import fr.eni.potager.bo.Action;
import fr.eni.potager.bo.Carre;
import fr.eni.potager.bo.Plantation;
import fr.eni.potager.bo.Plante;
import fr.eni.potager.bo.Potager;


@SpringBootApplication
@Transactional
public class PotagerApplication implements CommandLineRunner {

	@Autowired
	PotagerManager potagerManager;
	
	@Autowired
	CarreManager carreManager;
	
	@Autowired
	PlanteManager planteManager;
	
	@Autowired
	ActionManager actionManager;
	
	@Autowired
	PlantationManager plantationManger;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PotagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Potager potager = new Potager("Potager monseigneur",15,"Niort");
		Carre carre = new Carre(3,"argileux","soleil");
		Plante plante = new Plante("Carotte","Légume","Carotte de Colmar à coeur rouge",30);
		Action action = new Action(LocalDate.now().plusDays(5),"Planter","carre X");
		potagerManager.addPotager(potager);
		carreManager.addCarre(carre, potager);
		planteManager.addPlante(plante);
		
		//Soit l'un soit l'autre
		actionManager.addAction(action, carre);
		Plantation plantation = new Plantation(plante, carre,LocalDate.now(), LocalDate.now().plusWeeks(5),4);
		plantationManger.addPLantation(plantation);
		actionManager.getAll2WeekAction();
		
		System.out.println(planteManager.getLocPlante(plante));
		
		//actionManager.addAction(action, potager);
		
		
		
	}

}
