import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n,i,j;
      n=d.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      int c[]=new int[n];
      for(i=0;i<n;i++)
        a[i]=d.nextInt();
      for(i=0;i<n;i++)
        b[i]=d.nextInt();
      for(j=0;j<n;j++)
        {
        c[j]=a[j]+b[j];
        System.out.print(c[j]+" ");
    }
  }
  }