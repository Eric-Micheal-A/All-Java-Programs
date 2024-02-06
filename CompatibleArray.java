import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n,i,j,c=0;
      n=d.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      for(i=0;i<n;i++)
        {
        a[i]=d.nextInt();
        }
      for(j=0;j<n;j++)
        {
        b[j]=d.nextInt();
        }
      for(i=0;i<n;i++)
        {
          if(a[i]<b[i])
          {
        System.out.print("Incompatible");
            return;
          }
  }
        System.out.print("Compatible");
  }
  }