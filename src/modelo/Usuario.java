/**
 * 
 */
package modelo;

/**
 * @author DanielaAGonzalezH
 *Es una clase hija y tiene como objetivo heredar m�todos de la clase padre (Persona)
 */
public class Usuario extends Persona{

	public Usuario(String nombre, String apellido, String telefono, String direccion, int edad, String correo,
			String contrasena, TipoUsuario tipoUsuario) {
		super(nombre, apellido, telefono, direccion, edad, correo, contrasena, tipoUsuario);
		
	}
	
	

}
