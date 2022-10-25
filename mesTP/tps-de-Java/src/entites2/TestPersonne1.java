package entites2;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne1 {

	public static void main(String[] args) {
		AdressePostale1 adr1 = new AdressePostale1 (15, "de la mairie", "34000", "Montpellier");
	
		Personne personne1 = new Personne("Doe","John",new AdressePostale(3,"ruelle courte","33000","Bordeaux"));
		
		Personne personne2 =new Personne ("Ramier", "Alex", new AdressePostale(233, "rue de la marquerose", "34000", "montpellier"));
		System.out.println(Math.random());
	}

	
	
	
	

}
