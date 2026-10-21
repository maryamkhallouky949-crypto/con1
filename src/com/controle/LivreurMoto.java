package com.controle;

public class LivreurMoto extends Livreur{



    private int anciennete;

    public LivreurMoto(String identifiant, String nom,
                     double tarifKm, int anciennete) {
        super(identifiant, nom, tarifKm);
        this.anciennete = anciennete;
    }

    @Override
    public double calculerFrais(double distance) {
       
        if (anciennete< 3) {
            return tarifKm*distance;
        }else {
        return  tarifKm*(distance+2 );
    }
    }
    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("anciennete : " +anciennete );
    }
}


