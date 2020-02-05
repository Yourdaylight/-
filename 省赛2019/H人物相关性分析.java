package 省赛2019;
import java.util.*;

public class H人物相关性分析 {
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
		
		
		int K=scan.nextInt();//字符串间隔
		scan.nextLine();
		String s=scan.nextLine();//字符串
		/*
		 * 五个字符串一组，如果是Alice，向后搜索20，若未出现Bob*/
		search(s,K,0,0);
		System.out.println(res);	
	}
	
	//flag 前一次调用中是否匹配到Bob
	public static void search(String s,int K,int index,int flag)
	{
		
		for(int i=index;i<s.length();i++)
		{
			if (i+4==s.length())
				break;
			String sub=s.substring(i,i+5);
	
			if (sub.equals("Alice")) {
				System.out.println("成功匹配到Alice");
				System.out.println("索引起始点"+i+","+(i+5));
				if (flag==1) {
					res+=1;
					System.out.println(sub+"索引值"+i);

				}
				
				for (int j=i+5;j<i+5+K;j++) {
					if (j+3==i+5+K)
						break;
					String sub2=s.substring(j,j+3);
					if(sub2.equals("Bob"))
					{
						res+=1;
						System.out.println("成功匹配到Bob");
				
						search(s,K,j+4,1);
						}
					}
					
				}
			}
			

		}
	
	
}
