//write your program here
import java.util.*;
class Rectangle
  {
    int l,b;
    void set(int l,int b)
    {
      this.l=l;
      this.b=b;
    }
    void calculate()
    {
      float ans=l*b;
      float ans1=2*(l+b);
      System.out.println("---------------------------------");
      System.out.printf("The area of the rectangle is %.1f\n",ans);
      System.out.printf("The perimeter of the rectangle is %.1f\n",ans1);
    }
  }
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int i,n,l,b;
      Rectangle rr=new Rectangle();
      n=d.nextInt();
      for(i=0;i<n;i++)
        {
          l=d.nextInt();
          b=d.nextInt();
          rr.set(l,b);
          rr.calculate();
        }
    }
  }