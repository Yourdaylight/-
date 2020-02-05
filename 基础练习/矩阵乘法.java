package BasicPractice;
import java.util.*;
public class æÿ’Û≥À∑® {

	static int n;
	public  static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int m=sc.nextInt();
		int[][] A=new int[n][n];
		int[][] res=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				A[i][j]=sc.nextInt();
			}
		}

		res=M(m,A);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int martix(int row,int col,int[][]martix,int[][] martix2)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+martix[row][i]*martix2[i][col];
		}

		return sum;
	}
	
	public static int[][] M(int m,int[][] B)
	{
		
		int[][] middle =B;
		if(m==1)
			return B;
		else if(m==0)
		{
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==j)
						middle[i][j]=1;
					else
						middle[i][j]=0;
				}
			}
		}
		else
		{
			for(int k=0;k<m-1;k++) {
				int[][] temp=new int[n][n];
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						temp[i][j]=martix(i,j,middle,B);
					}
				}
				middle=temp;
			}
		}
		
		return middle;
	}
}
