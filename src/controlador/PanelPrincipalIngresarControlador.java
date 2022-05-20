/**
 * 
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modelo.Habitacion;

/**
 * @author DanielaAGonzalezH
 *
 */
public class PanelPrincipalIngresarControlador implements Initializable {
	
	
	//Labels
	@FXML
	private Label lblTituloRoyal;
	
	@FXML 
	private Label lblTituloUsuario;
	
	@FXML
	private Label lblTituloContrasenia;
	
	
	//TExts fields
	
	@FXML
	private TextField txtUsuarioIngresar;
	
	@FXML
	private TextField txtContrasenia;
	
	
	@FXML
	private Button btnIngresar;
	
	
	/**
	 * Método ingresar, abre la ventana correspondiente a cada usuario
	 */
	
	@FXML
	public void ingresar() {
		
		if (this.txtUsuarioIngresar.getText().equals("admin")) {
			
			try {
				
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/vista/vistaPanelAdministrador.fxml"));
				Parent root1 = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.initModality(Modality.APPLICATION_MODAL);
				//stage.initStyle(StageStyle.UNDECORATED);
				stage.initStyle(StageStyle.UTILITY);
				stage.setTitle("Panel Administrador");
				stage.setScene(new Scene(root1));	
				stage.showAndWait();	
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		else {
			
			if (this.txtUsuarioIngresar.getText().equals("usuario")) {
				try {
					
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/vista/vistaUsuarioCliente.fxml"));
					Parent root1 = (Parent) fxmlLoader.load();
					Stage stage = new Stage();
					stage.initModality(Modality.APPLICATION_MODAL);
					//stage.initStyle(StageStyle.UNDECORATED);
					stage.initStyle(StageStyle.UTILITY);
					stage.setTitle("Crear Reserva");
					stage.setScene(new Scene(root1));	
					stage.showAndWait();
				} catch (Exception e) {
					e.printStackTrace();
			  }
		  }
			
	   }
		
   }
	
	
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
