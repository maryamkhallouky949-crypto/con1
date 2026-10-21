package com.controle;
public  class LivreurCamion extends Livreur{
 Double TauxMajoration;
	public LivreurCamion(String identifiant, String nom, double tarifKm, Double TauxMajoration) {
		super(identifiant, nom, tarifKm);
		this.TauxMajoration=TauxMajoration;
	}

	 public double calculerFrais(Double distance) {
	        double montant = tarifKm * distance;

	        if (TauxMajoration >= 3) {
	            montant = montant *(1+TauxMajoration);
	        }

	        return montant;
	    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("TauxMajoration: " +TauxMajoration );
    }

	@Override
	public double calculerFrais(double distance) {
		// TODO Auto-generated method stub
		return 0;
	}
}



