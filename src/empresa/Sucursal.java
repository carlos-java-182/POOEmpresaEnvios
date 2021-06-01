package empresa;

public class Sucursal {

	private int numero;
	private String direccion;
	private String ciudad;

	public Sucursal(int numero, String direccion, String ciudad) {

		this.numero = numero;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

	public int getNumero() {
		return numero;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}
	
	public String mostrarDatosSucursal() {
		return "Numero sucursal: "+numero+"\nDirección: "+direccion+"\nCiudad: "+ciudad;
	}
	
	public double calcularPrecio(Paquete t) {
		double precio;
		precio=t.getPeso();
		
		if(t.getPrioridad()==1) {
			precio+=10;
		}
		if(t.getPrioridad()==2) {
			precio+=20;
		}
		
		return precio;
	}

}
