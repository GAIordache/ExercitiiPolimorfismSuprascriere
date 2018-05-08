package Ex1;

public class scaunel extends MobilierDeAsezat {
	
	public scaunel(int panFabricatie) {
		super(panFabricatie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void scartaie() {
		if(esteVechi(anFabricatie))
		System.out.println("scartaie scaunel");
		
	}

}
