
public interface CuentaBancaria {
	Integer abrirCuenta(String nombreTitular);
}


class CuentaNomina implements CuentaBancaria{
	
	public Integer abrirCuenta(String nombreTitular) {
		return 12;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}