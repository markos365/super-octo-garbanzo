package operadores;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		Integer entrada;
		Scanner escaner = new Scanner (System.in);
		System.out.println("Introduzca nota del 0 al 10:");
		entrada = Integer.valueOf(escaner.nextLine());
		if (!((entrada >= 0) && (entrada <= 10))) {
			entrada = 11;
		} else if ((entrada == 7) || (entrada == 8)) {
			entrada = 7;
		} else if ((entrada == 9) || (entrada == 10)) {
			entrada = 9; 
		}
		
		switch (entrada) {
		default:
			System.out.println("Suspenso");
			break;
		case 11:
			System.out.println("Número fuera de rango");
			break;
		case 5:
			System.out.println("Aprobado");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
			System.out.println("Notable");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		}
	}

}
