package excepciones;

public class Canine {
	public double getAverageWeight() {
		return 50;
	}
	
	
	public static void main(String[] args) {
		Wolf w = new Wolf();
		try {
		System.out.println(w.getAverageWeight());}
		catch (Error t) {
			System.out.println(t.fillInStackTrace());
		}

	}

}

class Wolf extends Canine {
	public double getAverageWeight() {
		return getAverageWeight() + 20;
	}
}
