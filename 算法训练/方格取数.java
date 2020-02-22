import java.util.*;
public class 方格取数 {
	static int[][] map;
	static int N;
	public static int[][][][] dp;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		map=new int[N+1][N+1];
		dp=new int[N+1][N+1][N+1][N+1];
		for(int i=0;i<N*N;i++)
		{
			int row=sc.nextInt();
			int col=sc.nextInt();
			int num=sc.nextInt();
			if (row==0 && col==0 && num==0)
				break;
			map[row][col]=num;
		}
		
		for(int x1=1;x1<=N;x1++) 
			for(int y1=1;y1<=N;y1++) 
				for(int x2=1;x2<=N;x2++) 
					for(int y2=1;y2<=N;y2++) 
					{
						//一共两条路
						//第一条路的走法
						int person1=Math.max(dp[x1-1][y1][x2-1][y2], dp[x1-1][y1][x2][y2-1]);
						//第二条路的走法
						int person2= Math.max(dp[x1][y1-1][x2-1][y2],dp[x1][y1-1][x2][y2-1]);
						dp[x1][y1][x2][y2]=Math.max(person1, person2);
						dp[x1][y1][x2][y2]+=map[x1][y1];
						
						//如果两条路没有相交，加上第二条路的值
						if(x1!=x2 && y1!=y2)
							dp[x1][y1][x2][y2]+=map[x2][y2];
					}
		System.out.println(dp[N][N][N][N]);
			
		
	}
	
}
