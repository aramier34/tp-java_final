package fr.diginamic.banque.entites;

abstract public class Operation {

	String dateOperation;
	float montant;
	
	public Operation(String dateOperation, float montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	
	public  String getType() {
		return dateOperation;
		
	}

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	
}
