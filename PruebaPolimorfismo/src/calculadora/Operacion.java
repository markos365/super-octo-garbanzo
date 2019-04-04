package calculadora;

public abstract class Operacion {
	int dato1, dato2, resultado;
	char simbolo;
	
	abstract int ya(int dato1, int dato2);
	
}
