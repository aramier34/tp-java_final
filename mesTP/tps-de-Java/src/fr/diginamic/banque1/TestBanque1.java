package fr.diginamic.banque1;

import fr.diginamic.entites.Compte;

public class TestBanque1 {

	public static void main(String[] args) {
		Compte1 compte = new Compte1(1,500);
		System.out.println("numéro de compte : "+ compte.getNumCompte()+ " - Solde: " + compte.getSoldeCompte() + " euros.");
	}

}
