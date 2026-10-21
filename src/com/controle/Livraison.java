package com.controle;

public class  Livraison {
	    private Livreur livreur;
	    private Commande commande;
	    private Double distance;
	    public Livraison(Livreur livreur,Commande commande , Double distance) {
			this.livreur = livreur;
			this.commande= commande;
			this.distance=distance;
		}
		public double calculerMontant() {
	        return livreur.calculerFrais(distance) ;
	    }

	    public void afficherRecapitulatif() {
	        System.out.println(" Récapitulatif de commande");

	        System.out.println("livreur : " + livreur);

	        System.out.println("commande :" +commande);

	        System.out.println("distance: " + distance + " Km");

	        System.out.println("Montant total : "
	                + calculerMontant() + " DH");
	    }
	}




