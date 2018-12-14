/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ex_system.emplementation;

//import java.io.*;
//import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author Essam
 */
/*public class FileManager1 implements Serializable{
    public boolean Write(String path,Object data){
        try{
        ObjectOutputStream write=new ObjectOutputStream(new FileOutputStream(path));
        write.writeObject(data);
        System.out.println("Compeleted");
        write.close();
        return true;
        }
        catch(IOException e){
                System.out.println(e);
                }
        
    return false;
    }
    
    public Object Read(String path){
    Object output=null;
    try{
    ObjectInputStream reader=new ObjectInputStream(new FileInputStream(path));
    output=reader.readObject();
    }
    catch(IOException e){
    System.out.println(e);
    }   catch (ClassNotFoundException ex) {   
            Logger.getLogger(FileManager1.class.getName()).log(Level.SEVERE, null, ex);
        }   
    return output;
    }
    //Add
    public boolean AddStudent(Student n){
        Student Nstudent=new Student();
        Nstudent.students=(ArrayList<Student>) Read("Student.text");
         Nstudent.students.add(n);
         return Write("Student.txt",Nstudent.students);
        }
    public boolean AddAdmin(Admin n){
    Admin Nadmin=new Admin();
    Nadmin.admins=(ArrayList<Admin>) Read("Admin.txt");
    Nadmin.admins.add(n);
    return Write("Admin.txt",Nadmin.admins);
    }
    public boolean AddLecture(Lecturer n){
    Lecturer Nlecturer=new Lecturer();
    Nlecturer.lecturers=(ArrayList<Lecturer>) Read("Lecturer.txt");
    Nlecturer.lecturers.add(n);
    return Write("Lecturer.txt",Nlecturer.lecturers);
    }
    public boolean AddExam(Exams n){
    Exams Nexams=new Exams();
    Nexams.exams=(ArrayList<Exams>) Read("Exams.txt");
    Nexams.exams.add(n);
    return Write("Exams.txt",Nexams.exams);
    }
    
    public int getStudentIndex(int n){
        Student st=new Student();
    for(int i=0;i<Student.students.size();i++){
        /*if(Student.students.get(i).getID==n)*/
 /*           return i;
    }
        return -1;
    } 
    public boolean UpdateStudent(int Oldid,Student x){
        Student Nstudent=new Student();
        Nstudent.students=(ArrayList<Student>) Read("Student.text");
        int index=getStudentIndex(Oldid);
        if(index!=-1){
            Nstudent.students.set(index,x);
           return Write("Student.txt",Nstudent.students);
        }
        return false;
    
    }
    public boolean UpdateAdmin(int Oldid,Admin x){
        Admin NAdmin=new Admin();
        NAdmin.admins=(ArrayList<Admin>) Read("Admin.text");
        int index=getStudentIndex(Oldid);
        if(index!=-1){
            NAdmin.admins.set(index,x);
           return Write("Admin.txt",NAdmin.admins);
        }
        return false;
    
    }
    public boolean UpdateLecturer(int Oldid,Lecturer x){
        Lecturer Nlecturer=new Lecturer();
        Nlecturer.lecturers=(ArrayList<Lecturer>) Read("Lecturer.text");
        int index=getStudentIndex(Oldid);
        if(index!=-1){
            Nlecturer.lecturers.set(index,x);
           return Write("Lecturer.txt",Nlecturer.lecturers);
        }
        return false;
    }
     
    
    public boolean deleteStudent(int id){
    Student st=new Student();
    st.students=(ArrayList<Student>)Read("Student") ;
    int index =getStudentIndex(id);
    if(index!=-1){
        st.students.remove(index);
        return Write("Student",st.students);
    }
    return false;
    }
    
    }
    
*/
