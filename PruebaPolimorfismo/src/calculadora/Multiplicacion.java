package calculadora;

public class Multiplicacion extends Operacion {
	 Multiplicacion(int dato1, int dato2) {
			this.simbolo = '*';
			this.dato1 = dato1;
			this.dato2 = dato2;
			this.resultado = dato1 * dato2;
			
		}
		Multiplicacion() {
			this.simbolo = '*';
		}
		
		
		int ya(int dato1,int dato2){
			resultado = dato1 * dato2;
			return resultado;
		}
}