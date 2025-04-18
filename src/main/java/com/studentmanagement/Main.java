package com.studentmanagement;

import com.studentmanagement.util.DatabaseInitializer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Initialize the database
        DatabaseInitializer.initializeDatabase();
        
        // Load the main view
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainView.fxml"));
        primaryStage.setTitle("Student Management System");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
} 