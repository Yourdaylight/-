
import java.util.*;

public class ��������� {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double x1,x2,x3,x4,y1,y2,y3,y4;
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		x3=sc.nextDouble();
		y3=sc.nextDouble();
		x4=sc.nextDouble();
		y4=sc.nextDouble();
		//��һ�����ε�x,y�������Сֵ
		double maxx = Math.max(x1, x2), minx = Math.min(x1, x2), maxy = Math.max(y1, y2), miny = Math.min(y1, y2);
		//�ڶ������ε�x,y�������Сֵ
		double maxx2 = Math.max(x3, x4), minx2 = Math.min(x3, x4), maxy2 = Math.max(y3, y4), miny2 = Math.min(y3, y4);
 
		// �ж��Ƿ������������
		if (minx2 >= maxx || minx >= maxx2 || miny2 >= maxy || miny >= maxy2)
			System.out.println("0.00");
		else 
		{
			// �ҳ��ཻ�ľ��ε������㣬��1��xx,yy�� ��2��x,y��
			double xx = Math.max(minx, minx2), yy = Math.max(miny, miny2);
			double x = Math.min(maxx, maxx2), y = Math.min(maxy, maxy2);
			System.out.println(String.format("%.2f", (Math.abs(x - xx) * Math.abs(y - yy))));
		}

	}
}
