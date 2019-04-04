package operadores;

public  class Ejemplo1 {
	static int i = 1, j = 1, k = 1;
	
	public static void tal() {
		
		System.out.println("i = " + i + " j = " + j + " k = " +k );
		i = 1; j = 1; k = 1;
	}
	
	public static void main(String[] args) {		
		tal();
		i = ++j;
		tal();		
		i = k++;
		tal();		
		i = k + ++j;
		tal();		
		i = i + j++;
		tal();		
		i = j + ++k;
		tal();		
		i = ++j + k++;
		tal();		
		j = k-- + --i;
		tal();		
		i = k + 1 + ++j;
		tal();		
		i = ++i + --j + k++;
		tal();		
		k = j-- + ++k;
		tal();	

	}

}
