/*
Input: 
5
Output:
1 4 27 16 125
*/
import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int i,n;
      n=d.nextInt();
      for(i=1;i<=n;i++)
        {
          if(i%2!=0)
          System.out.print((int)Math.pow(i,3)+" ");
          else
          System.out.print((int)Math.pow(i,2)+" ");
        }
    }
  }