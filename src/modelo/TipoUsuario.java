/**
 * 
 */
package modelo;

/**
 * @author DanielaAGonzalezH
 *Es una clase enumerada y tiene los dos únicos tipos de usuario que tendrá el programa
 */
public enum TipoUsuario {
	
	//Declaracion enums
	
	ADMINISTRADOR ((String) "1", (String) "Administrador", (String) "El administrador de la página"),
	CLIENTE((String) "2", (String) "Cliente" , (String) "El usuario que usa de la aplicación");
	
	//Declaracion variables
	
	protected String id;
	protected String nombre;
	protected String descripcion;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 */
	private TipoUsuario(String id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	
	

}
