public class 装箱问题 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int n=sc.nextInt();
		int[] goods=new int[n];
		int[][] dp=new int[n][v+1];//存放前i个物品，容量为j时的最大值
		for(int i=0;i<n;i++)
			goods[i]=sc.nextInt();
      
     //初始化第一个值
		for(int j=0;j<v;j++)
			if(goods[0]<=j)
				dp[0][j]=goods[0];
		
		for(int i=1;i<n;i++)
			for(int j=0;j<=v;j++) {
				if(goods[i]<=j)//如果当前值比容量小
					dp[i][j]=Math.max(dp[i-1][j-goods[i]]+goods[i], dp[i-1][j]);
				else//如果当前值比容量大，那么存放前一个物品的容量为最大容量
					dp[i][j]=dp[i-1][j];
			}
		System.out.println(v-dp[n-1][v]);
	}
}
