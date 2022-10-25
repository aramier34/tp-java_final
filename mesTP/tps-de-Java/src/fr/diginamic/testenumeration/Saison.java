package fr.diginamic.testenumeration;

public enum Saison {

	
	  PRINTEMPS ("Printemps",1),
	  ETE ("Eté",2),
	AUTOMNE ("Autome",3),
	HIVER ("Hiver",4);
			
	private String libelle;
	private int numeroOordre ;
	
	Saison[] saisons = Saison.values();
	
	for (Saison s : saisons) {
		if(s.getLibelle().equals(libTemp)) {
			return s;
		}
		System.out.println(s);
	}

	
	private Saison(String libelle, int numeroOordre) {
		this.libelle = libelle;
		this.numeroOordre = numeroOordre;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public int getNumeroOordre() {
		return numeroOordre;
	}


	public void setNumeroOordre(int numeroOordre) {
		this.numeroOordre = numeroOordre;
	}



	
	
	
}
