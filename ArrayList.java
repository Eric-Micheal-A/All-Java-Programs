import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("adam");
        a1.add("john");
        a1.add("peter");
        Iterator itr=a1.iterator();
        while(itr.hasNext())
        {
            if(itr.next().equals("adam"))
            itr.remove();
        }
        for(String s:a1)
        System.out.println(s);
        
    }
}
