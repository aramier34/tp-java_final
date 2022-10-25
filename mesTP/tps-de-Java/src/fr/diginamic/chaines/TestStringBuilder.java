package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

StringBuilder builder = new StringBuilder();
for (int i = 0; i < 100000; i++) {
	builder.append(i);
}


long debut = System.currentTimeMillis();

String phrase = new String();
for (int i = 0; i < 100000; i++) {
	phrase+=i;


//Code à chronométrer
long fin = System.currentTimeMillis();

System.out.println("Temps écoulé en millisecondes :" + (fin - debut));


	}

	}}
