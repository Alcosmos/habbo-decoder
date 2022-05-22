module net.alcosmos.decoder {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens net.alcosmos.decoder to javafx.fxml;
	exports net.alcosmos.decoder;
	exports net.alcosmos.decoder.decoder;
	opens net.alcosmos.decoder.decoder to javafx.fxml;
	exports net.alcosmos.decoder.drawer;
	opens net.alcosmos.decoder.drawer to javafx.fxml;
	exports net.alcosmos.decoder.controller;
	opens net.alcosmos.decoder.controller to javafx.fxml;
}
