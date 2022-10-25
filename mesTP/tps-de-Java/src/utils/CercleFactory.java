package utils;

import entities.Cercle;

public class CercleFactory {

	static public Cercle creerCercle(double rayon){
		Cercle cercle = new Cercle(rayon);
		return cercle;
	
	}
}
