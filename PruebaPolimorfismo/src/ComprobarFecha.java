import java.util.Scanner;

public class ComprobarFecha {
	static Integer entrada;
	static String fecha = ""; 
	
	static void leer(String aux) {
		System.out.println("Introduzca " + aux + " :");
		Scanner escaner = new Scanner (System.in);
		entrada = Integer.valueOf(escaner.nextLine());
		/*if ((aux=="mes") || (aux=="año")) {
			fecha = fecha +"/"+ entrada.toString();
		} else {
			fecha = entrada.toString();
		}*/
		fecha += "/"+ entrada.toString();
	}
	
	
	static boolean comprobar(String aux) {
		boolean bool = false;
		
		if (aux == "día") {
			if ((entrada >= 1) && (entrada<=31)) {
				bool = true;
			} else {
				bool = false;
			}
		} else if (aux == "mes") { //Aquí me quedé
			if ((entrada >= 1) && (entrada<=12)) {
				bool = true;
			} else {
				bool = false;
			}
		} else if (aux == "año") {
			if ((entrada >= 0) && (entrada<=2050)) {
				bool = true;
			} else {
				bool = false;
			}
		}
			
		return bool;
	}
	static void empezar() {
		boolean aux = false;
		
		leer("día") ;
		aux = comprobar("día");
		
		leer("mes"); 
		aux &= comprobar("mes");
		
		leer("año");
		aux &= comprobar("año"); 
		
		if (aux) {
			System.out.println("La fecha " + fecha.substring(1) + " es válida.");
		} else {
			System.out.println("La fecha " + fecha.substring(1) + " no es válida.");
		}
		
		
		
		
	}
	public static void main(String[] args) {
		
		empezar(); 
		System.out.println("Adiós");

	}

}
