package entities;

public class AdressePostale {

	
	int numero;
	String libelle;
	String codePostale;
	String ville;
	
	//variable de classe = valeur partagée
	static String pays = "FRANCE";

	//Constructeur 
	public AdressePostale(int numero, String libelle, String codePostale, String ville) {
		super();
		this.numero = numero;
		this.libelle = libelle;
		this.codePostale = codePostale;
		this.ville = ville;
	}
	
	//une méthode static ne peut accéder qu'aux variables et méthodes static
public static void afficherAdresse() {
	System.out.println(numero + " "+ libelle);
}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public static String getPays() {
		return pays;
	}
}
