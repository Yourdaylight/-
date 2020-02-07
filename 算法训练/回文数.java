package AlgorithmTrainning;
import java.util.*;
public class »ØÎÄÊý {
	public static int count=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String M=sc.next();
		calculate(N, M);
	}
	
	public static void calculate(int base,String num)
	{
		if(count>30) {
			System.out.println("Impossible!");
			return ;
		}
		
		StringBuilder sb=new StringBuilder(num);
		String reverse=sb.reverse().toString();
		long tenbase=Long.parseLong(num,base);
		long tenbase2=Long.parseLong(reverse,base);
		long res=tenbase+tenbase2;
		
		String str=Long.toString(res, base);
		if(isback(str)) {
			count+=1;
			System.out.println("STEP="+count);
			return ;
			}
		else {
			count+=1;
			calculate(base,str);
		}
	}
	public static boolean isback(String str)
	{
		StringBuilder sb=new StringBuilder(str);
		String reverse=sb.reverse().toString();
		if(str.equals(reverse.toString()))
			return true;
		else
			return false;
	}
}
