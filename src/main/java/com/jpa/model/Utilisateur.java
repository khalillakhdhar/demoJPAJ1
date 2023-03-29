package com.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // créer une table dans la BD
public class Utilisateur {

	@Id // obligatoire
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	// auto incrémentation (facultatif)
	private long id;
	private String nom,prenom;
	private String Email;
	private String password;
	private int age;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
