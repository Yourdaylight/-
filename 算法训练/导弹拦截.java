package AlgorithmTrainning;
import java.util.*;
public class µ¼µ¯À¹½Ø {
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
	    String[] arr  = str.split(" ");
	    int n=arr.length;
	    int[]  Height = new int[n];
		int[] dp=new int[n];
		int[] dp2=new int[n];
		for(int i=0;i<n;i++)
		{
			Height[i]=Integer.valueOf(arr[i]);
			dp[i]=1;
			dp2[i]=1;

		}
		int flag=0;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<i;j++) {
				if(Height[i]<=Height[j] )
						dp[i]=Math.max(dp[i], dp[j]+1);
				else 
						dp2[i]=Math.max(dp2[i], dp2[j]+1);
			}

		}
		
		
		Arrays.sort(dp);
		Arrays.sort(dp2);

		System.out.println(dp[dp.length-1]);
		System.out.println(dp2[dp2.length-1]);
	}
}
