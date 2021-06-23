package com.projet.chat.services;

import com.projet.chat.model.Utilisateur;

public interface UtilisateurService {

	Utilisateur getUser(String username, String password);
}
