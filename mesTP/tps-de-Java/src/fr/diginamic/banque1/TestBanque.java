package fr.diginamic.banque1;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {

		Compte monCompte = new Compte (123456, 1000.0f);
	
		System.out.println(monCompte);
		
		
		
		Compte[] comptes = new Compte[2];
		
		comptes[0]=new Compte(12345, 100.0f);
		comptes[1]=new CompteTaux(1478, 200.0f, 1.2f);
		
		for (int i = 0; i < comptes.length; i++) {
			System.out.println(comptes[i]);
			
		}
		
	}

}
