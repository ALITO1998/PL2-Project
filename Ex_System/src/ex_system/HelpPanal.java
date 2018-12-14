/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_system;

import static com.sun.deploy.trace.TraceLevel.UI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.Buffer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ali
 */
public class HelpPanal extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text help = new Text("College Examination Management System\n" +
"This system can install in Colleges to Mange Exams. This system contains the\n" +
"following modules:\n" +
"\n" +
" 1. Administrative Module\n" +
"   o Admin has username and password and can alter them.\n" +
"   o Admin manages students and lecturers (Add, delete, update, List, search).\n" +
"   o Admin manages Subjects and assign them for students and lecturers.\n" +
"\n" +
" 2. Lecturer Module\n" +
"   o Lecturer manages and designs his exams __ (Add, Delete, update, List)\n" +
"   o Lecturer puts the exam of subject and its duration and true answer for\n" +
"      some questions like single and multiple choice.\n" +
"   o Questions like single and multiple choice, true / false or match system\n" +
"      Must calculate it for each student.\n" +
"   o List All Students Answers for each question and lecturer enter degrees.\n" +
"   o System calculate the final degree for each student.\n" +
"   o Lecturer can make reports about students and their degrees.\n" +
"\n" +
" 3. Student Module\n" +
"   o Student can access only exams for his registered subjects.\n" +
"   o Student can enter exam for once.\n" +
"   o Student can see his degree and corrected exam.\n" +
"   o Students can print/report transcript.\n" +
"\n" +
" 4. User Module\n" +
"   o All Users can login and logout.\n" +
"   o Users can Update their Information except ID.");
        GridPane root = new GridPane();
        root.add(help,0,0,8,8);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("help");
        primaryStage.show();//To change body of generated methods, choose Tools | Templates.
    }
    
}
