package Polimorfismo;

public class PolimorfismoMain {

	public static void main(String[] args) {
		Animal fido, snarf;
		
		fido = new Perro("Perro","Fido");
		snarf = new Gato("Gato", "Snarf");
		
		fido.printMensaje();
		snarf.printMensaje();
		
		
		/*String a,b,c;
		int x,y,z;
		
		a= "Perro";
		b= "Gato";
		c= a+b;
		x=2;
		y=3;
		z=x+y;
		
		System.out.println("La suma de a + b es " +c);
		System.out.println("La suma de x + y es " +z);
	*/
	}

	}
