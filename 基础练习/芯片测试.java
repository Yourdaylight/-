package BasicPractice;
import java.util.*;
public class –æ∆¨≤‚ ‘ {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[][] martix=new int[n][n];

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				martix[i][j]=scan.nextInt();
		}
		

		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(martix[j][i]==1)
					count++;
			}
			if(count>n/2)
				System.out.print((i+1)+" ");
		}
	
	}
}
