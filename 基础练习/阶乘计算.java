package BasicPractice;
import java.util.Scanner;
public class ½×³Ë¼ÆËã {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int max=5000;
		int[] a=new int[max];
		a[0]=1;
		int jw=0;
		int temp;
		for (int i=2;i<=n;i++)
		{
			for(int j=0;j<max;j++)	
			{
				temp = a[j] * i + jw;
				jw = temp / 10;
				a[j] = temp % 10;
			}

		}
		
		int flag=0;
		for(int i=a.length-1;i>=0;i--) 
		{
			
			if(a[i]!=0)
				flag=1;
			if(flag==1)
				System.out.print(a[i]);
		}
		
	}
}
