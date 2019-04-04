package tipodeDato;

public class Ejercicio3 {

	public static void main(String[] args) {
		Integer objEntero_1 = 1, objEntero_2 = 1, objEntero_3 = 2;
		
		System.out.println("Funcionamiento metodo compareTo");
		System.out.println("Son iguales ----->"+ objEntero_1.compareTo(objEntero_2));
		System.out.println("El primero es menor ----->"+ objEntero_1.compareTo(objEntero_3));
		System.out.println("El primero es mayor ----->"+ objEntero_3.compareTo(objEntero_2));
		
		System.out.println("Funcionamiento metodo decode");
		
		String decimal = "2015", octal = "03737", hex = "0x7DF";
		
		System.out.println(decimal +" (en base 10) = " + Integer.decode(decimal) + " (en base 10)");
		System.out.println(octal +" (en base 8) = " + Integer.decode(octal) + " (en base 10)");
		System.out.println(hex +" (en base 16) = " + Integer.decode(hex) + " (en base 10)");


		
	}

}
