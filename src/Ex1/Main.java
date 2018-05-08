package Ex1;

public class Main {
	public static void main(String[] args) {
		scaun sc1 = new scaun(4);
		scaunel sc2 = new scaunel(2);
		MobilierDeAsezat sc3 = new MobilierDeAsezat(5);
		
		sc1.scartaie();
		sc2.scartaie();
		//((MobilierDeAsezat)sc1).scartaie();
		sc3.scartaie();

		
	}
}
