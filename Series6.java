/*
Input: 
5
Output:
1 4 27 256 3125
*/
import java.util.*;
import java.math.*;
class Main
  {
public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int i,n;
      n=d.nextInt();
      for(i=1;i<=n;i++)
        {
          System.out.print((int)(Math.pow(i,i))+" ");
        }
    }
  }