
package com.controle;

public abstract class Livreur {

    
	protected String identifiant;
    protected String nom;
    protected double tarifKm;


    public Livreur(String identifiant, String nom, double tarifKm) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.tarifKm = tarifKm;
    }

    public String identifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public abstract double calculerFrais(double distance);

    public void afficherDetails() {
        System.out.println("identifiant : " + identifiant);
        System.out.println("Nom : " + nom);
        System.out.println("TarifKm : " + tarifKm + " DH");
    }

    public void setResponsable(Livreur responsable) {
        if (responsable == this) {
            System.out.println(
                "Erreur : un livreur ne peut pas être son propre responsable."
            );
      
        }

        this.responsable = responsable;
    }

    public Livreur getResponsable() {
        return responsable;
    }
}
