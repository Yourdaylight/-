package BasicPractice;
import java.util.*;
public class �ֽ������� {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.close();
		for(int i=n;i<m+1;i++)
		{
			split(i);
			System.out.println();
		}
	}

	
	public static void split(int x)
	{
		int prime = 2;
		int n = x;
		int first = 1;
		while (prime <= n)
		{
			//�жϵ�ǰ�����Ƿ�Ϊ����
			//���x������������+1
			if (!(x % prime == 0)) 
				prime++;
			//����������������Ը������õ���һ���ֽ���ֵ
			else {
				x /= prime;
				if (first == 1) {
					System.out.print(n + "=" + prime);
					first++;
				} 
				else 
					System.out.print("*" + prime);
			}
		}

	}
}