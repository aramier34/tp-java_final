package fr.diginamic.operations;

public class CalculMoyenne {

	double tab[];
	
	
	
	public CalculMoyenne(double[] tab) {
		super();
		this.tab = tab;
	}



	public double[] ajout(double a) {
		double[] tab2=new double[tab.length+1];
		for (int i = 0; i < tab2.length; i++) {
			tab2[i]=tab[i];}
			tab2[tab2.length-1]=a;
			
		}
		
		
	}
	
}
