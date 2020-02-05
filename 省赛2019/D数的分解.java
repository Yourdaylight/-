package 省赛2019;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class D数的分解 {
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		ArrayList arr=new ArrayList();
		int sum=0;
		//记录含有2,4的整数
		for (int i=2;i<1995;i++) {
			String s=String.valueOf(i);
			char c[]=s.toCharArray();
			for (int j=0;j<c.length;j++) {
				if(c[j]=='2' || c[j]=='4') {
					map.put(i,1);
					break;
				}
			}
		}
		
		for(int i=1;i<2000;i++) {
			if (map.containsKey(i)==true)
				continue;
			for(int j=1;j<2000;j++) {
				if (i+j>=2019)break;
				if (i==j || map.containsKey(j)==true) continue;
				
				for(int k=1;k<2000;k++) {
					if (i==k || j==k ||map.containsKey(k)) continue;
					if(i+k+j==2019) {
						sum+=1;
						int res[]= {i,j,k};
						arr.add(i);
						arr.add(j);
						arr.add(k);
					}
				}
			}
		}
		
		System.out.println(sum/6);
//		int change=0;
//		for(int i=0;i<arr.size();i++) {
//			change+=1;
//			System.out.print(arr.get(i)+",");
//			if(change%3==0)
//				System.out.print("\n");
//		}
	}
}
