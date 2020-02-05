package 省赛2019;

import java.util.ArrayList;
import java.util.HashMap;

public class B不同字串 {
//    public static void main(String[] args)
//    {
//    	String s="0100110001010001";
//    	ArrayList<String> arr=new ArrayList<String>();
//    	arr.add("0");
//    	int len=0;
//    	int circle=s.length();
//    	for(int i=0;i<s.length();i++)
//    	{
//
//    		for(int j=0;j<s.length()-i;j++)
//    		{
//	    	
//	    		String sub=s.substring(j,j+i+1);
//	    		int flag=0;
//	    		for (String s1:arr)
//	    		{
//	    			if (s1.equals(sub))
//	    			{
//	    				flag=0;
//	    				break;
//	    			}
//	    			else flag+=1;
//	    		}
//	    		if (flag!=0)
//	    				arr.add(sub);
//	    		
//    		}
//    	}
//    	System.out.println(arr.size());
//    }
	public static void main(String[] args)
	{
		  String str = "0100110001010001";
		  HashMap<String,Integer> map=new HashMap<String,Integer>();
		  
		  for (int i=1;i<=str.length();i++)
		  {
			  for(int j=0;j<=str.length()-i;j++)
			  {
				  String s=str.substring(j,j+i);
				  if (map.containsKey(s)==false)
					  map.put(s, 1);
			  }
	
		  }
		  System.out.println(map.size());
	}
}
