import java.util.*;
public class Main {
    public static int palin(String ans)
    {
        for(int i=0,j=ans.length()-1;i<=j;i++,j--)
        {
            if(ans.charAt(i)!=ans.charAt(j)) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String ans=s.substring(i,j);
                count+=palin(ans);
            }
        }
        System.out.println(count);
    }
}