/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.Scanner ;
/**
 *
 * @author thand
 */
public class Mavenproject2 {

    public static void userdetails(String[] args) {
      Scanner input=new Scanner(System.in);
      String Fullname;
      String Name;
      String Surname;
      int age; 
      double salary;
      
      
      System .out.println("Please enter your Name:");
      Name=input.next();
      System .out.println("Please enter your Surname:");
    Surname=input.next();
    Fullname=Name+ ""+Surname;
    System .out.println("Please enter your age");
    age=input.nextInt();
    System .out.println("Please enter your salary:");
    salary=input.nextDouble();
    double tenPercent=salary*0.10;
    
    
    System .out.println(""+Fullname);
    System .out.println("age:"+age);
    System .out.println("10% of your salary is "+tenPercent);
    System.out.println(ageCheck());
    }
   public static boolean ageCheck(String Name,int age){
        if (age>18){ 
            boolean results = true;
   }
        else{
            boolean results = false;
        }
        boolean results;
        return results;
   }

    private static boolean ageCheck() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

     

