/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_system;

import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
public class My_ProfilePanal extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        MenuBar menubar = new MenuBar();
        
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
        MenuItem help = new MenuItem("Help");
        help.setOnAction((ActionEvent event) -> {
            try {
                Stage shelp = new Stage();
                HelpPanal h = new HelpPanal();
                h.start(shelp);//To change body of generated methods, choose Tools | Templates.
            } catch (Exception ex) {
                Logger.getLogger(Ex_System.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Help.getItems().add(help);
        Menu M_A = new Menu("My Account");
        MenuItem M_P = new MenuItem("My Profile");
        M_P.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    primaryStage.close();
                    My_ProfilePanal x= new My_ProfilePanal();
                    Stage ss = new  Stage();
                    x.start(ss);//To change body of generated methods, choose Tools | Templates.
                } catch (Exception ex) {
                    Logger.getLogger(LecturerPanal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
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
        root.setTop(menubar);
        
        Text footer = new Text("Power by : @PL_best_Team");
        root.setTop(menubar);
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
        primaryStage.setTitle("MY Profile");
        primaryStage.show();
        
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
