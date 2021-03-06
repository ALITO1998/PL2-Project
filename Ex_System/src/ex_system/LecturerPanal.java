/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_system;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableListValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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
public class LecturerPanal extends Application{
    String[] ESub1 = {"ESub1","ESub1","ESub1","ESub1","ESub1","ESub1","ESub1","ESub1","ESub1"};
    String[] ESub2 = {"ESub2","ESub2","ESub2","ESub2","ESub2","ESub2","ESub2","ESub2","ESub2","ESub2"};
    @Override
    public void start(Stage lecturer) throws Exception {
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
                 lecturer.close();
                 Ex_System x = new Ex_System();
                 Stage pS = new Stage();
                 x.start(pS);//To change body of generated methods, choose Tools | Templates.
             }
         });
        
        M_A.getItems().addAll(M_P,LogOut);
        menubar.getMenus().addAll(File,Edit,View,Help,M_A);
        root.setTop(menubar);
        /*Button btn2 = new Button("My Profile");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(".handle()"); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        Button btn = new Button("Log Out", amg);
        HBox hbtn = new HBox(btn);
        hbtn.getChildren().add(btn2);
        hbtn.setAlignment(Pos.TOP_RIGHT);
        root.setTop(hbtn);*/
        
        Text footer = new Text("Power by : @PL_best_Team");
        root.setBottom(footer);
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        ImageView amg1 = new ImageView("Add Exam.jpg");
        Button btn1 = new Button("Add Exam", amg1);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    lecturer.close();
                    Add_ExPanal x = new Add_ExPanal();
                    Stage pS = new Stage();
                    x.start(pS);//To change body of generated methods, choose Tools | Templates.
                } catch (Exception ex) {
                    Logger.getLogger(LecturerPanal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        String A = "Ali";
        grid.add(btn1, 0, 0);
        ComboBox SubCB =  new ComboBox();
        SubCB.setMinWidth(200);
        for (int i = 0; i < ESub1.length; i++) {
            SubCB.getItems().add(ESub1[i]);
        }
        SubCB.getItems().addAll("sub2","sub3","sub4");//username of lec.Arraylist of sub name
        SubCB.setValue("sub1");//username of lec.Arraylist of sub name[0]
        grid.add(SubCB, 1, 0);
        root.setCenter(grid);
        
        
        ListView<String> LOE = new ListView<String>();
        ObservableList<String> Items = FXCollections.observableArrayList();
        Items.add(",\"eng.nermin@gmail.com\"");
        
        LOE.setItems(Items);
        
        grid.add(LOE, 0, 1, 2, 8);
        Scene scene = new Scene(root);
        lecturer.setScene(scene);
        lecturer.setTitle("LECTURER");
        lecturer.show();
        
    }
    
}
