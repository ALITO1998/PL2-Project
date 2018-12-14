/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_system;

import com.sun.deploy.util.SearchPath;
import com.sun.jndi.toolkit.dir.DirSearch;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.naming.directory.SearchResult;

/**
 *
 * @author Ali
 */
public class AdminPanal extends Application{
    static String UAT;
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
        ImageView amg1 = new ImageView("Add Exam.jpg");
        Button btn1 = new Button("Add", amg1);
        
        grid.add(btn1, 0, 0);
        ToggleGroup grope = new ToggleGroup();
        RadioButton STUD_RB = new RadioButton("Students");
        STUD_RB.setToggleGroup(grope);
        STUD_RB.setSelected(true);
        grid.add(STUD_RB, 1, 0);
        RadioButton LECT_RB = new RadioButton("Lecturers");
        LECT_RB.setToggleGroup(grope);
        grid.add(LECT_RB, 2, 0);
        RadioButton SUB_RB = new RadioButton("Subjectes");
        SUB_RB.setToggleGroup(grope);
        grid.add(SUB_RB, 3, 0);
        
        //grid.add(search, 1, 1, 3, 1);
        ListView<String> LO = new ListView<String>();
        ObservableList<String> Items = FXCollections.observableArrayList();
        if (STUD_RB.isSelected()){
            Items.add("STUD");//for(int i = 0;i<StudentArrayList.lenghth;i++){
                              //    Items.add(Student[i].fname);
                              // }
        } else if (LECT_RB.isSelected()) {
            Items.add("LECT");//for(int i = 0;i<LecturerArrayList.lenghth;i++){
                              //    Items.add(Lecturer[i].fname);
                              // }
        } else {
            Items.add("SUB");//for(int i = 0;i<SubjectArrayList.lenghth;i++){
                              //    Items.add(Subject[i].fname);
                              // }
        }
        
        LO.setItems(Items);
        grid.add(LO, 0, 2,4,8);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage Sg = new Stage();
                try {
                if (SUB_RB.isSelected()) {
                    UAT = "Subject";
                    AddSubPanal x = new AddSubPanal();
                    x.start(Sg);
                } else{ 
                    if (LECT_RB.isSelected()) {
                        UAT = "Lecturer" ;
                    } else {
                        UAT = "Student";
                    }
                    AddMemberPanal x = new AddMemberPanal();
                    x.start(Sg);
                    } }catch (Exception ex) {
                        Logger.getLogger(AdminPanal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            
//To change body of generated methods, choose Tools | Templates.
            
        });
        root.setCenter(grid);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ADMIN");
        primaryStage.show();
        //To change body of generated methods, choose Tools | Templates.
    }
   
}
