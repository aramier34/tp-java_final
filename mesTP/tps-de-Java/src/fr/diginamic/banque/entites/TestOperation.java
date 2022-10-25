package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {

		Operation[] operations = new Operation[4];
		
		operations[0]=new Credit("01/01/2022", 100.0f);
		operations[1]=new Credit("31/01/2022", 200.0f);
		operations[2]=new Debit("01/06/2022", 150.0f);
		operations[3]=new Debit("30/09/2022",400.0f);
		
		float somme=0.0f;
	for (int i = 0; i < operations.length; i++) {
		if (operations[i].getType()=="CREDIT") {
			somme = somme+operations[i].getMontant();
			}else {
				somme=somme-operations[i].getMontant()
;				
			}
		
		System.out.println(operations[i].montant);
		System.out.println(operations[i].dateOperation);
		System.out.println(operations[i].getType());
		System.out.println("suivi du montant total : "+somme);

	}
	}
	
	
	
	
}
