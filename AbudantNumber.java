public class Main
{
	public static void main(String[] args) {
	    int n=12,s=0;
	    for(int i=1;i<=n/2;i++)
	    {
	        if(n%i==0)
	        s+=i;
	    }
	    if(s>n)
	    System.out.print("Abundant");
	    else
	    System.out.print("No");
	}
}