import java.util.*;
public class StringWeight {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
  
       long get=in.nextLong();
       StringBuilder ans=new StringBuilder();
        long k=1;
        int u=3,ch=64;
        char val;

        ArrayList<Long> l=new ArrayList<Long>();
        ArrayList<Character> str=new ArrayList<Character>();
        while(true)
        {
            l.add(k);
            ch++;
            val=(char)ch;
            str.add(val);
            k=k*u;
            u++;
            if(k>get)
            break;
            
        }
        int start=l.size()-1;
        while(get>=0&&start>=0){
            if(l.get(start)<=get){
                get=get-l.get(start);
                ans.append(str.get(start));
            }
            else{
                start--;
            }

        }
        System.out.println(ans.reverse());
    }
}
