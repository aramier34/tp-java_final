package fr.diginamic.essais;

import entities.Cercle;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

Cercle c1 = new Cercle(10);
Cercle c2 = new Cercle(20);

Cercle c3 = CercleFactory.creerCercle(30);
	
System.out.println(c1.calculPerimetre());
System.out.println(c2.calculPerimetre());
System.out.println(c1.calculSurface());
System.out.println(c2.calculSurface());
System.out.println(c3.calculSurface());
System.out.println(c3.calculPerimetre());
	
	}

	
}
