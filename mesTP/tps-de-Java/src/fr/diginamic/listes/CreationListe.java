package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>() ;
		
		for (int i = 0; i < 100; i++) {
			list.add(i);
			System.out.println(i);
			
			}
		
		System.out.println(list.size());
		}
}
