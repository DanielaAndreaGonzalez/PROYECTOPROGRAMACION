/**
 * 
 */
package modelo;

/**
 * @author DanielaAGonzalezH
 * clase enumerada la cual contiene lo diferentes tipos de habitación que hay en el hotel
 */
public enum TipoHabitacion {
	
	/*
	 * Declaración enumerados
	 */
	
	SUITE ((String) "1", (String) "Suite", (String) "Habitacion doble con baño de 12 m2"),
	JUNIOR_SUITE ((String) "2", (String) "Junior Suite", (String) "Habitacion doble con baño de 8m2"),
	GRAN_SUITE ((String) "3", (String) "Gran Suite", (String) "Dos o más  habitaciones doble con baño de 8m2"),
	INDIVIDUALES ((String) "4", (String) "Individuales", (String) "Habitacion sencilla con una cama de 6m2"),
	DOBLES ((String) "5", (String) "Dobles", (String) "Habitacion doble sencilla desde 11m2"),
	CUADRUPLES ((String) "6", (String) "Cuadruples", (String) "Habitacion desde 17 m2");
	
	
	//Declaración de variables
	
	protected String id;
	protected String nombre;
	protected String descripcion;
	
	/**
	 * Id
	 * @return
	 */
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * Nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Descripcion
	 * @return
	 */
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param descripcion
	 */
	private TipoHabitacion(String id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	
	
	
	

}
