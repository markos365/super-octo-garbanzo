package operadores;

public class Ejemplo2 {
	
	static boolean x = true, y = false, z = true, resultado;
	
	public static void tal() {
		
		System.out.println( resultado );
		
	}

	public static void main(String[] args) {
		System.out.println((x && y) || (x && z));	
		resultado = (x || !y) && (!x || z);
		tal();		
		resultado = x || y && z;
		tal();		
		resultado = !(x || y) && z ;
		tal();		
		resultado = x || y || x && !z && !y;
		tal();		
		resultado = !x || !y || z && x && !y;
		tal();		
		

	}

}
