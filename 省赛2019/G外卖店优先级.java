package ʡ��2019;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.*;
public class G���������ȼ� {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		int N=scan.nextInt();//��������
		int M=scan.nextInt();//������Ϣ����
		int T=scan.nextInt();//ʱ��
		
		int order[][]=new int[M][2];//ÿ��ʱ��ÿ�����̵Ķ�����
		int priority[]=new int[N];//��¼ÿ�����̵����ȼ�

		
		for (int i=0;i<M;i++) {
			int ts=scan.nextInt();
			int id=scan.nextInt();
			order[ts-1][id-1]+=1;
		}
		

		for (int i=0;i<M;i++) {
			for(int j=0;j<2;j++) {
				if (order[i][j]!=0)
					priority[j]+=order[i][j]*2;
				else
					priority[j]-=1;
				if (priority[j]<0)
					priority[j]=0;
				
			}
		}
		int count=0;
		for(int p:priority)
		{
			if (p>=5)
				count+=1;
		}
		System.out.println(count);
	}
}
