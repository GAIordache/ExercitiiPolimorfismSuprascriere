package Ex1;

public class MobilierDeAsezat {

	public int anFabricatie;
	
	public MobilierDeAsezat(int panFabricatie) {
		anFabricatie = panFabricatie;
	}
	
	public boolean esteVechi(int panFabricatie) {
		return panFabricatie > 3;
	}
	
	public void scartaie() {
		if(esteVechi(anFabricatie))
		System.out.println("mobilierul scartaie!");
	}
}
