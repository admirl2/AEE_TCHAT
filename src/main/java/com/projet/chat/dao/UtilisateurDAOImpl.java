package com.projet.chat.dao;

import javax.management.Query;

import com.projet.chat.connexion.Connexion;
import com.projet.chat.model.Utilisateur;

public class UtilisateurDAOImpl implements UtilisateurDAO {

	public UtilisateurDAOImpl() {
		new Connexion();
	}

	@Override
	public Utilisateur getUser(String username, String password) {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = null;
		try {
			String requete = "SELECT u FROM Utilisateur u WHERE u.username='"
					+ username + "' AND u.password='" + password + "'";

			Query query = (Query) Connexion.em.createQuery(requete);
			utilisateur = (Utilisateur) ((javax.persistence.Query) query)
					.getSingleResult();
			System.out.println("Dernier Test======");
		} catch (Exception ex) {
			System.out.println("wldslddls======" + ex.getMessage());
		}
		return utilisateur;
	}

}
