import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class DeleteLast {
   public static void main(String[] args) {
    
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    Queue<Integer> q=new LinkedList<Integer>();
    for(int i=0;i<n;i++)
   {
    q.add(in.nextInt());
   }
   Iterator<Integer> i=q.iterator();
   int k=0;
   while(i.hasNext())
   {
   k=i.next();
   }
   q.remove(k);
   System.out.println(q);
   } 
}
