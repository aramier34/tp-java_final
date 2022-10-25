package fr.diginamic.tri;

public class TestEquals {

	public static void main(String[] args) {

		Ville v3 = new Ville("Nice", 343000);
		Ville v4 = v3;
		boolean result3 = v3.equals(v4); // result vaut true
		System.out.println(result3);
		
		
		Ville v1 = new Ville("Nice", 343000);
		Ville v2 = new Ville("Nice", 343000);
		boolean result = v1.equals(v2);
		System.out.println(result);
		
		boolean result2 = v1 ==v2;
		System.out.println(result2);
		
	}

}
