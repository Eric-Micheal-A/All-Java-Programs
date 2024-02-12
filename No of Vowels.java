import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      String s;
      char c;
      int vow=0,cons=0;
      s=d.next();
      int i;
      for(i=0;i<s.length();i++)
        {
          c=s.charAt(i);
          if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            vow+=1;
          else 
            cons+=1;
        }
      System.out.print("Number of vowels: "+vow);
    }
  }