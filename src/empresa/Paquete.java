package empresa;

public class Paquete {
	
	private int numReferencia;
	private String dni;
	private double peso;
	private int prioridad;
	
	
	public Paquete(int numReferencia, String dni, double peso, int prioridad) {
		
		this.numReferencia = numReferencia;
		this.dni = dni;
		this.peso = peso;
		this.prioridad = prioridad;
	}


	public int getNumReferencia() {
		return numReferencia;
	}


	public String getDni() {
		return dni;
	}


	public double getPeso() {
		return peso;
	}


	public int getPrioridad() {
		return prioridad;
	}
	
	
	
	public String mostrarDatos() {
		
		return "\n Número del paquete: "+numReferencia+"\nDni: "+dni+"\nPeso: "+peso+"\nPrioridad: "+prioridad;
	}
	
	
	
	
}