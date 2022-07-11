/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 14.1 <br />
 * Description: Flags <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class C14E1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		//Setting up the properties
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5));
		
		//Loading image into an array
		Image[] imageArray = new Image[4];
		for(int i=0; i<imageArray.length; i++) {
			imageArray[i] = new Image(String.valueOf(i+".jpg"));
		}
		
		//Setting up display 
		ImageView china = new ImageView(imageArray[0]);
		ImageView germany = new ImageView(imageArray[1]);
		ImageView usa = new ImageView(imageArray[2]);
		ImageView france = new ImageView(imageArray[3]);
		
		//Insert each flag into it's position 
		pane.add(china, 0, 0);
		pane.add(germany, 0, 1);
		pane.add(usa, 1, 0);
		pane.add(france, 1, 1);
		
		//Set up scene and stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Flags !");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		System.out.println("The following program prints images on the grid\n"
				+ "It places 4 flags on the grid.\n");
		Application.launch(args);
	}
}