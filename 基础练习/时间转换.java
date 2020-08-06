
import java.util.*;
public class Ê±¼ä×ª»» {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=n/3600;
		int m=(n-3600*t)/60;
		int s=n-t*3600-m*60;
		System.out.println(t+":"+m+":"+s);
	}
}
