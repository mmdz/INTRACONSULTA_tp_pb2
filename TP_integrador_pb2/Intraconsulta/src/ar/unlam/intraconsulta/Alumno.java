package ar.unlam.intraconsulta;

import java.util.Date;

/*Alumno: Representa a los estudiantes de la institución y 
 * almacena datos personales como nombre, apellido, fecha 
 * de nacimiento,fecha de ingreso, entre otros*/
public class Alumno {

	private Integer dni;
	private String apellido;
	private String nombre;
	private Date fechaNacimiento;
	private Date fechaIngreso;
	//private String carrera;

	public Alumno() {}
	
	public Alumno(Integer dni, String apellido, String nombre, Date fechaNacimiento, Date fechaIngreso) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
	
}
