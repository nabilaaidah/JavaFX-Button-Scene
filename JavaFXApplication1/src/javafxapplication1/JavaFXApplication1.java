/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author NABILA
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
	btn.setText("Click here");
	btn.setLayoutX(200);
	btn.setLayoutY(200);
	btn.setOnAction(new EventHandler<ActionEvent>(){
		public void handle(ActionEvent event) {
                    System.out.println("Success!!!");
		}
	});
	
        Button btn2 = new Button();
        btn2.setText("Another Button");
        btn2.setLayoutX(185);
	btn2.setLayoutY(230);
	btn2.setOnAction(new EventHandler<ActionEvent>(){
		public void handle(ActionEvent event) {
                    System.out.println("Great!!");
		}
	});
        
        Group vb = new Group();
        vb.getChildren().add(btn);
        vb.getChildren().add(btn2);
        
	Scene sc = new Scene(vb, 480, 500);
		
	primaryStage.setTitle("Click here");
	primaryStage.setScene(sc);
	primaryStage.show();
        
   
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
