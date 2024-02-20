import java.util.*;
abstract class Shape
  {
    abstract void squareArea(int l);
    abstract void rectangleArea(int l,int b);
    abstract void circleArea(int r);
  }
class Area extends Shape
  {
    public void rectangleArea(int l,int b)
    {
      System.out.println(l*b);
    }
    public void squareArea(int l)
    {
      System.out.println(l*l);
    }
    public void circleArea(int r)
    {
      System.out.printf("%.2f",(Math.PI*r*r));
    }
  }
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int l=d.nextInt();
      int b=d.nextInt();
      int s=d.nextInt();
      int r=d.nextInt();
      Area obj=new Area();
      obj.rectangleArea(l,b);
      obj.squareArea(s);
      obj.circleArea(r);  
    }
  }