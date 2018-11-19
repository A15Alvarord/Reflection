public class Persona {

	private String nombre, apellido;
	private static int contadorDeInstancias;
	
	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		contadorDeInstancias++;
	}

	public Persona() {
		contadorDeInstancias++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private static int getContadorDeInstancias() {
		return contadorDeInstancias;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
