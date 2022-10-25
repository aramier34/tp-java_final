package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {

// WARNING on utilise ce format Operations.calcul car il s'agit 'une méthode static
		
System.out.println(Operations.calcul(10,5,'+'));
System.out.println(Operations.calcul(10,5,'-'));
System.out.println(Operations.calcul(10,5,'/'));
System.out.println(Operations.calcul(10,5,'*'));

}
}
