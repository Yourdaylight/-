
import java.util.*;
public class ��������Ԥ�� {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int v1,v2,t,s,l;
		v1=scan.nextInt();//�����ٶ�
		v2=scan.nextInt();//�ڹ��ٶ�
		t=scan.nextInt();//�������ȵľ���
		s=scan.nextInt();//������Ϣ��ʱ��
		l=scan.nextInt();//��������
		int least=l/v2;
		int[] Rabbit=new int[least+6];
		int[] Turtle=new int[least+6];
		int i=1;//��ʱ��
	
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
			
			//�����ӿ�ʼ��Ϣʱ
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
