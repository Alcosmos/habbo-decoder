package net.alcosmos.decoder.controller;

import net.alcosmos.decoder.PageType;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import net.alcosmos.decoder.drawer.*;

public class FrameController implements Controller {
	@FXML
	private GridPane frameGrid;
	@FXML
	private GridPane contentGrid;
	
	@FXML
	private GridPane frameBottomGrid;
	
	@FXML
	private Text topTextContent;
	
	private Frame frame;
	
	private Parent calcParent;
	private Parent wireParent;
	private Parent charParent;
	private Parent aboutParent;
	
	public FrameController() {
		calcParent = new CalcDrawer().draw();
		wireParent = new WireDrawer().draw();
		charParent = new CharDrawer().draw();
		aboutParent = new AboutDrawer().draw();
	}
	
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	
	public void setContent(Parent content) {
		if (contentGrid.getChildren().size() > 0) {
			contentGrid.getChildren().remove(0);
		}
		
		contentGrid.add(content, 0, 0);
	}
	
	@FXML
	private void goToPage1() {
		setPage(PageType.PAGE1);
	}
	
	@FXML
	private void goToPage2() {
		setPage(PageType.PAGE2);
	}
	
	@FXML
	private void goToPage3() {
		setPage(PageType.PAGE3);
	}
	
	@FXML
	private void goToPage4() {
		setPage(PageType.PAGE4);
	}
	
	private void setPage(PageType page) {
		resetPageButtons();
		
		ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/frames/window/bottom/frame_bottom_button_" + page.toString() + "_pressed.png")));
		frameBottomGrid.add(imageView, page.getValue(), 1);
		
		switch (page) {
			case PAGE1:
				imageView.setOnMouseClicked(event -> goToPage1());
				setContent(calcParent);
				
				break;
			case PAGE2:
				imageView.setOnMouseClicked(event -> goToPage2());
				setContent(wireParent);
				
				break;
			case PAGE3:
				imageView.setOnMouseClicked(event -> goToPage3());
				setContent(charParent);
				
				break;
			case PAGE4:
				imageView.setOnMouseClicked(event -> goToPage4());
				setContent(aboutParent);
				
				break;
		}
	}
	
	private void resetPageButtons() {
		ImageView imageView1 = new ImageView(new Image(getClass().getResourceAsStream("/images/frames/window/bottom/frame_bottom_button_1.png")));
		imageView1.setOnMouseClicked(event -> goToPage1());
		frameBottomGrid.add(imageView1, 1, 1);
		
		ImageView imageView2 = new ImageView(new Image(getClass().getResourceAsStream("/images/frames/window/bottom/frame_bottom_button_2.png")));
		imageView2.setOnMouseClicked(event -> goToPage2());
		frameBottomGrid.add(imageView2, 2, 1);
		
		ImageView imageView3 = new ImageView(new Image(getClass().getResourceAsStream("/images/frames/window/bottom/frame_bottom_button_3.png")));
		imageView3.setOnMouseClicked(event -> goToPage3());
		frameBottomGrid.add(imageView3, 3, 1);
		
		ImageView imageView4 = new ImageView(new Image(getClass().getResourceAsStream("/images/frames/window/bottom/frame_bottom_button_4.png")));
		imageView4.setOnMouseClicked(event -> goToPage4());
		frameBottomGrid.add(imageView4, 4, 1);
	}
	
	public void setTitle(String title) {
		topTextContent.setText(title);
	}
	
	@FXML
	protected void setMouseCoords(MouseEvent event) {
		frame.setMouseCoords(event);
	}
	
	@FXML
	protected void moveWindow(MouseEvent event) {
		frame.moveWindow(event);
	}
	
	@FXML
	private void closeWindow() {
		frame.closeWindow();
	}
}
