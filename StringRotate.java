import java.util.*;
public class StringRotate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int n=s.length();
        String ans="";
        int no=in.nextInt();
        char dir=in.next().charAt(0);
            if(dir=='L')
            {
                for(int j=no;j<n;j++)
                {
                    ans+=s.charAt(j);
                }
                for(int k=0;k<no;k++)
                {
                    ans+=s.charAt(k);
                }
            }
            else if(dir=='R'){
                for(int m=n-no;m<n;m++)
                {
                    ans+=s.charAt(m);
                }
                for(int l=0;l<n-no;l++)
                {
                    ans+=s.charAt(l);
                }
            }
        System.out.println(ans);
    }
}
