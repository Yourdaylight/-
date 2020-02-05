package BasicPractice;
import java.util.Scanner;
import java.util.ArrayList;;
public class ²éÕÒÕûÊı {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		ArrayList list1=new ArrayList();
	
		for(int i=0;i<n;i++)
		{
			int s=scan.nextInt();
			list1.add(s);
		}
		int find=scan.nextInt();
		int res=list1.indexOf(find);
		if (list1.contains(find))
			System.out.println(res+1);
		else
			System.out.println(-1);

	}
}
