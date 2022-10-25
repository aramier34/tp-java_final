package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CreerFichier {

	public static void main(String[] args) throws IOException {

		Path pathOrigine = Paths.get("/home/alram/Téléchargements/recensement.csv");
		Path pathDestination = Paths.get("/home/alram/Téléchargements/recensement2.csv");
		Files.copy(pathOrigine, pathDestination, StandardCopyOption.REPLACE_EXISTING);
		
	}

}
