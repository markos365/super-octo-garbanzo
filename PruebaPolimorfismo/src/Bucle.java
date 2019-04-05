
public class Bucle {
	static void buail () {
		int x = 0;
		while (x++ <= 100) {
			System.out.print(x);
			if (x%4 == 0) System.out.print(" es múltiplo de cuatro");
			System.out.println();
		}
	}
	
	static void duBuail () {
		int x = 1;
		do {
			System.out.print(x);
			if (x%4 == 0) System.out.print(" es múltiplo de cuatro");
			System.out.println();
		} while (x++ <= 100);
	}
	
	

	public static void main(String[] args) {
		duBuail();

	}

}
