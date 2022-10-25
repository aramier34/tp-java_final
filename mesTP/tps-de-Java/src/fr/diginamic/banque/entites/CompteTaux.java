package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

	float tauxRem= 1.5F;

	public CompteTaux(int numero, float solde, float tauxRem) {
		super(numero, solde);
		this.tauxRem = tauxRem;
	}

	
	
public float getTauxRem() {
		return tauxRem;
	}



	public void setTauxRem(float tauxRem) {
		this.tauxRem = tauxRem;
	}


@Override
public String toString() {
	String chaine = super.toString();
		return chaine+ "taux de rémunération : "+ tauxRem ;

	}

}
