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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ali
 */
public class SAPanal extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        /*MenuBar menubar = new MenuBar();
        
        Menu File = new Menu("File");
        MenuItem Exit = new MenuItem("Exit");
        Exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0); //To change body of generated methods, choose Tools | Templates.
            }
        });
        MenuItem Restore = new MenuItem("Restore");
        MenuItem Minimize = new MenuItem("Minimize");
        MenuItem Maximize = new MenuItem("Maximize");
        File.getItems().addAll(Restore,Minimize,Maximize,Exit);
        
        Menu Edit = new Menu("Edit");
        
        Menu View = new Menu("View");
        
        Menu Help = new Menu("Help");
        
        Menu M_A = new Menu("My Account");
        MenuItem M_P = new MenuItem("My Profile");
        ImageView amg = new ImageView("Log Out.jpg");
        MenuItem LogOut = new MenuItem("Log Out", amg);
        LogOut.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                 primaryStage.close();
                 Ex_System x = new Ex_System();
                 Stage pS = new Stage();
                 x.start(pS);//To change body of generated methods, choose Tools | Templates.
             }
         });
        
        M_A.getItems().addAll(M_P,LogOut);
        menubar.getMenus().addAll(File,Edit,View,Help,M_A);
        root.setTop(menubar);*/
        Text footer = new Text("Power by : @PL_best_Team");
        root.setBottom(footer);
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(25);
        grid.setHgap(25);
       // Text WYQ = new Text("Write Your Question");
        //WYQ.setFont(Font.font("Tahoma",FontWeight.BOLD,FontPosture.ITALIC, 20));
        //grid.add(grid, 0, 0,5,1);
        TextArea TAQ = new TextArea();
        TAQ.setPromptText("Write Your Question");
        TAQ.setPadding(new Insets(10, 10, 10, 10));
        
        grid.add(TAQ, 0, 0,3,4);
        Button btn = new Button("Add");
        //btn.setPadding(new Insets(10,10, 10, 10));
        HBox hbtn = new HBox(btn);
        hbtn.setAlignment(Pos.CENTER);
        hbtn.setPadding(new Insets(10, 10, 10, 10));
        grid.add(hbtn, 0, 4,3,1);
        Button btn1 = new Button("back");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close(); //To change body of generated methods, choose Tools | Templates.
            }
        });
        HBox hbtn1 = new HBox(btn1);
        hbtn1.setPadding(new Insets(10, 10, 10, 10));
        hbtn1.setAlignment(Pos.BOTTOM_LEFT);
        grid.add(hbtn1, 0, 4);
        root.setCenter(grid);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add Question");
        primaryStage.show();
        
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
