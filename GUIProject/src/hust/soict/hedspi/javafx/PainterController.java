package hust.soict.hedspi.javafx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
public class PainterController {
	private Paint penColor;
    @FXML
    private ToggleGroup identical;
    
    @FXML
    private Pane drawingAreaPane;

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle = new Circle(event.getX(),
                event.getY(), 4, penColor);
        drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    void penButtonSelected(ActionEvent event) {
    	penColor = Color.BLACK;
    }

    @FXML
    void eraserButtonSelected(ActionEvent event) {
    	penColor = Color.WHITE;
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }
}