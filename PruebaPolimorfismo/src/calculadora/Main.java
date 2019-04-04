package calculadora;

public class Main {
	static void imprimir(Operacion o) {
		System.out.println(o.dato1);
		System.out.println(o.dato2);
		System.out.println(o.simbolo);
		System.out.println(o.resultado);
		System.out.println("__________");
	}
	public static void main(String[] args) {
		Suma s = new Suma(2,5);
		Resta r = new Resta(2,5);
		Multiplicacion m = new Multiplicacion(2,5);
		imprimir(s);
		Suma f = new Suma();
		imprimir(f);
		System.out.println(f.ya(3,7));
		imprimir(f);

	}

}
