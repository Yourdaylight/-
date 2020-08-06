
import java.util.Scanner;
import java.util.ArrayList;
public class Ñî»ÔÈý½Ç {
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int arr[][]=new int[n][n];
		
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
			{
				arr[i][0]=1;
				if (i==j)
					arr[i][j]=1;
				
			}
		
		for(i=2;i<n;i++)
			for(j=1;j<n-1;j++)
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
	}
}
