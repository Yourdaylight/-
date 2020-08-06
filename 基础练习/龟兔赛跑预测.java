
import java.util.*;
public class 龟兔赛跑预测 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int v1,v2,t,s,l;
		v1=scan.nextInt();//兔子速度
		v2=scan.nextInt();//乌龟速度
		t=scan.nextInt();//兔子领先的距离
		s=scan.nextInt();//兔子休息的时间
		l=scan.nextInt();//赛道长度
		int least=l/v2;
		int[] Rabbit=new int[least+6];
		int[] Turtle=new int[least+6];
		int i=1;//总时间
	
		while(i<=least)
		{
			if(Rabbit[i-1]-Turtle[i-1]<t)
			{
				Rabbit[i]=Rabbit[i-1]+v1;
				Turtle[i]=Turtle[i-1]+v2;
				if((Turtle[i]==Rabbit[i]) && Rabbit[i]==l) {
					System.out.print("D"+"\n"+i);
					break;
				}
				else if (Rabbit[i]>=l) {
					System.out.print("R"+"\n"+i);
					break;
				}
				else if (Turtle[i]>=l) {
					System.out.print("T"+"\n"+i);
					break;
				}
			
				i++;
			}
			
			//当兔子开始休息时
			else if(Rabbit[i-1]-Turtle[i-1]>=t)
			{
				Rabbit[i+s-1]=Rabbit[i-1];
				Turtle[i+s-1]=Turtle[i-1]+v2*s;
				if(Turtle[i+s-1]>=l)
				{
					System.out.println("T");
					System.out.println(l/v2);
					break;
				}
				else
					i+=s;
			}
		}
	}
	
}
