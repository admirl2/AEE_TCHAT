/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.chat.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DRH
 */
@Entity
@Table(name = "Utilisateur")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u"),
		@NamedQuery(name = "Utilisateur.findByUsername", query = "SELECT u FROM Utilisateur u WHERE u.username = :username"),
		@NamedQuery(name = "Utilisateur.findByPassword", query = "SELECT u FROM Utilisateur u WHERE u.password = :password"),
		@NamedQuery(name = "Utilisateur.findByEnregistrerPar", query = "SELECT u FROM Utilisateur u WHERE u.enregistrerPar = :enregistrerPar"),
		@NamedQuery(name = "Utilisateur.findByEnregistrerLe", query = "SELECT u FROM Utilisateur u WHERE u.enregistrerLe = :enregistrerLe"),
		@NamedQuery(name = "Utilisateur.findByModifierPar", query = "SELECT u FROM Utilisateur u WHERE u.modifierPar = :modifierPar"),
		@NamedQuery(name = "Utilisateur.findByModifierLe", query = "SELECT u FROM Utilisateur u WHERE u.modifierLe = :modifierLe") })
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "username")
	private String username;
	@Basic(optional = false)
	@Column(name = "password")
	private String password;
	@Basic(optional = false)
	@Column(name = "enregistrerPar")
	private String enregistrerPar;
	@Basic(optional = false)
	@Column(name = "enregistrerLe")
	@Temporal(TemporalType.DATE)
	private Date enregistrerLe;
	@Column(name = "modifierPar")
	private String modifierPar;
	@Column(name = "modifierLe")
	@Temporal(TemporalType.DATE)
	private Date modifierLe;

	public Utilisateur() {
	}

	public Utilisateur(String username) {
		this.username = username;
	}

	public Utilisateur(String username, String password, String enregistrerPar,
			Date enregistrerLe) {
		this.username = username;
		this.password = password;
		this.enregistrerPar = enregistrerPar;
		this.enregistrerLe = enregistrerLe;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEnregistrerPar() {
		return enregistrerPar;
	}

	public void setEnregistrerPar(String enregistrerPar) {
		this.enregistrerPar = enregistrerPar;
	}

	public Date getEnregistrerLe() {
		return enregistrerLe;
	}

	public void setEnregistrerLe(Date enregistrerLe) {
		this.enregistrerLe = enregistrerLe;
	}

	public String getModifierPar() {
		return modifierPar;
	}

	public void setModifierPar(String modifierPar) {
		this.modifierPar = modifierPar;
	}

	public Date getModifierLe() {
		return modifierLe;
	}

	public void setModifierLe(Date modifierLe) {
		this.modifierLe = modifierLe;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (username != null ? username.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Utilisateur)) {
			return false;
		}
		Utilisateur other = (Utilisateur) object;
		if ((this.username == null && other.username != null)
				|| (this.username != null && !this.username
						.equals(other.username))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.sepem.soft.model.Utilisateur[ username=" + username + " ]";
	}

}
