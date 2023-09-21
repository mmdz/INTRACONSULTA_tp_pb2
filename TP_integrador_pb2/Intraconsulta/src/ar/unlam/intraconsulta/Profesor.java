package ar.unlam.intraconsulta;

import java.util.Date;

/*Alumno: Representa a los estudiantes de la institución y almacena
 *  datos personales como nombre, apellido, fecha de nacimiento,
 *   fecha de ingreso, entre otros.
Profesor: Similar a la clase Alumno, pero para docentes.
*/
public class Profesor {
	private Integer dni;
	private String apellido;
	private String nombre;
	private Date fechaNacimiento;
	private Date fechaIngresoComoDocente;
	
	public Profesor() {}
	
	public Profesor(Integer dni, String apellido, String nombre, Date fechaNacimiento, Date fechaIngresoComoDocente) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaIngresoComoDocente = fechaIngresoComoDocente;
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

	public Date getFechaIngresoComoDocente() {
		return fechaIngresoComoDocente;
	}

	public void setFechaIngresoComoDocente(Date fechaIngresoComoDocente) {
		this.fechaIngresoComoDocente = fechaIngresoComoDocente;
	}
	
	
	
}
