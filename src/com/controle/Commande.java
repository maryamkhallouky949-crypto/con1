package com.controle;

public class Commande {



private String numero;
private String destimation ;
public Commande(String numero, String destimation) {
	
	this.numero =numero ;
	this.destimation= destimation ;
}
 public String toString() {
        return "Commande [numero=" + numero
                + ", destimation=" + destimation
                 + "]";
    }
 
}
