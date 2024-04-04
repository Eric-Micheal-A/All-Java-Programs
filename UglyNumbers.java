import java.util.*;
public class UglyNumbers {
    public static void main(String[] args) {
        
        Scanner d=new Scanner(System.in);
        int n=d.nextInt();
        int temp,i,var=1,last=0;
        boolean k=false;
        for(temp=0;temp<n;temp++)
        {
            i=var;
            while(i%2==0)
            i/=2;
            while(i%3==0)
            i/=3;
            while(i%5==0)
            i/=5;
            if(i==1)
            k=true;
            if(k)
            {
                last=var;
            }
            else{
                temp--;
            }
            k=false;
            var++;
        }
        System.out.println(last);
   }
}