package AlgorithmTrainning;

import java.util.Scanner;

public class �ڶ�����{
	static int[] value;//�������ֵ
	static int[] isfind;//��Ǳ������ĵ㣨��1 ��ʾ��
	static int sum=0;
	public static int k;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();//���г���[1,k]
		value=new int[k];
		isfind=new int[k+1];
		
		dfs(0);
		System.out.println(sum);
	}
	

	
	public static void dfs(int n)
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
				value[n]=i;//�ҵ�iδ�����������������еĵ�n��ֵ
				isfind[i]=1;//�ҵ�Ԫ�ؾ���1
				dfs(n+1);
				value[n]=0;
				isfind[i]=0;
			}
		}

	}
}