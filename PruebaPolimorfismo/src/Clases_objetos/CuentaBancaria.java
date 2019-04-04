package Clases_objetos;

public class CuentaBancaria {

	long numero;
	String titular;
	long saldo;
	
	public CuentaBancaria() {
		numero = 0;
		titular = "";
		saldo = 0;
	}
	
	public CuentaBancaria(long numero, String titular, long saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo; 
	}
	
	void ingresar (long cantidad) {
		saldo += cantidad;
	}
	
	void retirar (long cantidad) {
		if (cantidad <= saldo)
			saldo -= cantidad;
	}
	
	public static void main(String[] args) {
		CuentaBancaria cb = new CuentaBancaria();
		CuentaBancaria cb2 = new CuentaBancaria(35666, "Alguien", 25);
	}

}
