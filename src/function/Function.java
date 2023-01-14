/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package function;

/**
 *
 * @author M. Bilal Siddiqui
 */
public class Function {

 

    
    Node head = null;
    
    void insert(String roll_no, String name, int sub1_marks, int sub2_marks, int sub3_marks, int sub4_marks, int sub5_marks){
        
        char sub1_grade = 'A';
        char sub2_grade = 'B'; 
        char sub3_grade = 'C'; 
        char sub4_grade = 'D'; 
        char sub5_grade = 'E';
        
        double sub1_grade_points = 2.75; 
        double sub2_grade_points = 3.00; 
        double sub3_grade_points = 3.25; 
        double sub4_grade_points = 2.5; 
        double sub5_grade_points = 3.5; 


        double sub1_e_grade_points = 2.75 * 3; 
        double sub2_e_grade_points = 3.00 * 2; 
        double sub3_e_grade_points = 3.25 * 1; 
        double sub4_e_grade_points = 2.5 * 2; 
        double sub5_e_grade_points = 3.5 * 3; 
        
        double e_grade_points = sub1_e_grade_points+sub2_e_grade_points+sub3_e_grade_points+sub4_e_grade_points+sub5_e_grade_points;
        double SGPA = e_grade_points/11;
 
        Node newNode = new Node(roll_no, name, sub1_marks, sub2_marks, sub3_marks, sub4_marks, sub5_marks, sub1_grade, sub2_grade, sub3_grade, sub4_grade, sub5_grade, sub1_grade_points, sub2_grade_points, sub3_grade_points, sub4_grade_points, sub5_grade_points, sub1_e_grade_points, sub2_e_grade_points, sub3_e_grade_points, sub4_e_grade_points, sub5_e_grade_points, e_grade_points, SGPA);
        if(head == null){
            head = newNode;
        }
        else{
            while(head.next != null){
                head = head.next;
            }
            head.next = newNode;
        }
        
    }
    
    void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.name + " " + temp.roll_no +  " " + temp.sub1_marks +  " " + temp.sub1_grade +  " " + temp.sub1_grade_points +  " " + temp.sub1_e_grade_points +  " " + temp.sub2_marks +  " " + temp.sub2_grade +  " " + temp.sub2_grade_points +  " " + temp.sub2_e_grade_points +  " " + temp.sub3_marks +  " " + temp.sub3_grade +  " " + temp.sub3_grade_points +  " " + temp.sub3_e_grade_points +  " " + temp.sub4_marks +  " " + temp.sub4_grade +  " " + temp.sub4_grade_points +  " " + temp.sub4_e_grade_points +  " " + temp.sub5_marks +  " " + temp.sub5_grade +  " " + temp.sub5_grade_points +  " " + temp.sub5_e_grade_points + " " + temp.total_e_grade_points + " " + temp.SGPA);
            temp = temp.next;
        }
    }
    
   void deletion(){
       
   }
}
    

