package entities;

public class Cercle {
	
	double rayon;

	 public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	 
	
	public double getRayon() {
		return rayon;
	}


	public void setRayon(double rayon) {
		this.rayon = rayon;
	}


	public String  calculPerimetre(){
		double perimetre=rayon*2*Math.PI;
		return "perimetre" +perimetre;
		
	}
	
	public String calculSurface() {
		double surface =rayon*rayon*Math.PI;
		return "surface = " + surface;
	}

}

