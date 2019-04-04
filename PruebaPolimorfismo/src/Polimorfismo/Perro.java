package Polimorfismo;

public class Perro extends Animal {
	private String nombre;
	
	public Perro(String especie, String nombre) {
		super(especie);
		this.nombre = nombre;
	}
	public void printMensaje() {
		super.printMensaje();
		System.out.println("Soy un perro que ladra");
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
