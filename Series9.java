/*
Input: 
5
Output:
0 2 6 12 20
*/
import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int i,n,k=0,m=2;
      n=d.nextInt();
      for(i=0;i<n;i++)
        {
          System.out.print(k+" ");
          k+=m;
          m+=2;
        }
    }
  }