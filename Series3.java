/*
Input: 
5
Output:
7 5 8 6 9
*/
import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int i,n,j=5;
      n=d.nextInt();
      for(i=1;i<=n;i++)
        {
          if(i%2!=0)
          {
            j+=2;
            System.out.print(j+" ");
          }
          else
          {
            j-=2;
            System.out.print(j+" ");
            j+=1;
          }
        }
    }
  }