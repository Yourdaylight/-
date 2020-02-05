package AlgorithmTrainning;

import java.util.Scanner;
public class 最大最小公倍数 {
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		long n=scan.nextLong();
		long num1=n-1;
		long num2=n-2;
		long res=0;
		if (n<=2) res=n;
		else if (n%2==1) res=n*num1*num2;
		else if (n%3==0) res=(n-1)*(num1-1)*(num2-1);
		else res=n*(n-1)*(n-3);
		System.out.print(res);
		
	}
}
