package BasicPractice;
import java.util.Scanner;
import java.util.ArrayList;
public class ¹ş·òÂüÊıÇóºÍ {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		ArrayList list=new ArrayList();

		int min1=0;
		int min2=0;
		int temp;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int add=scan.nextInt();
			list.add(add);
		}
		
		
		for(int i=0;i<n;i++)
		{	
			if(list.size()==1)
				break;
			list.sort(null);
			min1=(int)list.get(0);
			min2=(int)list.get(1);
			if(list.size()==2)
			{
				temp=min1+min2;
				list.clear();
				list.add(temp);
				sum+=temp;
				break;
			}
			
			temp=min1+min2;
			list.remove(0);
			list.remove(0);
			list.add(temp);
			sum+=temp;
			
		}
		System.out.println(sum);
	}

}
