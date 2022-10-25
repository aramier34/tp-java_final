package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.List;

public class Ville implements Comparable<Ville> {

	
	String nomVille;
	int nbHabitants;
	
	
	public Ville(String nomVille, int nbHabitants) {
		super();
		this.nomVille = nomVille;
		this.nbHabitants = nbHabitants;
		
	}
	@Override
	public boolean equals(Object objet) {
		if (!(objet instanceof Ville)) {
			return false;
		}
		Ville autre = (Ville)objet;
		return ((this.nomVille==null && autre.getNomVille()==null) || this.nomVille.equals(autre.getNomVille())) && this.nbHabitants == autre.getNbHabitants();
	}
	
	@Override
	public int compareTo(Ville autre) {
		return this.nbHabitants - autre.getNbHabitants();
	}
	
	@Override
	public String toString() {
		return nomVille+" "+nbHabitants;
	}
	


	public String getNomVille() {
		return nomVille;
	}


	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}


	public int getNbHabitants() {
		return nbHabitants;
	}


	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}







	
	
}
