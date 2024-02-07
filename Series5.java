/*
Input: 
5
Output:
2 4 7 12 21
*/
import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n, j = 2;
      n=d.nextInt();
      System.out.print(j+" ");
      for(int i=0;i<n-1;i++)
        {
          j = (j*2)-i;
          System.out.print(j+" ");
        }
    }
  }