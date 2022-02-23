package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField txtNum1;
	
	@FXML
	private TextField txtNum2;
	
	@FXML
	private Button btSoma;
	
	@FXML
	private Label labelResultado;
	
	@FXML
	public void onBtSomaAction() {
		try {
			Locale.setDefault(Locale.US);
			double n1 = Double.parseDouble(txtNum1.getText());
			double n2 = Double.parseDouble(txtNum2.getText());
			double soma = n1 + n2;
			labelResultado.setText(String.format("%.2f", soma));
		}
		catch(NumberFormatException e) {
			Alerts.showAlert("Erro", "Erro de análise", e.getMessage(), AlertType.ERROR);
		}
		
	
	
	}
}
