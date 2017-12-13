/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class Counter2 {
    
    static int count;//will get memory only once and retain its value  
  
Counter2(){  
count++;  
System.out.println(count);  
}  
  
public static void main(String args[]){  
  
Counter2 c1=new Counter2();  
Counter2 c2=new Counter2();  
Counter2 c3=new Counter2();  
  
 }  
}
