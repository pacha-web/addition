/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package sxcce.addition;
import java.util.Scanner;
/**
 *
 * @author IT20
 */
public class Addition {



  public static void main(String[] args) {
    int x, y, sum;
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Type a number:");
    x = myObj.nextInt(); 

    System.out.println("Type another number:");
    y = myObj.nextInt(); 

    sum = x + y;  
    System.out.println("Sum is: " + sum); 
  }
} 

