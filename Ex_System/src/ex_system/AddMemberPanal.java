/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_system;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ali
 */
public class AddMemberPanal extends Application{

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
        Text ID = new Text("ID");
        grid.add(ID, 0, 0);
        Text UserName = new Text("UserName");
        grid.add(UserName, 0, 1);
        Text PassWord = new Text("PassWord");
        grid.add(PassWord, 0, 2);
        Text FName = new Text("FName");
        grid.add(FName, 0, 3);
        Text LName = new Text("LName");
        grid.add(LName, 0, 4);
        Text Email = new Text("E-mail");
        grid.add(Email, 0, 5);
        TextField WID = new TextField();
        grid.add(WID, 1, 0);
        TextField WUserName = new TextField();
        grid.add(WUserName, 1, 1);        
        TextField WPassWord = new PasswordField();
        grid.add(WPassWord, 1, 2);        
        TextField WFName = new TextField();
        grid.add(WFName, 1, 3);        
        TextField WLName = new TextField();
        grid.add(WLName, 1, 4);
        TextField WEmail = new TextField();
        grid.add(WEmail, 1, 5);
        //ComboBox LOS = new ComboBox();
        //LOS.getItems().addAll(new CheckBox("Sub1"),new CheckBox("Sub1"),new CheckBox("Sub1"),new CheckBox("Sub1"));
        //grid.add(LOS, 0, 6, 2, 1);
        Button btn = new Button("Save");
        HBox hbtn = new HBox(btn);
        hbtn.setAlignment(Pos.CENTER);
        grid.add(hbtn, 1, 7);
        Button btn1 = new Button("back");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close(); //To change body of generated methods, choose Tools | Templates.
            }
        });
        HBox hbtn1 = new HBox(btn1);
        hbtn1.setAlignment(Pos.BOTTOM_LEFT);
        grid.add(hbtn1, 0, 7);
        
        root.setCenter(grid);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add"+AdminPanal.UAT);
        primaryStage.show();
        
         //To change body of generated methods, choose Tools | Templates.
    } //To change body of generated methods, choose Tools | Templates.
    }
    

