/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_system;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ali
 */
public class AddSubPanal extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        Text footer = new Text("Power by : @PL_best_Team");
        root.setBottom(footer);
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(25);
        grid.setHgap(25);
        Button btn = new Button("Save");
        HBox hbtn = new HBox(btn);
        hbtn.setAlignment(Pos.CENTER);
        grid.add(hbtn, 1, 6);
        Button btn1 = new Button("back");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close(); //To change body of generated methods, choose Tools | Templates.
            }
        });
        HBox hbtn1 = new HBox(btn1);
        hbtn1.setAlignment(Pos.BOTTOM_LEFT);
        grid.add(hbtn1, 0, 6);
        
        root.setCenter(grid);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add"+AdminPanal.UAT);
        primaryStage.show();//To change body of generated methods, choose Tools | Templates.
    }
    
}
