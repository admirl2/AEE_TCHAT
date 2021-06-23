package com.projet.chat.connexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connexion {

	public static EntityManagerFactory emf;
	public static EntityManager em;

	public Connexion() {

		connec();
	}

	public static void connec() {
		try {
			emf = Persistence.createEntityManagerFactory("Shemahia_PU");
			em = emf.createEntityManager();
			System.out.println("coco coco reussi");
		} catch (Exception ex) {
			System.out.println("echec========" + ex);
		}

	}

	public static void closeEm() {
		em.close();
	}

	public static void closeEmf() {
		emf.close();
	}

}
