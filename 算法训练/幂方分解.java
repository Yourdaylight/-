package AlgorithmTrainning;
import java.util.*;
public class �ݷ��ֽ� {
	static ArrayList list=new ArrayList();//�ֽ������2����
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
		//���׹�ʽ����2 Ϊ�׽��ж�������
		double a=Math.log(num)/Math.log(2.0);
		int b=(int) a;
		num-=Math.pow(2, b);//��ʣ��δ�ֽ��ֵ���еݹ�ֽ�
	
		if(b>2)
			System.out.print("2("+style(b)+")");
		else 
			System.out.print("+"+style(b));
		split(num);
	}
	
	public static String style(int num)
	{
	
		if(num==0) return "";	//Ϊ0ʱ�ݹ����
		
		String str="";
		double a=Math.log(num)/Math.log(2.0);
		int b=(int) a;//num�ֽ��õ�����
		num-=Math.pow(2, b);//���ֽ������
		
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
