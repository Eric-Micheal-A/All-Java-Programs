import java.util.*;
public class ExtractNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n>0)
        {
            in.next();
            String s=in.nextLine();
            String arr[]=s.split(" ");
            ArrayList<Integer> l=new ArrayList<Integer>();
            for(String i:arr)
            {
                try{

                    int k=Integer.valueOf(i);
                    l.add(k);
                }
                catch(Exception e)
                {
                    continue;
                }
            }
            if(l.isEmpty())
            {
                System.out.println("-1");
            }
            else{
                Collections.sort(l);
                System.out.println(l.getLast());
            }
            n--;
        }
    }
}
