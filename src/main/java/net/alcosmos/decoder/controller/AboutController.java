package net.alcosmos.decoder.controller;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class AboutController implements Controller {
	@FXML
	private Text easterEgg1;
	
	@FXML
	private Text easterEgg2;
	
	@FXML
	private Text easterEgg3;
	
	@FXML
	private Text easterEgg4;
	
	@FXML
	protected void onEasterEgg() {
		easterEgg1.setText("011010000110010101101100");
		easterEgg2.setText("011011000110111101101101");
		easterEgg3.setText("01101111011101000111010001101111");
		easterEgg4.setText("Beep beep boop boop!");
	}
}
