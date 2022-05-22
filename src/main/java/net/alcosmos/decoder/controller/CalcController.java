package net.alcosmos.decoder.controller;

import net.alcosmos.decoder.decoder.B64Decoder;
import net.alcosmos.decoder.decoder.VL64Decoder;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalcController implements Controller {
	public static final String ERROR = "ERROR";
	
	@FXML
	private TextField encodeB64Text;
	
	@FXML
	private TextField decodeB64Text;
	
	@FXML
	private TextField encodeVL64Text;
	
	@FXML
	private TextField decodeVL64Text;
	
	@FXML
	private void encodeB64() {
		try {
			String number = B64Decoder.encode(Integer.parseInt(encodeB64Text.getText()));
			decodeB64Text.setText(number);
		} catch (Exception ignored) {
			decodeB64Text.setText(ERROR);
		}
	}
	
	@FXML
	private void decodeB64() {
		try {
			int number = B64Decoder.decode(decodeB64Text.getText().toCharArray());
			encodeB64Text.setText(String.valueOf(number));
		} catch (Exception ignored) {
			encodeB64Text.setText(ERROR);
		}
	}
	
	@FXML
	private void encodeVL64() {
		try {
			String number = VL64Decoder.encode(Integer.parseInt(encodeVL64Text.getText()));
			decodeVL64Text.setText(number);
		} catch (Exception ignored) {
			decodeVL64Text.setText(ERROR);
		}
	}
	
	@FXML
	private void decodeVL64() {
		try {
			int number = VL64Decoder.decode(decodeVL64Text.getText().toCharArray());
			encodeVL64Text.setText(String.valueOf(number));
		} catch (Exception ignored) {
			encodeVL64Text.setText(ERROR);
		}
	}
}
