package fr.diginamic.maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {

				
HashMap<String, Integer> mapSalires = new HashMap<>();
mapSalires.put("Paul",1750);
mapSalires.put("Hicham",1825);
mapSalires.put("Yu",2250);
mapSalires.put("Ingrid",2015);
mapSalires.put("Chantal",2418);

		System.out.println(mapSalires.size());
	}

}
