package net.alcosmos.decoder.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CharController implements Controller {
	public static final String ERROR = "ERROR";
	
	@FXML
	private TextField numberText;
	
	@FXML
	private TextField charText;
	
	@FXML
	private void makeNumber() {
		try {
			if (charText.getText().length() == 1) {
				String number = String.valueOf((int)charText.getText().charAt(0));
				numberText.setText(number);
			} else {
				numberText.setText(ERROR);
			}
		} catch (Exception ignored) {
			numberText.setText(ERROR);
		}
	}
	
	@FXML
	private void makeText() {
		try {
			String character = Character.toString((char)(int)Integer.valueOf(numberText.getText()));
			charText.setText(character);
		} catch (Exception ignored) {
			charText.setText(ERROR);
		}
	}
}
