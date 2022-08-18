package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        //Setting a gridPane
        GridPane gridPane = new GridPane();


        //Creating a Scene by passing the group object, height and width
        Scene scene = new Scene(gridPane, 600, 300);
        primaryStage.setScene(scene);

        //setting color to the scene
        scene.setFill(Color.rgb(232, 223, 197));


        //Setting the title to Stage.
        primaryStage.setTitle("JavFX Basic Application");


        //Adding the scene to Stage
        primaryStage.setScene(scene);


        //Displaying the contents of the stage
        primaryStage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}