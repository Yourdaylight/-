package AlgorithmTrainning;
import java.util.*;
public class ��ש�̷� {
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
		
		//�����С��0ʱ˵��1��2����ϲ��ܵó���ǰ���
		if(num<0)
			return;
		brick(num-1);
		brick(num-2);
		
	}
}
