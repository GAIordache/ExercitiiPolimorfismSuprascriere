package Ex1;

public class scaun extends MobilierDeAsezat {
	
	public scaun(int panFabricatie) {
		super(panFabricatie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void scartaie() {
		if(esteVechi(anFabricatie))
		System.out.println("scartaie scaun!");
	}
}
