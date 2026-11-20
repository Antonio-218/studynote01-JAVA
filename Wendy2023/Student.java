package Wendy2023;

import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private int grade;
    private  String classroom;
    private int java;
    private  int web;

    public Student(){}

    public Student(String name, int id,int grade,String classroom ){
        this.name = name;
        this.id = id;
        this.grade=grade;
        this.classroom=classroom;
    }
    public void  setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id ;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public int getGrade(){
        return  grade;
    }
    public void setClassroom(String classroom ){
        this.classroom=classroom;
    }
    public String getClassroom(){
        return classroom;
    }
}


