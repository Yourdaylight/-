package BasicPractice;
import java.util.*;
public class 数的读法 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] c=s.toCharArray();
		HashMap digit=new HashMap();
		HashMap pinyin=new HashMap();
		String result="";
		
		String[] number= {"0","1","2","3","4","5","6","7","8","9"};
		String[] pin= {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		for(int i=0;i<10;i++)
			pinyin.put(number[i], pin[i]);
		

		String[] number2= {"0","1","2","3"};
		String[] pin2= {"qian","","shi","bai"};
		for(int i=0;i<4;i++)
			digit.put(number2[i], pin2[i]);
		
		int count=0;
		int i=0;
		while(i<c.length)
		{
			int Dig=c.length-i;//当前位数
			int left=Dig%4;//在每四位的位置（个十百千）
			String thisnumber=(String)pinyin.get(String.valueOf(c[i]));//当前数字的拼音
			String thisdigit=(String)digit.get(String.valueOf(left));//当前数字的位数
			
			if(thisnumber.equals("ling") && Dig!=5 && Dig!=9)
				result+="ling"+" ";
			else
			{
				if(Dig==5)
					//拼音+位数名称
					result+=thisnumber+" wan ";
				else if(Dig==9)
					result+=thisnumber+" yi ";//拼音+位数名称
				else
					result+=thisnumber+" "+thisdigit+" ";//拼音+位数名称
			}
			

			result=result.replace("ling wan", "wan");
			result=result.replace("ling bai", "ling");
			result=result.replace("ling shi", "ling");

			result=result.replace("ling ling", "ling");
			i++;
		}
		
		if(result.endsWith("ling ")) //末尾的零不读
			result=result.substring(0,result.length()-6);

		result = result.replace("yi shi", "shi");
		

		System.out.println(result);
	}
}
//0000 0000 0000 0000