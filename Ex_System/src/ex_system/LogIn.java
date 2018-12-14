/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template filemanegar, choose Tools | Templates
 * and open the template in the editor  .
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
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ali
 */
public class LogIn extends Application{

    @Override
    public void start(Stage sec) throws Exception {
        MenuBar menubar = new MenuBar();
        Menu File = new Menu("File");
        MenuItem Exit = new MenuItem("Exit");
        Exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0); 
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
                h.start(shelp);
            } catch (Exception ex) {
                Logger.getLogger(Ex_System.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Help.getItems().add(help);
        menubar.getMenus().addAll(File,Edit,View,Help);
        Text footer = new Text("Power by : @PL_best_Team");
        sec.setTitle("Login");
        GridPane grid = new GridPane();
        BorderPane root = new BorderPane();
        root.setTop(menubar);
        root.setCenter(grid);
        root.setBottom(footer);
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name :");
        grid.add(userName, 0, 1);

        final TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        final PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button("Sign in");
        HBox hbtn = new HBox();
        hbtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbtn.getChildren().add(btn);
        grid.add(hbtn, 1, 4);
        Button btn1 = new Button("Back");
        grid.add(btn1, 0, 4);
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        

        Scene scene = new Scene(root);
        sec.setScene(scene);
        sec.show();   
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                
                Stage therd = new Stage();
                switch(Ex_System.User_Type){
                    case "Lecturer" :
                        if(true){// SystemUser().login(userTextField.getText(),pwBox.getText(),User_Type)){
                            sec.close();
                            try {
                                new LecturerPanal().start(therd);
                            } catch (Exception ex) {
                                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else{
                            actiontarget.setFill(Color.RED);
                            actiontarget.setText("Invalid Username and Password!");
                         }
                    case "Student" :
                        if(false){// SystemUser().login(userTextField.getText(),pwBox.getText(),User_Type){
                        sec.close();    
                    
                        }else{
                            actiontarget.setFill(Color.RED);
                            actiontarget.setText("Invalid Username and Password!");
                        }
                    case "Admin" :
                        if("Admin".equals(userTextField.getText())&&"12345".equals(pwBox.getText())){
                            sec.close();
                            try {
                                new AdminPanal().start(therd);
                            } catch (Exception ex) {
                                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else{
                            actiontarget.setFill(Color.RED);
                            actiontarget.setText("Invalid Username and Password!");
                         }
                }
                
            }
        });
        btn1.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                 sec.close();
                 Ex_System x = new Ex_System();
                 Stage pS = new Stage();
                 x.start(pS);//To change body of generated methods, choose Tools | Templates.
             }
         });
    }
    }
    

