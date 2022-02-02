package fr.eni.potager;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.eni.potager.bll.ActionManagerImpl;
import fr.eni.potager.bll.PotagerManagerImpl;
import fr.eni.potager.bo.Action;
import fr.eni.potager.bo.Potager;
import fr.eni.potager.dal.ActionDAO;

class ActionAlpicationTest {

	@Autowired
	ActionDAO dao;
	
	@Autowired
	ActionManagerImpl manager;
	
	@Test
	public void addAction() {
		Potager potager4 = new Potager("Potager", 15, "Niort");
		Action action4 = new Action(LocalDate.now(),"recolte","Niort");
		manager.addAction(action4, potager4);
		long nb = dao.count();
		Potager potager = new Potager("Potager", 15, "Niort");
		Action action = new Action(LocalDate.now(),"recolte","Niort");
		manager.addAction(action, potager);
		assertEquals(dao.count(), nb+1);
	}

}
