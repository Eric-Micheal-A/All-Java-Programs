/*
Input: 
5
Output:
1 2 3 5 8
*/
import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int i,n,f1,f2,f3;
      n=d.nextInt();
      f1=0;f2=1;
      for(i=1;i<=n;i++)
        {
          f3=f1+f2;
          System.out.print(f3+" ");
          f1=f2;
          f2=f3;
        }
    }
  }