package AlgorithmTrainning;

import java.util.Scanner;

public class 摆动序列{
	static int[] value;//存放序列值
	static int[] isfind;//标记遍历过的点（用1 表示）
	static int sum=0;
	public static int k;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();//序列长度[1,k]
		value=new int[k];
		isfind=new int[k+1];
		
		dfs(0);
		System.out.println(sum);
	}
	

	
	public static void dfs(int n)
	//n:value的索引值（长度为n的序列）
	{
		if(n>1)
		{
			if(n==2)
				sum+=1;
			else if((value[n-2]-value[n-3])*(value[n-1]-value[n-3])<0)
				sum+=1;
			else
				return;
		}
		

		for(int i=1;i<=k;i++)
		{

			if(isfind[i]==0)
			{
				value[n]=i;//找到i未遍历，将其存放在序列的第n个值
				isfind[i]=1;//找到元素就置1
				dfs(n+1);//寻找序列的下一个值
				
				//回溯
				value[n]=0;
				isfind[i]=0;
			}
		}

	}
}
