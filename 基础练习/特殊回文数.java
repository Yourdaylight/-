package BasicPractice;
//���������Ҹ�λ����֮�͵�������
import java.util.Scanner;

public class ��������� {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=10000;i<999999;i++)
		{
			String flag=judge(i);
			if(flag.equals('q'))
				continue;
			else
			{
				int sum=0;
				for(int j=0;j<flag.length();j++)
				{
					sum+=(flag.charAt(j)-'0');
					
				}
				if(sum==n)
					System.out.println(i);
			}
				
		}
	}
	
	public static String judge(int s)
	{
		String str=String.valueOf(s);
		int length=str.length();
		
		StringBuilder last=new StringBuilder(str);
		String Last=last.reverse().toString();
		if(str.equals(Last))
			return str;
		else return "q";
			
	}
}
