/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Islam43
 */
public class Cons_Overloading {
    int a;
    String name;
    int age;
    
    Cons_Overloading(int i,String n){
        a=i;
        name=n;
      }
    
    Cons_Overloading(int i,String n,int c){
        a=i;
        name=n;
        age=c;
        
    }
    void display(){
        System.out.println(a+" "+name+" "+age);
    }
    
    public static void main(String args[]){  
        Cons_Overloading ob1=new Cons_Overloading(43,"Mim");
        Cons_Overloading ob2=new Cons_Overloading(46,"Suva",11);
        ob1.display();
        ob2.display();
    }
}
