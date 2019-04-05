package excepciones;

public class Canine {
	public double getAverageWeight() {
		return 50;
	}
	
	
	public static void main(String[] args) {
		Wolf w = new Wolf();
		System.out.println(w.getAverageWeight());

	}

}

class Wolf extends Canine {
	public double getAverageWeight() {
		return getAverageWeight() + 20;
	}
}
