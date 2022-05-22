package net.alcosmos.decoder.drawer;

import net.alcosmos.decoder.DecoderApplication;
import net.alcosmos.decoder.controller.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public abstract class Drawer {
	FXMLLoader fxmlLoader;
	
	public Parent draw(String fxml) {
		try {
			fxmlLoader = new FXMLLoader(DecoderApplication.class.getResource(fxml));
			
			return fxmlLoader.load();
		} catch (IOException ex) {
			ex.printStackTrace();
			
			return null;
		}
	}
	
	public abstract Parent draw();
	
	public Controller getController() {
		return fxmlLoader.getController();
	}
}
