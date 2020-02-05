package BasicPractice;
import java.util.*;
public class FJµÄ×Ö·û´® {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();

		char b=67;
		String[] A=new String[n];
		A[0]="A";
		for(int i=1;i<n;i++)
		{
			String add ="";
			add=String.valueOf((char)(65+i));
			A[i]=A[i-1]+add+A[i-1];
			b=(char) (b+1);
		}
		System.out.println(A[n-1]);
		
	}
}
