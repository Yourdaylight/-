package AlgorithmTrainning;
import java.util.*;
public class 旅行家的预算 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double D1=sc.nextDouble();//两个城市之间的距离
		double C=sc.nextDouble();//汽车油箱的容量
		double D2=sc.nextDouble();//每升油能行驶的距离
		double P=sc.nextDouble();//出发点的油价
		
		int N=sc.nextInt();//沿途油站数
		double[] Pi=new double[N+2];//每个站点的油价
		double[] D=new double[N+2];//离出发点的距离
		double MaxDistance=D2*C;
		
		//初始化距离和油价数组，将起点与终点也加入其中
		D[0]=0;Pi[0]=P;
		D[N+1]=D1;Pi[N+1]=0;
		for(int i=1;i<=N;i++) {
			D[i]=sc.nextDouble();
			Pi[i]=sc.nextDouble();
		}
		
		double fee=0;
		double remain=0;
		//无解的情况
		for(int i=0;i<=N;i++)
			if(D[i+1]-D[i]>MaxDistance) {
				System.out.println("No Solution");
				return ;
			}

		//有解，开始遍历每一个站点
		int i=0;
		while(i<=N)
		{
			int j;
			for(j=i+1;j<=N+1;j++)
			{
				if (D[j]-D[i]>MaxDistance) 
				{
					j-=1;//最大行驶距离无法到达j,因此最大到达j-1站点
					break;
				}
				if(Pi[j]<=Pi[i])
					break;//找到下一个更便宜的加油站
			}
			System.out.println("j="+j);
			if(Pi[j]<=Pi[i]) {
				fee+=((D[j]-D[i])/D2-remain)*Pi[i];
				remain=0;
			}
			
			else {
				fee+=(C-remain)*Pi[i];
				remain=C-(D[j]-D[i])/D2;
			}
			
			i=j;//前往下一个加油站，滴滴滴！
		}
		System.out.println(String.format("%.2f", fee));

	}
}
