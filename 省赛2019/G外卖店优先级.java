package 省赛2019;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.*;
public class G外卖店优先级 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		int N=scan.nextInt();//店铺数量
		int M=scan.nextInt();//订单信息条数
		int T=scan.nextInt();//时刻
		
		int order[][]=new int[M][2];//每个时刻每个店铺的订单量
		int priority[]=new int[N];//记录每个店铺的优先级

		
		for (int i=0;i<M;i++) {
			int ts=scan.nextInt();
			int id=scan.nextInt();
			order[ts-1][id-1]+=1;
		}
		

		for (int i=0;i<M;i++) {
			for(int j=0;j<2;j++) {
				if (order[i][j]!=0)
					priority[j]+=order[i][j]*2;
				else
					priority[j]-=1;
				if (priority[j]<0)
					priority[j]=0;
				
			}
		}
		int count=0;
		for(int p:priority)
		{
			if (p>=5)
				count+=1;
		}
		System.out.println(count);
	}
}
