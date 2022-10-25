package entities;

public class Personne {

	
	//Personne a des variables d'instance 
	String nom;
	String prenom;
	AdressePostale AdressePostale;
	
	public Personne(String nom, String prenom, entities.AdressePostale adressePostale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		AdressePostale = adressePostale;}
	




		public void afficherPersonne() {
			System.out.println(this.nom.toUpperCase()+ " "+this.prenom);
		}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdressePostale() {
		return AdressePostale;
	}

	public void setAdressePostale(AdressePostale adressePostale) {
		AdressePostale = adressePostale;
	}
	
	
	
	}
	
