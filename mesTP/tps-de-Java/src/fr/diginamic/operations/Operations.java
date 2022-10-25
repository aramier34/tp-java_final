package fr.diginamic.operations;

public class Operations {
	
	double a;
	double b;
	static char operateur;
	
	
	public void operations(double a, double b, char operateur) {
		
		this.a = a;
		this.b = b;
		this.operateur = operateur;
	}
	
	public  static Object calcul(double a, double b, char operateur){
		if(operateur == '+') {
			return a+b;}
			else if(operateur == '-'){
				return a-b;
			}
			else if(operateur =='*'){
				return a*b;
			}
			else if(operateur =='/') {
				return a/b;
			}else {
				return null;
			}
			
		}



	
	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public char getOperateur() {
		return operateur;
	}


	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}
	
	
	
}
