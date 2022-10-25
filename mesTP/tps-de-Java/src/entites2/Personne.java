package entites2;

public class Personne {
	private String nom;
	private String prenom;
	private AdressePostale1 adressePostale;
	
	public Personne(String nom, String prenom, AdressePostale1 adressePostale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
	
	public void afficherIdentite() {
		System.out.println(prenom+" "+nom.toUpperCase());
	}
	
	
	
	public String setNom() {
		return this.nom;
	}
	
	
	public String setPrenom() {
		return this.prenom ;
	}
	

	public AdressePostale1 setAdressePostale() {
		return this.adressePostale;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public AdressePostale1 getAdressePostale() {
		return adressePostale;
	}

	
	
}
