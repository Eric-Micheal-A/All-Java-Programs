//write your code here
import java.util.*;
class Main
  {
    public static void main(String args[])
    {
  Scanner d=new Scanner(System.in);
   int n,i,el,c=0;
   n=d.nextInt();
   int a[]=new int[n];
   for(i=0;i<n;i++)
  {
    a[i]=d.nextInt();
  }
el=d.nextInt();
for(i=0;i<n;i++)
  {
    if(a[i]==el)
      c+=1;
  }
if(c!=0)
  System.out.print(el+" is present in the array");
else
  System.out.print(el+" is not present in the array");
  }
  }