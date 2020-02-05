package BasicPractice;
import java.util.*;
public class 分解质因子 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.close();
		for(int i=n;i<m+1;i++)
		{
			split(i);
			System.out.println();
		}
	}

	
	public static void split(int x)
	{
		int prime = 2;
		int n = x;
		int first = 1;
		while (prime <= n)
		{
			//判断当前数字是否为素数
			//如果x不能整除，则+1
			if (!(x % prime == 0)) 
				prime++;
			//如果不是素数，除以该数，得到第一步分解后的值
			else {
				x /= prime;
				if (first == 1) {
					System.out.print(n + "=" + prime);
					first++;
				} 
				else 
					System.out.print("*" + prime);
			}
		}

	}
}