import java.util.*;
public class 单词接龙 {
	static String[] words;
	static HashMap map;
	static int max=-1;

	static int lap[][];//任意两个单词间重叠的部分
	static int count=0;
	static int temp;

	public static void  main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		map=new HashMap();
		words=new String[n];
		lap=new int[n][n];
		for(int i=0;i<n;i++)
		{
			words[i]=sc.next();
			map.put(words[i], 0);
		}
		
		String start=sc.next();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				lap[i][j]=prepare(i, j);
		}


		for(int i=0;i<n;i++)
		{
			if(words[i].indexOf(start)==0)
			{
				map.put(words[i], 1);
				temp=words[i].length();
				dfs(i);
				map.put(words[i], 0);
			}
		}
		System.out.println(max);

	}
	public static int prepare(int i,int j)
	{
		boolean flag=true;
		for(int k=words[i].length()-1,l=1;k>=0 && l<words[j].length();k--,l++)
		{
			String LastOfi=words[i].substring(k);
			String Startj=words[j].substring(0,l);
			
			if(LastOfi.equals(Startj))
				return l;
		}
		return 0;
	}
	
	public static void dfs(int WordIndex)
	{
		boolean flag=false;
		for(int i=0;i<words.length;i++)
		{
			if((int)map.get(words[i])>=2) 
				continue;
			if(lap[WordIndex][i]==0)
				continue;

			temp+=words[i].length()-lap[WordIndex][i];//接龙，减去重合部分
			map.put(words[i], (int)map.get(words[i])+1);
			flag=true;
			dfs(i);
			temp-=words[i].length()-lap[WordIndex][i];
			map.put(words[i], (int)map.get(words[i])-1);
			
		}
		if(flag==false)
			max=Math.max(max, temp);
		System.out.println(map);
		return;
	}
}
