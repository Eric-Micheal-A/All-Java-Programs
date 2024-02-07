/*
Input: 
5
Output:
10 5 60 15 110
*/
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int i,n,k=10,m=5;
      n=d.nextInt();
      for(i=1;i<=n;i++)
        {
          if(i%2!=0)
          {
            System.out.print(k+" ");
          k+=50;
          }
          else
          {
            System.out.print(m+" ");
            m+=10;
          }
        }
    }
  }