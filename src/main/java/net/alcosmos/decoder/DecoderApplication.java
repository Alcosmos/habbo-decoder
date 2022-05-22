package net.alcosmos.decoder;

import net.alcosmos.decoder.drawer.CalcDrawer;
import net.alcosmos.decoder.drawer.Frame;
import javafx.application.Application;
import javafx.stage.*;

public class DecoderApplication extends Application {
	@Override
	public void start(Stage stage) {
		System.out.println(System.getProperty("user.dir"));
		
		CalcDrawer calcDrawer = new CalcDrawer();
		
		Frame frame = new Frame(stage);
		frame.setTitle("Habbo Decoder");
		frame.setContent(calcDrawer.draw());
		frame.addStyle("content-style.css");
	}
	
	public static void main(String[] args) {
		/*
		 * This might make fonts uglier in Windows,
		 * but that is a sacrifice I am willing to make
		 */
//		System.setProperty("prism.lcdtext", "false");
//		System.setProperty("prism.text", "t2k");
		
		launch();
	}
}
