package AlgorithmTrainning;
import java.util.Scanner;
import java.util.ArrayList;

public class æ∞µ„”Œ¿¿ {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		ArrayList list=new ArrayList();
		for(int i=0;i<N;i++)
		{
			int n=scan.nextInt();
			list.add(n);
		}
		list.sort(null);
		for(int i=N-1;i>=0;i--)
			System.out.print(list.get(i)+" ");

	}
}
