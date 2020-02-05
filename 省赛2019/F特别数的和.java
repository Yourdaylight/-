package 省赛2019;
import java.util.Scanner;
import java.util.HashMap;
public class F特别数的和 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		HashMap map=new HashMap();
		int n=scan.nextInt();
		for (int i=1;i<10000;i++)
		{
			String s=String.valueOf(i);
			char[] c=s.toCharArray();
			for(char j:c)
			{
				if (j=='2' || j=='0' || j=='1' || j=='9')
					map.put(i, 1);
			}
		}
		int sum=0;
		for (int i=1;i<=n;i++)
		{
			if (map.containsKey(i))
				sum+=i;
		}
		System.out.print(sum);
	}
	
}
