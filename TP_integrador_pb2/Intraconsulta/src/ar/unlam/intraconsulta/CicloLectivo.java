package ar.unlam.intraconsulta;

import java.time.LocalDate;
import java.util.Date;

/*CicloLectivo: Describe un período académico, con 
 * fechas de inicio y finalización, así como fechas para inscripciones.*/
public class CicloLectivo {
	//uso de localdate es mejore que date
	
	public LocalDate fechaDeInicio;
	public LocalDate fechaDeFinalizacion;
	public LocalDate fechaDeInscripcion;
	
	
	public CicloLectivo() {}
	
	public CicloLectivo(LocalDate fechaDeInicio, LocalDate fechaDeFin, LocalDate FechaDeInscripcion) {
		this.fechaDeInicio = fechaDeInicio;
		this.fechaDeFinalizacion = fechaDeFin;
		this.fechaDeInscripcion = FechaDeInscripcion;
	}

	
	
	public Date getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(Date fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

	public Date getFechaDeFinalizacion() {
		return fechaDeFinalizacion;
	}

	public void setFechaDeFinalizacion(Date fechaDeFinalizacion) {
		this.fechaDeFinalizacion = fechaDeFinalizacion;
	}

	public Date getFechaDeInscripcion() {
		return fechaDeInscripcion;
	}

	public void setFechaDeInscripcion(Date fechaDeInscripcion) {
		this.fechaDeInscripcion = fechaDeInscripcion;
	}
	
	

	

}
