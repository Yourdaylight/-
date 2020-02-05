package BasicPractice;
import java.util.*;
public class 皇后问题2n {
	
	static int[][] board;
	static int count=0;
	static int n;
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
	
		n=scan.nextInt();//棋盘大小
		board=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				board [i][j]=scan.nextInt();
		put(0,2);
		System.out.println(count);
		
	}
	
	public static void put(int num,int type)
	//type:皇后类型（2-黑，3-白）
	//num:第n个皇后
	//按规则每行都有且仅有一个黑/白皇后
	{
		//检查是否所有棋子摆放完毕
		if(num==n)
		{
			if(type==2)
				put(0,3);
			else
				count++;//到此一轮放置完成，方法数+1
			
			return ;
		}
		
		//对于每个位置，判断是否可以放置
		for(int i=0;i<n;i++) 
		{
			if(board[num][i]!=1) 
				continue;
			if(check(num,i,type))
				board[num][i]=type;
			else
				continue;
			
			put(num+1,type);//进行下一个皇后的放置
			
			//进行到该步骤说明黑棋已经放置完毕，此时回溯棋盘将该位置变为原始值
			board[num][i]=1;
		}
	}
	
	public static boolean check(int num,int col,int type)
	{
		//检查同一列(只需检查上方，因为下方还没有放置)
		for(int i=num-1;i>=0;i--) 
			if(board[i][col]==type)
				return false;
		
		
		//检查左对角线(只需检查上方，因为下方还没有放置)
		for(int i=num-1,j=col-1;i>=0&&j>=0;i--,j--)
			if(board[i][j]==type)
				return false;
		
		//检查右对角线(只需检查上方，因为下方还没有放置)
		for(int i=num-1,j=col+1;i>=0&&j<n;i--,j++)
			if(board[i][j]==type)
				return false;
		
		return true;
	}
	
	
}

