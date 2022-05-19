/**
 * 
 */
package controlador;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.Action;


import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import modelo.Archivos;
import modelo.Habitacion;



/**
 * @author DanielaAGonzalezH
 * Esta clase controla la vista del usuario administrador 
 *
 */
public class PanelAdministradorControlador implements Initializable{

	private Habitacion habitacion;
	private ArrayList <Habitacion> listaHabitaciones = new ArrayList<>();
	private ObservableList<Habitacion> lista_Habitaciones;
	private static String ARCHIVO_HABITACIONES  = "habitaciones.txt";
	private Archivos archivoHabitacion;
	
	//lbs
	@FXML
	private Label lblTituloTablaDatos;
	
	@FXML
	private Label lblTituloIdentificacion;
	
	@FXML
	private Label lblTituloNombre;
	
	@FXML
	private Label lblUsuario;
	
	
	//txts
	
	@FXML
	private TextField txtIdentificacion;
	
	@FXML
	private TextField txtNombre;
	
	@FXML
	private TextField txtUsuario;
	
	
	
	
	@FXML
	private TableView<Habitacion> tblTablaHabitaciones;
	
	
	@FXML
	private TableColumn colNumeroHabitacion;
	
	@FXML
	private TableColumn colTipoHabitacion;
	
	@FXML
	private TableColumn colNumeroCamas;
	
	@FXML
	private TableColumn colNumeroBanios;
	
	@FXML
	private TableColumn colValorhora;
	
	//Menuitem
	
	@FXML 
	private MenuItem btnCrearHabitacion;
	
	@FXML 
	private MenuItem btnAcercaDe;
	
	
	//Buttons
	
	@FXML
	private Button btnCerrarSesion;
	
	
	
	
	@FXML
	private void crearHabitacion(ActionEvent event) {
		try {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/vista/VistaCrearHabitacion.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			//stage.initStyle(StageStyle.UNDECORATED);
			stage.initStyle(StageStyle.UTILITY);
			stage.setTitle("Crear Habitación");
			stage.setScene(new Scene(root1));
			
			PanelCrearHabitacionControlador controlador = fxmlLoader.getController();
            controlador.inicializarAtributos(lista_Habitaciones);
			stage.showAndWait();
			
			Habitacion habitacionDevuelta = controlador.getHabitacion();
			
			if(habitacionDevuelta != null) {
				this.lista_Habitaciones.add(habitacionDevuelta);
				this.tblTablaHabitaciones.refresh();
			}
			
			if(this.archivoHabitacion.guardarHabitaciones(this.lista_Habitaciones)) {
				System.out.println("guardado autores exitoso");
			} else {
				System.out.println("guardado erróneo");
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void cerrarSesion(ActionEvent event) {
		
		
		Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
		//Preguntar del alert
		
		
		System.out.println("Salir");
		try {
		//Node source = (Node) event.getSource();
		//Stage stage = (Stage) source.getScene().getWindow();
		//stage.close();
		Platform.exit();
	     System.exit(0);
		} catch(Exception e) {
			System.out.println("error al salir");
		}
		
		
		
	}
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		this.lista_Habitaciones = FXCollections.observableArrayList();
		this.tblTablaHabitaciones.setItems(lista_Habitaciones);
		this.archivoHabitacion = new Archivos(ARCHIVO_HABITACIONES);
		
		
		this.colNumeroHabitacion.setCellValueFactory(new PropertyValueFactory<>("numeroHabitacion"));
		this.colTipoHabitacion.setCellValueFactory(new PropertyValueFactory<>("idTipoHabitacion"));
		this.colNumeroCamas.setCellValueFactory(new PropertyValueFactory<>("numeroCamas"));
		this.colNumeroBanios.setCellValueFactory(new PropertyValueFactory<>("numeroBanios"));
		this.colValorhora.setCellValueFactory(new PropertyValueFactory<>("valorHora"));
		
		
		
		
		if(!this.archivoHabitacion.existe()) {
        	this.archivoHabitacion.crearArchivo();
        	System.out.println("archivo " +  ARCHIVO_HABITACIONES + " creado");
        } else {
        	System.out.println("archivo " + ARCHIVO_HABITACIONES + " existe");
        }
	}
		
		
//Fin de la clase 
	

}
