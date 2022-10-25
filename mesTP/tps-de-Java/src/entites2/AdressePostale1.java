package entites2;

public class AdressePostale1 {
	private int numeroDeRue;
	private String libelleDeLaRue;
	private String codePostal;
	private String ville;
	static int nbDepartements = Constantes1.NB_DEPARTEMENTS;
	
	public AdressePostale1(int numeroDeRue, String libelleDeLaRue, String codePostal, String ville) {
		super();
		this.numeroDeRue = numeroDeRue;
		this.libelleDeLaRue = libelleDeLaRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public int getNumeroDeRue() {
		return numeroDeRue;
	}

	public void setNumeroDeRue(int numeroDeRue) {
		this.numeroDeRue = numeroDeRue;
	}

	public String getLibelleDeLaRue() {
		return libelleDeLaRue;
	}

	public void setLibelleDeLaRue(String libelleDeLaRue) {
		this.libelleDeLaRue = libelleDeLaRue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public static int getNbDepartements() {
		return nbDepartements;
	}

	public static void setNbDepartements(int nbDepartements) {
		AdressePostale1.nbDepartements = nbDepartements;
	}
	
	

}
