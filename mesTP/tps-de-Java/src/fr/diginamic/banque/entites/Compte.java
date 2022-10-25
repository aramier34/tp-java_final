package fr.diginamic.banque.entites;

public class Compte {

	 int numero;
	 float solde;
	
	 public Compte(int numero, float solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	
	 }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		String message = " numero de compte : "+ this.numero + " et solde du compte : "+ this.solde;
		return message;
	}
	
	
}
