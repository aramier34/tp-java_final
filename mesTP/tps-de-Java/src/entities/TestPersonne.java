package entities;

public class TestPersonne {


	public static void main(String[] args) {
		
		Personne alex = new Personne("ramier","alexandre",new AdressePostale(4, "rue de labeur", "54700", "paris"));
		Personne jack = new Personne ("chan", "jack", new AdressePostale(12, "rue du paradis", "98552", "toul"));
	

	
		AdressePostale adr1 = new AdressePostale(41,"rue du genou","34000","Montpellier");
		AdressePostale adr2 = new AdressePostale(41,"rue du genou","34000","Montpellier");
	
		alex.setAdressePostale(adr1);
		alex.getAdressePostale().codePostale="31000";
		
		AdressePostale.pays="belgique"; //écriture possible car pays est static
		
	}

	
	
	
	}
