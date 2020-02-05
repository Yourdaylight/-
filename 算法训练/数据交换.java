package AlgorithmTrainning;

import java.util.Scanner;

public class Êý¾Ý½»»» {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int arr[]=exchange(a,b);
		
		System.out.println(arr[0]+" "+arr[1]);
	}
	
	public static int[] exchange(int a ,int b)
	{
		int c=a;
		a=b;
		b=c;
		int arr[]= {a,b};
		return arr;
		
	}
}
