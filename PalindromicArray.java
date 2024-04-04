import java.util.*;
public class PalindromicArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int count=0;
        while(t-- > 0)
        {
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }
            int left=0;
            int right=n-1;
            while(left<right)
            {
                if(a[left]==a[right])
                {
                    left++;
                    right--;
                }
                else if(a[left]<a[right])
                {
                    a[left+1]=a[left]+a[left+1];
                    left++;
                    count++;
                }
                else if(a[left]>a[right])
                {
                    a[right-1]=a[right]+a[right-1];
                    right--;
                    count++;
                } 
            }
            System.out.println(count);
        }
    }   
}
