/**
 * 
 */
package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author DanielaAGonzalezH
 *Es una clase que contiene las variables y sus métodos de obtención y modificación para crear o instanciar una reserva
 */
public class Reserva {
	//Delcaracion variables
	
	protected String idReserva;
	protected LocalDate fechaInicio;
	protected LocalDateTime horaInicio;
	protected LocalDate fechaFin;
	protected LocalDateTime horaFin;
	protected Usuario usuario;
	protected Habitacion habitacion;
	/**
	 * @return the idReserva
	 */
	public String getIdReserva() {
		return idReserva;
	}
	/**
	 * @param idReserva the idReserva to set
	 */
	public void setIdReserva(String idReserva) {
		this.idReserva = idReserva;
	}
	/**
	 * @return the fechaInicio
	 */
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	/**
	 * @return the horaInicio
	 */
	public LocalDateTime getHoraInicio() {
		return horaInicio;
	}
	/**
	 * @param horaInicio the horaInicio to set
	 */
	public void setHoraInicio(LocalDateTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	/**
	 * @return the fechaFin
	 */
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	/**
	 * @return the horaFin
	 */
	public LocalDateTime getHoraFin() {
		return horaFin;
	}
	/**
	 * @param horaFin the horaFin to set
	 */
	public void setHoraFin(LocalDateTime horaFin) {
		this.horaFin = horaFin;
	}
	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the habitacion
	 */
	public Habitacion getHabitacion() {
		return habitacion;
	}
	/**
	 * @param habitacion the habitacion to set
	 */
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	/**
	 * @param idReserva
	 * @param fechaInicio
	 * @param horaInicio
	 * @param fechaFin
	 * @param horaFin
	 * @param usuario
	 * @param habitacion
	 */
	public Reserva(String idReserva, LocalDate fechaInicio, LocalDateTime horaInicio, LocalDate fechaFin,
			LocalDateTime horaFin, Usuario usuario, Habitacion habitacion) {
		super();
		this.idReserva = idReserva;
		this.fechaInicio = fechaInicio;
		this.horaInicio = horaInicio;
		this.fechaFin = fechaFin;
		this.horaFin = horaFin;
		this.usuario = usuario;
		this.habitacion = habitacion;
	}
	
	
	
	
	
	
	
	
	
	
	

}
