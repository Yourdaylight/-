package AlgorithmTrainning;
import java.util.*;
public class ���мҵ�Ԥ�� {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double D1=sc.nextDouble();//��������֮��ľ���
		double C=sc.nextDouble();//�������������
		double D2=sc.nextDouble();//ÿ��������ʻ�ľ���
		double P=sc.nextDouble();//��������ͼ�
		
		int N=sc.nextInt();//��;��վ��
		double[] Pi=new double[N+2];//ÿ��վ����ͼ�
		double[] D=new double[N+2];//�������ľ���
		double MaxDistance=D2*C;
		
		//��ʼ��������ͼ����飬��������յ�Ҳ��������
		D[0]=0;Pi[0]=P;
		D[N+1]=D1;Pi[N+1]=0;
		for(int i=1;i<=N;i++) {
			D[i]=sc.nextDouble();
			Pi[i]=sc.nextDouble();
		}
		
		double fee=0;
		double remain=0;
		//�޽�����
		for(int i=0;i<=N;i++)
			if(D[i+1]-D[i]>MaxDistance) {
				System.out.println("No Solution");
				return ;
			}

		//�н⣬��ʼ����ÿһ��վ��
		int i=0;
		while(i<=N)
		{
			int j;
			for(j=i+1;j<=N+1;j++)
			{
				if (D[j]-D[i]>MaxDistance) 
				{
					j-=1;//�����ʻ�����޷�����j,�����󵽴�j-1վ��
					break;
				}
				if(Pi[j]<=Pi[i])
					break;//�ҵ���һ�������˵ļ���վ
			}
			System.out.println("j="+j);
			if(Pi[j]<=Pi[i]) {
				fee+=((D[j]-D[i])/D2-remain)*Pi[i];
				remain=0;
			}
			
			else {
				fee+=(C-remain)*Pi[i];
				remain=C-(D[j]-D[i])/D2;
			}
			
			i=j;//ǰ����һ������վ���εεΣ�
		}
		System.out.println(String.format("%.2f", fee));

	}
}
