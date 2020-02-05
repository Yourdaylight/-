package BasicPractice;
import java.util.*;
public class 回形取数 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int[][] martix=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				martix[i][j]=scan.nextInt();
			}
		}
		ArrayList list=new ArrayList();
		int num=m*n;
		int row=0,col=0;
		while(num>0)
		{
			//向下搜索
			while(row<m && martix[row][col]!=-1){
				list.add(martix[row][col]);
				martix[row][col]=-1;
				num-=1;
				row+=1;
			}
			
			row-=1;
			col+=1;
			
			//向右搜索
			while(col<n && martix[row][col]!=-1) {
				list.add(martix[row][col]);
				martix[row][col]=-1;
				num-=1;
				col+=1;
			}
			col-=1;
			row-=1;
			
			//向上搜索
			while(row>=0 && martix[row][col]!=-1) {
				list.add(martix[row][col]);
				martix[row][col]=-1;
				num-=1;
				row-=1;
			}
			row+=1;
			col-=1;
			
			//向左搜索
			while(col>=0 && martix[row][col]!=-1) {
				list.add(martix[row][col]);
				martix[row][col]=-1;
				num-=1;
				col-=1;
			}
			row+=1;
			col+=1;
			
		}
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
	}
	
}
	


