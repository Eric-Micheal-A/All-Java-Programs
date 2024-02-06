import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n,i,big;
      n=d.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
        a[i]=d.nextInt();
      big=a[0];
      for(i=1;i<n;i++)
        {
          if(big<a[i])
            big=a[i];
          else
            continue;
        }
      System.out.print(big+" is the maximum element in the array");
    }
  }