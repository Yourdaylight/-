
import java.util.*;
public class SineÖ®Îè {

	static ArrayList list=new ArrayList();
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Sn(n,n));
		
	
	}
	
	public static String An(int n,int num)
	{
		String result="";
		String f="";
		if(n%2==0)
			f="+";
		else
			f="-";
		if(n==num)
		{
			result="sin("+num+")";
			return result;
		}
		else
		{
			result+="sin("+n+f+An(n+1,num)+")";
			list.add(result);
			return result;
		}
	}
	
	public static String Sn(int n,int num)
	{
		if(n==1)
			return An(1,1)+"+"+num;
		else
			return "("+Sn(n-1,num)+")"+An(1,n)+"+"+(num+1-n);
		
	}
	
	
}
