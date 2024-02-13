 import java.util.*;
 class Sample
 {
     private int age;
     void setter(int a)
     {
         this.age=a;
     }
     int getter()
     {
         return age;
     }
 }
 
 class Main{
 public static void main (String[] args) {
     Scanner d=new Scanner(System.in);
     Sample s=new Sample();
     System.out.println("Enter Your Age:");
     int age=d.nextInt();
     s.setter(age);
     int b=s.getter();
     System.out.println("Your Age is:"+b);
 }
}