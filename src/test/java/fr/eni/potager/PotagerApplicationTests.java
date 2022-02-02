package fr.eni.potager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.eni.potager.bll.PotagerManager;
import fr.eni.potager.bll.PotagerManagerImpl;
import fr.eni.potager.bo.Potager;
import fr.eni.potager.dal.PotagerDAO;

@SpringBootTest
class PotagerApplicationTests {
	
	@Autowired
	PotagerDAO dao;
	
	@Autowired
	PotagerManagerImpl manager;
	
	@Test
	public void addPotager() {

		long nb = dao.count();
		Potager potager = new Potager("mon potager", 12,"Niort");
		manager.addPotager(potager);
		assertEquals(dao.count(), nb+1);
	}

}
