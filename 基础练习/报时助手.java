package BasicPractice;
import java.util.*;
public class ±® ±÷˙ ÷ {
	public static void main(String[] args)
	{
		HashMap map=new HashMap();
		String[] number= {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","30","40","50"};
		String[] English= {"zero","one","two","three","four","five","six","seven",
							"eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen",
							"sixteen","seventeen","eighteen","nineteen","twenty",
							"twenty one","twenty two","twenty three","twenty four","thirty","forty","fifty"};
		for(int i=0;i<number.length;i++)
			map.put(number[i], English[i]);
		
		Scanner scan=new Scanner(System.in);
		String h=scan.next();
		String m=scan.next();
		String hour=(String) map.get(h);
		String min;
		
		if(map.containsKey(m)) {
			if (m.equals("0"))
				min=" o'clock";
			else
				min=" "+(String) map.get(m);
		}

			
		else
		{
			char[] c=m.toCharArray();
			int ten=Integer.valueOf(String.valueOf(c[0]))*10;
			min=" "+(String) map.get(String.valueOf(ten))+" "+(String) map.get(String.valueOf(c[1]));
		}
		System.out.println(hour+min);
	}
}
