package tipodeDato;

public class Ejercicio5 {

	public static void main(String[] args) {
		String tal = "Pa la bras";
		String pa = tal.substring(0,2);
		String la = tal.substring(3,(tal.length()));
		String bras = tal.substring(6);
		System.out.println(pa);
		System.out.println(la);
		System.out.println(bras);
		System.out.println(tal.charAt((tal.length()-3)));
	}

}
