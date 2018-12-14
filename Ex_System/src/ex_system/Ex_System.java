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
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ali
 */
public class Ex_System extends Application {
    static String User_Type = new String();
    @Override
    public void start(Stage primaryStage) {
        MenuBar menubar = new MenuBar();
        Menu File = new Menu("File");
        MenuItem Exit = new MenuItem("Exit");
        Exit.setOnAction((ActionEvent event) -> {
            System.exit(0); //To change body of generated methods, choose Tools | Templates.
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
        menubar.getMenus().addAll(File,Edit,View,Help);
        Text footer = new Text("Power by : @PL_best_Team");
        Text title = new Text("Examenation System");
        title.setFont(Font.font("Tahoma",FontWeight.BOLD,FontPosture.ITALIC, 20));
        ImageView amg3 = new ImageView("Admin.jpg");
        ImageView amg1 = new ImageView("profs.jpg");
        ImageView amg2 = new ImageView("student.jpg");
        Button btn2 = new Button("", amg3);
        Button btn1 = new Button("", amg2);
        Button btn = new Button("",amg1);
        btn2.setOnAction((ActionEvent event) -> {
            try {
                User_Type = "Admin";
                primaryStage.close();
                Stage secStage = new Stage();
                LogIn x = new LogIn();
                x.start(secStage);
                //System.out.println("I'm a Admin");
            } catch (Exception ex) {
                Logger.getLogger(Ex_System.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        btn.setOnAction((ActionEvent event) -> {
            try {
                User_Type = "Lecturer";
                primaryStage.close();
                Stage secStage = new Stage();
                LogIn x = new LogIn();
                x.start(secStage);
                //System.out.println("I'm a Professor");
            } catch (Exception ex) {
                Logger.getLogger(Ex_System.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        btn1.setOnAction((ActionEvent event) -> {
            try {
                User_Type = "Student";
                primaryStage.close();
                Stage secStage = new Stage();
                LogIn x = new LogIn();
                x.start(secStage);
                //System.out.println("I'm a Student");
            } catch (Exception ex) {
                Logger.getLogger(Ex_System.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        BorderPane root1 = new BorderPane();
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(25);
        root.add(title, 1, 0);
        root.add(btn, 0, 1);
        root.add(btn1,1,1);
        root.add(btn2,2,1);
        root.setPadding(new Insets(25, 25, 25, 25));
        root1.setCenter(root);
        root1.setTop(menubar);
        root1.setBottom(footer);
        Scene scene = new Scene(root1);
        
        primaryStage.setTitle("Examenation System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
    /**
     * @param args the command line arguments
     */