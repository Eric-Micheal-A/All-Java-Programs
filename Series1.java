/*
Input: 
5
Output:
6 9 14 21 30
*/
import java.util.*;
class Main
  {
ublic static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n,i,m,k,j;
      n=d.nextInt();
      m=6;
      j=3;
      for(i=1;i<=n;i++)
        {
          System.out.print(m+" ");
          m=m+j;
          j+=2;
        }
  }
  }