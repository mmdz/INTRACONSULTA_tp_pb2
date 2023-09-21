package ar.unlam.intraconsulta;
/*Materia: Contiene información sobre las materias ofrecidas,
 *  incluyendo su identificación única (ID) y nombre.*/

public class Materia {

	private Integer id;
	private String nombre;
	private Integer correlativa;
	

	public Materia() {}
	
	public Materia(Integer id, String nombre, Integer correlativa) {
		this.id = id;
		this.nombre = nombre;
		this.correlativa = correlativa;
	}

	
	//metodos
	
	public Boolean agregar(Materia materia) {
		//if(id.equals(id))
		return null;
	}

	
	//getter y setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCorrelativa() {
		return correlativa;
	}

	public void setCorrelativa(Integer correlativa) {
		this.correlativa = correlativa;
	}

	

}
