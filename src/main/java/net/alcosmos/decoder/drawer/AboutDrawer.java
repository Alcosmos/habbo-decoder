package net.alcosmos.decoder.drawer;

import javafx.scene.Parent;

public class AboutDrawer extends Drawer {
	@Override
	public Parent draw() {
		return super.draw("about-view.fxml");
	}
}
