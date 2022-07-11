/**
 * Class: CS 501-WS2 Introduction to JAVA Programming <br />
 * Instructor: Prof. M Peter Jurkat <br />
 * Question: 14.12 <br />
 * Description: Bar Chart <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
   <br />
   Signed: Abhishek Panda <br />
   CWID: 10478486
 */

package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class C14E12 extends Application {
	private BarChart barChart = new BarChart();

	public void start(Stage firstStage) {
		//Setting up main panel
		GridPane mainPanel = new GridPane();
		
		//Insert Barchart in the main panel
		mainPanel.add(barChart, 1, 0);
		
		//Set up scene and stage with the main panel
		Scene scene = new Scene(mainPanel);
		firstStage.setTitle("Bar chart");
		firstStage.setScene(scene);
		firstStage.show();
	}

	public static void main(String[] args) {
		// Program description 
		System.out.println("The following program uses prints a bar chart using JavaFX.\n"
				+ "It uses the rectangle class to create the bar blocks for the bar-chart\n");
		Application.launch(args);
	}
	
	
	//Inner-Class that draws the bar chart based on the user input
	class BarChart extends Pane {
		  double width = 200;
		  double height = 200;

		  public BarChart() { 
			  paint(); 
		  }
		  
		  //Creates Bar Chart
		  public void paint() 
		  {
			  int index = 0;
			  int x = 15;
			  String[] color = {"#FF0000","#0000FF","#00FF00","#FFA500"};
			  String [] Name = {"Project", "Quiz", "Midterm", "Final"};
			  double [] dataValue = {20, 10, 30, 40};
			  double max = 20;
			  for (int i=1; i<dataValue.length; i++)
				  max = Math.max(max, dataValue[i]);

			  double barWidth = (width - 10.0) / dataValue.length - 10;
			  double maxHeight = height - 30;

			  getChildren().add(new Line(5, height - 10, width + 35, height - 10));
		    
			  for (int i = 0; i < dataValue.length; i++) {
				  double newHeight = maxHeight * dataValue[i] / max;
				  double y = height - 10 - newHeight;
				  Rectangle rectangle = new Rectangle(x, y, barWidth, newHeight);
				  rectangle.setFill(Color.web(color[index]));
				  index += 1;
				  getChildren().add(rectangle);
				  getChildren().add(new Text(x+5, height, Name[i]));
				  getChildren().add(new Text(x, y, (dataValue[i]+"%")));
				  x += barWidth + 20;
		    }
		  }
	}
} 