import java.util.*;
class BMI
  {
    int n;
    float m;
    void bmi(int n,float m)
    {
      double ans;
      this.n=n;
      this.m=m;
      ans=n/(m*m);
      if(ans<18.5)
        System.out.println("U");
      else if(18.5<=ans&&ans<25.0)
        System.out.println("N");
      else if(25.0<=ans&&ans<30.0)
        System.out.println("H");
      else
        System.out.println("O");
    }
  }
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int weight;
      float height;
      BMI ob=new BMI();
      weight=d.nextInt();
      height=d.nextFloat();
      ob.bmi(weight,height);
      
      
    }
  }