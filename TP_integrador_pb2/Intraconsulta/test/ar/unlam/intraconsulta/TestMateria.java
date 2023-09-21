package ar.unlam.intraconsulta;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMateria {
	// agregarMateria
	// No se puede agregar 2 materias con mismo Id
	@Test
	public void queSePuedaAgregarUnaMateria() {
		Integer Id = 3000;
		String nombre = "Programacion avanzada";
		Integer correlativa = 2996;
		Materia materia = new Materia(Id, nombre, correlativa);
		Boolean registroExitoso = materia.agregar(materia);
		assertTrue(registroExitoso);
	}
	
	@Test
	public void queNoSePuedanAgregarDosMateriasConMismoID() {
		
	}
//	@Test
//	public void queSePuedaRegistrarUnAlumnoAUnaUniversidad() {
//		String nombre = "Unlam";
//		Universidad unlam = new Universidad(nombre);
//		nombre = "Marta";
//		String apellido = "perez";
//		Integer dni = 44555;
//		Alumno alumno = new Alumno(dni, apellido, nombre);
//		Boolean registroExitoso = unlam.registrar(alumno);
//		assertTrue(registroExitoso);
//
//	}
}
