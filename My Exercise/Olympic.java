import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;

public class Olympic extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage stage) {
		// Create a pane
		Pane pane = new Pane();
		
		// Create 5 circles and set its properties
		Circle c1 = new Circle();
		c1.setCenterX(200);
		c1.setCenterY(200);
		c1.setRadius(75);
		c1.setStroke(Color.BLUE);
		c1.setFill(null);
		pane.getChildren().add(c1);
		
		Circle c2 = new Circle();
		c2.setCenterX(380);
		c2.setCenterY(200);
		c2.setRadius(75);
		c2.setStroke(Color.BLACK);
		c2.setFill(null);
		pane.getChildren().add(c2);
		
		Circle c3 = new Circle();
		c3.setCenterX(560);
		c3.setCenterY(200);
		c3.setRadius(75);
		c3.setStroke(Color.RED);
		c3.setFill(null);
		pane.getChildren().add(c3);
		
		Circle c4 = new Circle();
		c4.setCenterX(290);
		c4.setCenterY(300);
		c4.setRadius(75);
		c4.setStroke(Color.YELLOW);
		c4.setFill(null);
		pane.getChildren().add(c4);
		
		Circle c5 = new Circle();
		c5.setCenterX(470);
		c5.setCenterY(300);
		c5.setRadius(75);
		c5.setStroke(Color.GREEN);
		c5.setFill(null);
		pane.getChildren().add(c5);
		
		// Create a scene and place its in the stage
		Scene scene = new Scene(pane, 780, 550);  
		stage.setTitle("Oylmpic Symbol"); // Set the stage title
		stage.setScene(scene); // Place the scene in the stage
		stage.show();  // Display the stage
	}
	/** Main method */
	public static void main(String[] args) {
		Application.launch(args);
	}
}
