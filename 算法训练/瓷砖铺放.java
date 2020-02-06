package AlgorithmTrainning;
import java.util.*;
public class 瓷砖铺放 {
	static int res=0;
	static int n;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		brick(n);
		System.out.println(res);
	}
	public static void brick(int num)
	{
		
		if(num==0) {
			res++;
			return;
		}
		
		//当结果小于0时说明1和2的组合不能得出当前结果
		if(num<0)
			return;
		brick(num-1);
		brick(num-2);
		
	}
}
