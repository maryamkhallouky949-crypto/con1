
public class Main {

    public static void main(String[] args) {

    
        LivreurMoto M01 = new LivreurMoto(
            "M01", "Amine", 10, 4
        );

        LivreurMoto M02 = new LivreurMoto(
            "M02", "Youssef", 8, 2
        );

        LivreurCamion C01 = new LivreurCamion(
            "C01", "Karim", 15, 0.20
        );

        LivreurCamion C02 = new LivreurCamion(
            "C02", "Omar", 12, 0.10
        );

  
        Livreur[] livreurs = {
            M01,M02, C01, C02
        };

        M02.setResponsable(C01);
        C01.setResponsable(M01);
        C02.setResponsable(C01);

       
        System.out.println("LISTE DES LIVREURS ");

        for (int i = 0; i < livreurs.length; i++) {
            System.out.println("\nLivreur " + (i + 1));
            livreurs[i].afficherDetails();

            if (livreurs[i].getResponsable() != null) {
                System.out.println(
                    "Responsable : "
                    + livreurs[i].getResponsable().getNom()
                );
            } else {
                System.out.println("Responsable : Aucun");
            }
        }

     
        Commande commande1 = new Commande(
            "CMD01", "Marrakech"
        );

        Commande commande2 = new Commande(
            "CMD02", "Casablanca"
        );

       
        Livraison[] livraisons = {
            new Livraison(M01, commande1, 30),
            new Livraison(M02, commande2, 20),
            new Livraison(C01, commande1, 40),
            new Livraison(C02, commande2, 50)
        };

       
        double montantTotal = 0;

        System.out.println("LISTE DES LIVRAISONS ");

        for (int i = 0; i < livraisons.length; i++) {
            livraisons[i].afficherRecapitulatif();
            montantTotal += livraisons[i].calculerMontant();
        }

        System.out.printf(
            "\nMontant total des livraisons : %.2f DH%n",
            montantTotal
        );

        
        int nombreSupervises = 0;

        for (int i = 0; i < livreurs.length; i++) {
            if (livreurs[i].getResponsable() == moto1) {
                nombreSupervises++;
            }
        }

        System.out.println(
            "Nombre de livreurs directement supervises par "
            + moto1.getNom() + " : " + nombreSupervises
        );
    }
}
