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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ali
 */
public class TrueOrFalsePanal extends Application{

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
        grid.setVgap(15);
        grid.setHgap(15);
        Text Question = new Text("Question");
        grid.add(Question,0,0);
        TextField Q = new TextField();
        Q.setMinWidth(250);
        Q.setPromptText("Write Your Question");
        grid.add(Q, 1, 0, 2, 1);
        ToggleGroup grope = new ToggleGroup();
        RadioButton False_RB = new RadioButton("False");
        False_RB.setToggleGroup(grope);
        grid.add(False_RB, 0, 1);
        RadioButton TrueRB = new RadioButton("True");
        TrueRB.setToggleGroup(grope);
        TrueRB.setSelected(true);
        grid.add(TrueRB, 0, 2);
        Button btn = new Button("Add");
        HBox hbtn = new HBox(btn);
        hbtn.setAlignment(Pos.CENTER);
        grid.add(hbtn, 2, 3);
        Button btn1 = new Button("back");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close(); //To change body of generated methods, choose Tools | Templates.
            }
        });
        HBox hbtn1 = new HBox(btn1);
        hbtn1.setAlignment(Pos.BOTTOM_LEFT);
        grid.add(hbtn1, 0, 3);
        root.setTop(grid);
        Scene scene = new Scene(root,350, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add Exame");
        primaryStage.show();
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
