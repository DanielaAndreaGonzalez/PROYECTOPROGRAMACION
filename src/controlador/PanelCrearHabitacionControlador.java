/**
 * 
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Archivos;
import modelo.Habitacion;

/**
 * @author DanielaAGonzalezH
 *  Esta clase controla la vista de crear habitación.fxml 
 */
public class PanelCrearHabitacionControlador implements Initializable{
	
	
private ObservableList<Habitacion> lista_Habitaciones;
	
	private ObservableList<String> numeroCamas;
	private ObservableList<String> numeroBanios;
	private ObservableList<String> tipoHabitacion;
	
	
	private Habitacion habitacion;
	private static String ARCHIVO_HABITACIONES  = "habitaciones.txt";
	
	
	//labels
	
	
	@FXML
	private Label lblTituloCrearHabitacion;
	
	@FXML
	private Label lblTituloNumeroCamas;
	
	@FXML
	private Label lblTituloNumeroBanios;
	
	@FXML
	private Label lblTituloDescripcion;
	
	
	@FXML
	private Label lblTituloNumeroHabitacion;
	
	@FXML
	private Label lblTituloTipoHabitacion;
	
	@FXML
	private Label lblTituloValorHora;
	
	
	//Combobox
	
	@FXML
	private ComboBox<String> txtNumeroCamas;
	
	@FXML
	private ComboBox<String> txtNumeroBanios;
	
	
	@FXML
	private ComboBox<String> txtTipoHabitacion;
	
	
	//Text
	
	@FXML
	private TextField txtDescripcion; 
	
	
	@FXML
	private TextField txtValorHora;
	
	@FXML
	private TextField  txtNumeroHabitacion;
	
	
	//Buttons
	
	@FXML
	private Button btnCrearHabitacion;

	
	
	//Getters and setters
	

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
	
	//Métodos
	
	@FXML 
	public void guardarHabitacion() {
		
		
		String numeroCamas = this.txtNumeroCamas.getValue();
		String numeroBanios = this.txtNumeroBanios.getValue();
		String descripcion = this.txtDescripcion.getText();
		String numeroHabitacion = this.txtNumeroHabitacion.getText();
		int valorHora = Integer.parseInt(this.txtValorHora.getText());
		
		
		System.out.println("número camas"+numeroCamas);
		System.out.println("Número Banios" + numeroBanios);
		System.out.println("Descripcion" +descripcion);
		System.out.println("númerp habitaciones "+numeroHabitacion);
		System.out.println("Tipo habitacion"+tipoHabitacion);
		System.out.println("Valor hora"+valorHora);
		
		
		
		Habitacion nuevaHabitacion = new Habitacion(numeroCamas, numeroBanios, descripcion, numeroHabitacion , valorHora);
		
		this.habitacion = nuevaHabitacion;
		System.out.println("Habitación creada con éxito " +this.habitacion.getNumeroCamas());
		
		Alert alerta = new Alert(Alert.AlertType.INFORMATION);
		alerta.setHeaderText(null);
		alerta.setTitle("Información");
		alerta.setContentText("Se ha añadido correctamente");
		alerta.showAndWait();
		
		//Cerrar ventana
		Stage stage = (Stage)this.btnCrearHabitacion.getScene().getWindow();
		stage.close();	
	}
	
	
	
	@FXML 
	public void inicializarAtributos(ObservableList<Habitacion> listaHabitaciones) {
		
		this.lista_Habitaciones = listaHabitaciones;
		//Llenado de ComboBox de número de camas
		
		
		//this.paises =  FXCollections.observableArrayList();
		Archivos archivoNacionalidades = new Archivos(ARCHIVO_HABITACIONES);
		
		//this.paises.addAll(archivoNacionalidades.obtenerDatos());
		//this.txtNacionalidadAutor.setItems(paises);
		System.out.println("llenado de ComboBox Habiaciones"); 
		
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		this.lista_Habitaciones = FXCollections.observableArrayList();
		this.numeroCamas = FXCollections.observableArrayList();
		this.numeroBanios = FXCollections.observableArrayList();
	
		this.tipoHabitacion = FXCollections.observableArrayList();
		
		
		//ingreso de combobox
		
		numeroCamas.add("1");
		numeroCamas.add("2");
		numeroCamas.add("3");
		numeroCamas.add("4");
		numeroCamas.add("5");
		
		numeroBanios.add("1");
		numeroBanios.add("2");
		
		tipoHabitacion.add("suite");
		tipoHabitacion.add("Matrimonial");
		
		
		//envío de items al combobox
		
		this.txtNumeroCamas.setItems(numeroCamas);
		this.txtNumeroBanios.setItems(numeroBanios);
		this.txtTipoHabitacion.setItems(tipoHabitacion);
		
	}
	
	
	
//Fin de la clase
}

