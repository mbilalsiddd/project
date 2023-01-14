/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package function;

/**
 *
 * @author M. Bilal Siddiqui
 */


  public class Node {
    String roll_no;
    String name;
    int sub1_marks;
    int sub2_marks;
    int sub3_marks;
    int sub4_marks;
    int sub5_marks;
    char sub1_grade;
    char sub2_grade;
    char sub3_grade;
    char sub4_grade;
    char sub5_grade;
    double sub1_grade_points;
    double sub2_grade_points;
    double sub3_grade_points;
    double sub4_grade_points;
    double sub5_grade_points;
    double sub1_e_grade_points;
    double sub2_e_grade_points;
    double sub3_e_grade_points;
    double sub4_e_grade_points;
    double sub5_e_grade_points;
    double total_e_grade_points;
    double SGPA;
    Node next;
    
    
    public Node(String roll_no, String name, int sub1_marks, int sub2_marks, int sub3_marks, int sub4_marks, int sub5_marks, char sub1_grade, char sub2_grade, char sub3_grade, char sub4_grade, char sub5_grade, double sub1_grade_points, double sub2_grade_points, double sub3_grade_points, double sub4_grade_points, double sub5_grade_points, double sub1_e_grade_points, double sub2_e_grade_points, double sub3_e_grade_points, double sub4_e_grade_points, double sub5_e_grade_points, double total_e_grade_points, double SGPA){
        this.roll_no = roll_no;
        this.name = name;
        this.sub1_marks = sub1_marks;
        this.sub2_marks = sub2_marks;
        this.sub3_marks = sub3_marks;
        this.sub4_marks = sub4_marks;
        this.sub5_marks = sub5_marks;
        this.sub1_grade = sub1_grade;
        this.sub2_grade = sub2_grade;
        this.sub3_grade = sub3_grade;
        this.sub4_grade = sub4_grade;
        this.sub5_grade = sub5_grade;
        this.sub1_grade_points = sub1_grade_points;
        this.sub2_grade_points = sub2_grade_points;
        this.sub3_grade_points = sub3_grade_points;
        this.sub4_grade_points = sub4_grade_points;
        this.sub5_grade_points = sub5_grade_points;
        this.sub1_e_grade_points = sub1_e_grade_points;
        this.sub2_e_grade_points = sub2_e_grade_points;
        this.sub3_e_grade_points = sub3_e_grade_points;
        this.sub4_e_grade_points = sub4_e_grade_points;
        this.sub5_e_grade_points = sub5_e_grade_points;
        this.total_e_grade_points = total_e_grade_points;
        this.SGPA = SGPA;
        Node next = null;

    }
    

    
}

 
    

