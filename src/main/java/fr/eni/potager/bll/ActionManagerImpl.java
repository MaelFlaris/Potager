package fr.eni.potager.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.potager.bo.Action;
import fr.eni.potager.bo.Carre;
import fr.eni.potager.bo.Potager;
import fr.eni.potager.dal.ActionDAO;

@Service
public class ActionManagerImpl implements ActionManager{

	@Autowired
	ActionDAO dao;
	


	@Override
	public void deleteAction(Action action) {
		dao.delete(action);
	}

	@Override
	public List<Action> getAllAction() {
		return (List<Action>) dao.findAll();
	}

	@Override
	public void addAction(Action action, Carre carre) {
		action.setCarre(carre);
		dao.save(action);
		carre.getLstAction().add(action);
	}

	@Override
	public void addAction(Action action, Potager potager) {
		action.setPotager(potager);
		dao.save(action);
		potager.getLstAction().add(action);
		
	}


}
