package BasicPractice;
import java.util.*;
public class ���Ķ��� {
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
			int Dig=c.length-i;//��ǰλ��
			int left=Dig%4;//��ÿ��λ��λ�ã���ʮ��ǧ��
			String thisnumber=(String)pinyin.get(String.valueOf(c[i]));//��ǰ���ֵ�ƴ��
			String thisdigit=(String)digit.get(String.valueOf(left));//��ǰ���ֵ�λ��
			
			if(thisnumber.equals("ling") && Dig!=5 && Dig!=9)
				result+="ling"+" ";
			else
			{
				if(Dig==5)
					//ƴ��+λ������
					result+=thisnumber+" wan ";
				else if(Dig==9)
					result+=thisnumber+" yi ";//ƴ��+λ������
				else
					result+=thisnumber+" "+thisdigit+" ";//ƴ��+λ������
			}
			

			result=result.replace("ling wan", "wan");
			result=result.replace("ling bai", "ling");
			result=result.replace("ling shi", "ling");

			result=result.replace("ling ling", "ling");
			i++;
		}
		
		if(result.endsWith("ling ")) //ĩβ���㲻��
			result=result.substring(0,result.length()-6);

		result = result.replace("yi shi", "shi");
		

		System.out.println(result);
	}
}
//0000 0000 0000 0000