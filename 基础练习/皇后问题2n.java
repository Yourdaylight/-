package BasicPractice;
import java.util.*;
public class �ʺ�����2n {
	
	static int[][] board;
	static int count=0;
	static int n;
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
	
		n=scan.nextInt();//���̴�С
		board=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				board [i][j]=scan.nextInt();
		put(0,2);
		System.out.println(count);
		
	}
	
	public static void put(int num,int type)
	//type:�ʺ����ͣ�2-�ڣ�3-�ף�
	//num:��n���ʺ�
	//������ÿ�ж����ҽ���һ����/�׻ʺ�
	{
		//����Ƿ��������Ӱڷ����
		if(num==n)
		{
			if(type==2)
				put(0,3);
			else
				count++;//����һ�ַ�����ɣ�������+1
			
			return ;
		}
		
		//����ÿ��λ�ã��ж��Ƿ���Է���
		for(int i=0;i<n;i++) 
		{
			if(board[num][i]!=1) 
				continue;
			if(check(num,i,type))
				board[num][i]=type;
			else
				continue;
			
			put(num+1,type);//������һ���ʺ�ķ���
			
			//���е��ò���˵�������Ѿ�������ϣ���ʱ�������̽���λ�ñ�Ϊԭʼֵ
			board[num][i]=1;
		}
	}
	
	public static boolean check(int num,int col,int type)
	{
		//���ͬһ��(ֻ�����Ϸ�����Ϊ�·���û�з���)
		for(int i=num-1;i>=0;i--) 
			if(board[i][col]==type)
				return false;
		
		
		//�����Խ���(ֻ�����Ϸ�����Ϊ�·���û�з���)
		for(int i=num-1,j=col-1;i>=0&&j>=0;i--,j--)
			if(board[i][j]==type)
				return false;
		
		//����ҶԽ���(ֻ�����Ϸ�����Ϊ�·���û�з���)
		for(int i=num-1,j=col+1;i>=0&&j<n;i--,j++)
			if(board[i][j]==type)
				return false;
		
		return true;
	}
	
	
}

