public class Main
{
	public static void main(String[] args) {
	    int n=6,n1=8,s=0,s1=0;
	    for(int i=1;i<=n/2;i++)
	    {
	        if(n%i==0)
	        s=s+i;
	    }
	    for(int i=1;i<=n1/2;i++)
	    {
	        if(n1%i==0)
	        s1+=i;
	    }
	    if((s/n)==(s1/n1))
	    System.out.print("Friendly Pair");
	    else
	    System.out.print("Not Friendly Pair");
	}
}