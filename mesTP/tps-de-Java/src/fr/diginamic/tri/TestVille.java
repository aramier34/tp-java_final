package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import fr.diginamic.tri.Ville;

public class TestVille {

	public static void main(String[] args) {

		List<Ville> listeVille = new ArrayList<Ville>();
		Ville nice = new Ville("Nice",1000);
		listeVille.add(nice);
		Ville toulouse = new Ville("Toulouse", 2000);
		listeVille.add(toulouse);
		listeVille.add(new Ville ("Lyon", 3000));
		
		Collections.sort(listeVille);
		
		
	
		
		
	}

}
