/**
 * 
 */
package modelo;

/**
 * @author DanielaAGonzalezH
 * Esta clase contiene las vairables y sus métodos de obtención y modificación para la creación de una habitación 
 */
public class Habitacion {
	
	//Declaración de variables
	
	protected int id =0;
	protected String numeroCamas;
	protected String numeroBanios;
	protected String descripcion;
	protected String numeroHabitacion;
	protected Hotel idHotel;
	protected TipoHabitacion idTipoHabitacion;
	protected boolean estado;
	protected double valorHora;
	
	
	
	/**
	 * ID
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Numero camas
	 * @return
	 */
	public String getNumeroCamas() {
		return numeroCamas;
	}
	public void setNumeroCamas(String numeroCamas) {
		this.numeroCamas = numeroCamas;
	}
	/**
	 * Numero baños
	 * @return
	 */
	public String getNumeroBanios() {
		return numeroBanios;
	}
	public void setNumeroBanios(String numeroBanios) {
		this.numeroBanios = numeroBanios;
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
	 * Numero Habitación
	 * @return
	 */
	public String getNumeroHabitacion() {
		return numeroHabitacion;
	}
	public void setNumeroHabitacion(String numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}
	/**
	 * Id hotel
	 * @return
	 */
	public Hotel getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Hotel idHotel) {
		this.idHotel = idHotel;
	}
	/**
	 * Tipo habitacion
	 * @return
	 */
	public  String getIdTipoHabitacion() {
		
		
		return idTipoHabitacion.toString();
	}
	public void setIdTipoHabitacion(TipoHabitacion idTipoHabitacion) {
		this.idTipoHabitacion = idTipoHabitacion;
	}
	/**
	 * Estado
	 * @return
	 */
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	/**
	 * Valor hora
	 * @return
	 */
	public double getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	/**
	 * @param numeroCamas
	 * @param numeroBanios
	 * @param descripcion
	 * @param numeroHabitacion
	 * @param idHotel
	 * @param idTipoHabitacion
	 * @param estado
	 * @param valorHora
	 */
	public Habitacion(String numeroCamas, String numeroBanios, String descripcion, String numeroHabitacion,
		 TipoHabitacion idTipoHabitacion, boolean estado, double valorHora) {
		super();
		this.numeroCamas = numeroCamas;
		this.numeroBanios = numeroBanios;
		this.descripcion = descripcion;
		this.numeroHabitacion = numeroHabitacion;
		this.idTipoHabitacion = idTipoHabitacion;
		this.estado = estado;
		this.valorHora = valorHora;
	}
	
	/**
	 * @param numeroCamas
	 * @param numeroBanios
	 * @param descripcion
	 * @param numeroHabitacion
	 * @param idTipoHabitacion
	 * @param valorHora
	 */
	public Habitacion(String numeroCamas, String numeroBanios, String descripcion, String numeroHabitacion,
			TipoHabitacion idTipoHabitacion, double valorHora) {
		super();
		this.numeroCamas = numeroCamas;
		this.numeroBanios = numeroBanios;
		this.descripcion = descripcion;
		this.numeroHabitacion = numeroHabitacion;
		this.idTipoHabitacion = idTipoHabitacion;
		this.valorHora = valorHora;
	}
	/**
	 * @param numeroCamas
	 * @param numeroBanios
	 * @param descripcion
	 * @param numeroHabitacion
	 * @param valorHora
	 */
	public Habitacion(String numeroCamas, String numeroBanios, String descripcion, String numeroHabitacion,
			double valorHora) {
		super();
		this.numeroCamas = numeroCamas;
		this.numeroBanios = numeroBanios;
		this.descripcion = descripcion;
		this.numeroHabitacion = numeroHabitacion;
		this.valorHora = valorHora;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
