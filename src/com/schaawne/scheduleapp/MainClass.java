package com.schaawne.scheduleapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * MainClass class for ScheduleApp
 * <p>
 * Created by Schaawne on 5/29/2016.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class MainClass extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("Scheule App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
