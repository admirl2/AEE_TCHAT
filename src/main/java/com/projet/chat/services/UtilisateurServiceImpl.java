package com.projet.chat.services;

import com.projet.chat.dao.UtilisateurDAOImpl;
import com.projet.chat.model.Utilisateur;

public class UtilisateurServiceImpl implements UtilisateurService {
	UtilisateurDAOImpl userDAOImpl;

	@Override
	public Utilisateur getUser(String username, String password) {
		// TODO Auto-generated method stub
		userDAOImpl = new UtilisateurDAOImpl();
		return userDAOImpl.getUser(username, password);
	}

}
