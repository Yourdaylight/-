package AlgorithmTrainning;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class 区间k大数查询 {
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		final ArrayList List=new ArrayList();
		for (int i=0;i<n;i++)
		{
			List.add(scan.nextInt());
		}
		int m=scan.nextInt();
		int[] l=new int[m];
		int[] r=new int[m];
		int[] k=new int[m];
		for (int i=0;i<m;i++)
		{
			
			l[i]=scan.nextInt();
			r[i]=scan.nextInt();
			k[i]=scan.nextInt();

		}
		scan.close();
		for (int i=0;i<m;i++)
		{
			System.out.println(search(l[i],r[i],k[i],List));
		}
	
	}
	
	public static int search(int l,int r,int k,ArrayList olist)
	{
		ArrayList lr=new ArrayList();
		for (int i=l-1;i<r;i++)
		{
			lr.add(olist.get(i));
		}
	
		lr.sort(null);
		return (int) lr.get(lr.size()-k);
		
	}
}

