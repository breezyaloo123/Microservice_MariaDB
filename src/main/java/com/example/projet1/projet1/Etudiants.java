package com.example.projet1.projet1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etudiants {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String prenom;
    private String nom;
    private String num_etudiant;
    private String nom_entreprise;


    public Etudiants(String num_etudiant, String prenom, String nom, String nom_entreprise) {
        this.id = id;
        this.num_etudiant = num_etudiant;
        this.prenom = prenom;
        this.nom = nom;
        this.nom_entreprise = nom_entreprise;
    }

    public Etudiants(){}

    public String getNom_entreprise() {
        return nom_entreprise;
    }

    public void setNom_entreprise(String nom_entreprise) {
        this.nom_entreprise = nom_entreprise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum_etudiant() {
        return num_etudiant;
    }

    public void setNum_etudiant(String numEtudiant) {
        this.num_etudiant = numEtudiant;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
