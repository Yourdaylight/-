package AlgorithmTrainning;
import java.util.*;
public class 幂方分解 {
	static ArrayList list=new ArrayList();//分解出来的2的幂
	static int flag=-1;
	static HashMap map=new HashMap();
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		map.put(0, "2(0)");
		map.put(1, "2");
		map.put(2, "2(2)");
		System.out.print(style(n));

	}
	
	public static void split(int num)
	{
		if(num==0)
			return ;
		
		flag+=1;
		//换底公式：以2 为底进行对数运算
		double a=Math.log(num)/Math.log(2.0);
		int b=(int) a;
		num-=Math.pow(2, b);//将剩下未分解的值进行递归分解
	
		if(b>2)
			System.out.print("2("+style(b)+")");
		else 
			System.out.print("+"+style(b));
		split(num);
	}
	
	public static String style(int num)
	{
	
		if(num==0) return "";	//为0时递归结束
		
		String str="";
		double a=Math.log(num)/Math.log(2.0);
		int b=(int) a;//num分解后得到的幂
		num-=Math.pow(2, b);//待分解的余数
		
		if (num==0 && (b==0 || b==1 || b==2))
			str+=map.get(b);
		
		else
			if(b==0 || b==1 || b==2)
				str+=map.get(b)+"+"+style(num);
			else
				str+="2("+style(b)+")"+"+"+style(num);
		if(str.endsWith("+"))
			return str.substring(0, str.length()-1);
		return str;
		
	}
}
