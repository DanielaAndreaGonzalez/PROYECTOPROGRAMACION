/**
 * 
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import javafx.collections.ObservableList;

/**
 * @author DanielaAGonzalezH
 * Esta clase tiene por objetivo crear, eliminar, consultar y actualizar un archivo txt
 */
public class Archivos {
	
	
	private String nombreArchivo;
	
	public Archivos(String nombreArchivo) {
		
		this.nombreArchivo = nombreArchivo;
	}
	
	
	/**
	 * Método el cual consulta los datos y nos añade a un arrayList
	 * @return
	 */
	public ArrayList<String> obtenerDatos(){
	
		ArrayList<String> listaDatos = new ArrayList<String>();
		
		try {
			File file = new File(this.nombreArchivo);
			Scanner scanner = new Scanner(file);
		    while(scanner.hasNextLine()) {
		    	listaDatos.add(scanner.nextLine());
		    } 
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaDatos;
	}
	/**
	 * Método el cual busca si existe o no el archivo 
	 * @return una true si el archivo existe o un false si no existe
	 */
	public boolean existe() {
		File file = new File(this.nombreArchivo);
		if(file.exists() && !file.isDirectory()){
	        return true;
	    }else{
	        return false;
	    }
	}
	/**
	 * Método el cual crea un archivo txt
	 * @return true si el archivo ya existe no se puede crear y un false si no existe y lo crea
	 */
	public boolean crearArchivo() {
		boolean bandera = false;
		try {
			File file = new File(this.nombreArchivo);
			if (!file.exists()) {
				file.createNewFile();
				bandera = true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return bandera;
		}
		return bandera;
	}
	/**
	 * Método el cual guarda las habitaciones desde el formulario crear habitación
	 * @param listaHabitacion
	 * @return un true si se guardó de manera correcta la habitación
	 */
	public boolean guardarHabitaciones(ObservableList<Habitacion> listaHabitacion) {
		boolean bandera = false;
		ArrayList<Habitacion> datos = new ArrayList<Habitacion>();
		datos.addAll(listaHabitacion);
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(this.nombreArchivo);
            pw = new PrintWriter(fichero);
            String cadena = "";
            for(Habitacion a:datos) {
            	
            	cadena = a.getNumeroHabitacion();
            	//cadena = a.getNumeroHabitacion()+","+a.getDescripcion()+","+a.getIdTipoHabitacion().getNombre()+"\n";
            	pw.print(cadena);
            }  
            bandera = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	try {
        		if (null != fichero)
        		   fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
		return bandera;
	}
	
	
	public ArrayList<Habitacion> leerHabitacion(){
	
		ArrayList<Habitacion> listaHabitacionesLeida= new ArrayList<Habitacion>();
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;

	    try {
	    	// Apertura del fichero y creacion de BufferedReader para poder
	    	// hacer una lectura comoda (disponer del metodo readLine()).
	    	archivo = new File (this.nombreArchivo);
	    	fr = new FileReader (archivo);
	    	br = new BufferedReader(fr);

	    	// Lectura del fichero
	    	String linea = "";
	    	String separador = Pattern.quote(",");
	    	
	    	while((linea = br.readLine()) != null) {
	    		// System.out.println(linea);
	    		String lineaDividida[] = linea.split(separador);
	    		//System.out.println(Arrays.asList(lineaDividida));
	    	
	    		//PENDIENTE
	    		//Habitacion obj = new Habitacion(lineaDividida[0],lineaDividida[1],lineaDividida[2]);
	    		//listaAutoresLeida.add(obj);
	    	}
	    } catch(Exception e){
	    	e.printStackTrace();
	    } finally{
	    	// En el finally cerramos el fichero, para asegurarnos
	    	// que se cierra tanto si todo va bien como si salta 
	    	// una excepcion.
	    	try {                    
	    		if (null != fr) {   
	    			fr.close();     
	            }                  
	    	} catch (Exception e2) { 
	    		e2.printStackTrace();
	    	}
	    }
	    /*
	    for(Autor a:listaAutoresLeida) {
	    	System.out.println("Autores leidos del archivo");
	    	System.out.println("nombre:"+a.getNombre()+"nacionalidad:"+a.getNacionalidad()+
	    			"fechaNac:"+a.getFechaNacimiento());
	    }
	    */
	    return listaHabitacionesLeida;
	}
		
	
	
	
	
	
	
	
	

}
