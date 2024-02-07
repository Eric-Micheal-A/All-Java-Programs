/*
Input: 
5
Output:
0 3 8 15 2
*/
import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n,i,m,j;
      n=d.nextInt();
      m=0;
      j=3;
      for(i=0;i<n;i++)
        {
          System.out.print(m+" ");
          m=m+j;
          j+=2;
        }
    }
  }