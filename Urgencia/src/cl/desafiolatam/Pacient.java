package cl.desafiolatam;

public class Pacient {

	private int num;
	private String nombre;
	private String apellido;
	private int edad;
	private String prevision;
	private String motivo;
	private String categoria;
	
	public Pacient
	(int num, String nombre, String apellido, int edad, String prevision, String motivo, String categoria) {
		this.num = num;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.prevision = prevision;
		this.motivo = motivo;
		this.categoria = categoria;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPrevision() {
		return prevision;
	}

	public void setPrevision(String prevision) {
		this.prevision = prevision;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String toString() {
		return "Empledo {" + "Numero = " + num + ", Nombre = " + nombre + ", Edad = " + edad + ", Prevision = " + prevision+ ", Motivo = " + motivo+ ", Categoria = " + categoria + "}";
	}
}
