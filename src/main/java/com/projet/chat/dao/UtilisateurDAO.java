package com.projet.chat.dao;

import com.projet.chat.model.Utilisateur;

public interface UtilisateurDAO {
	Utilisateur getUser(String username, String password);

}
