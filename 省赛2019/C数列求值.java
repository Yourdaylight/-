package 省赛2019;
import java.util.ArrayList;
public class C数列求值 {
	public static void main(String[] args)
	{
		ArrayList<Long> arr=new ArrayList<Long>();
		arr.add((long) 1);
		arr.add((long) 1);
		arr.add((long) 1);
		int key=0;
		for (int i=3;i<20190324;i++)
		{
			long sum=0;
			for (int j=key;j<key+3;j++)
			{
				sum+=arr.get(j);
			}
			arr.add(sum%10000);
			key+=1;

		}
		System.out.print(arr.get(20190323));
	}
}
