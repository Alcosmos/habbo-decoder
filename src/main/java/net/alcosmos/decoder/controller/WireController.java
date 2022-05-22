package net.alcosmos.decoder.controller;

import net.alcosmos.decoder.decoder.VL64Decoder;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class WireController implements Controller {
	public static final char LF = '\n';
	
	@FXML
	private TextField vl64Text;
	
	@FXML
	private GridPane resultGrid;
	
	@FXML
	private void decode() {
		TextArea textArea = new TextArea("");
		textArea.setText("Result for this string was:" + LF);
		
		VBox vBox = new VBox();
		vBox.getChildren().add(textArea);
		
		try {
			List<char[]> strings = new ArrayList<>();
			
			if (resultGrid.getChildren().size() > 0) {
				resultGrid.getChildren().remove(0);
			}
			
			char[] chars = vl64Text.getText().toCharArray();
			
			for (int i = 0; i < chars.length; i++) {
				int curLength = VL64Decoder.getLength((byte)chars[i]);
				
				char[] thisVL64 = new char[curLength];
				char[] thisNumber = new char[curLength];
				
				for (int j = 0; j < curLength; j++) {
					thisVL64[j] = chars[i];
					thisNumber[j] = chars[i];
					
					i++;
				}
				
				strings.add(thisNumber);
				i--;
				
				textArea.setText(textArea.getText() + "# " + new String(thisVL64) + " = " + VL64Decoder.decode(thisNumber) + LF);
			}
			
			String summary = LF + "String summary:" + LF;
			
			for (char[] thisString : strings) {
				summary += new String(thisString) + '-';
			}
			
			summary = summary.substring(0, summary.length() - 1);
			
			textArea.setText(textArea.getText() + summary);
		} catch (Exception ignored) {
			textArea.setText(textArea.getText() + "ERROR; unable to continue" + LF);
		} finally {
			resultGrid.add(vBox, 0, 0);
		}
	}
}
