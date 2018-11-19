import java.util.Date;

public class Persona {

	private String nombre, apellido;
	private Long id;
	private Date fecha;
	
	
	public Persona(String nombre, String apellido, Long id, Date fecha) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.fecha = fecha;
	}
	
	public Persona() {
		// TODO Auto-generated constructor stub
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
