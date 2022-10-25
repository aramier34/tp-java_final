package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		
		List<Ville> listVille = new ArrayList<Ville>();
		
		

		Path pathFile= Paths.get("/home/alram/Téléchargements/recensement.csv");
		List<String> lines= Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		
		String[] tokens =pathFile.split(";");
		
		//Path pathDirectory= Paths.get("/home/alram/Téléchargements/");
		//DirectoryStream<Path> stream= Files.newDirectoryStream(pathDirectory);
		//for(Path path: stream) 
		//{System.out.println(path);}
	}

}
