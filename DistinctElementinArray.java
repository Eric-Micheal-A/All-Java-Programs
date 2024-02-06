import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n,i,j,val=0;
      n=d.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
        {
          a[i]=d.nextInt();
        }
      for(i=0;i<n;i++)
        {
          int k=a[i];
          for(j=i+1;j<n;j++)
            {
              if(k==a[j])
                val+=1;
            }
        }
      if(val>0)
      {
        System.out.print(n-val);
      }
      else
        System.out.print(n);
    }
  }
