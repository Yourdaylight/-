package ʡ��2019;
import java.util.*;

public class H��������Է��� {
	public static int res=0;
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		HashMap map=new HashMap();
		for (int i=65;i<91;i++)
			map.put(String.valueOf((char)i),1);
		for(int i=97;i<123;i++)
			map.put(String.valueOf((char)i),1);
		for(int i=0;i<9;i++)
			map.put(String.valueOf(i),1);
		
		
		int K=scan.nextInt();//�ַ������
		scan.nextLine();
		String s=scan.nextLine();//�ַ���
		/*
		 * ����ַ���һ�飬�����Alice���������20����δ����Bob*/
		search(s,K,0,0);
		System.out.println(res);	
	}
	
	//flag ǰһ�ε������Ƿ�ƥ�䵽Bob
	public static void search(String s,int K,int index,int flag)
	{
		
		for(int i=index;i<s.length();i++)
		{
			if (i+4==s.length())
				break;
			String sub=s.substring(i,i+5);
	
			if (sub.equals("Alice")) {
				System.out.println("�ɹ�ƥ�䵽Alice");
				System.out.println("������ʼ��"+i+","+(i+5));
				if (flag==1) {
					res+=1;
					System.out.println(sub+"����ֵ"+i);

				}
				
				for (int j=i+5;j<i+5+K;j++) {
					if (j+3==i+5+K)
						break;
					String sub2=s.substring(j,j+3);
					if(sub2.equals("Bob"))
					{
						res+=1;
						System.out.println("�ɹ�ƥ�䵽Bob");
				
						search(s,K,j+4,1);
						}
					}
					
				}
			}
			

		}
	
	
}
