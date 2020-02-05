package BasicPractice;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] n=new int[num];
		for(int i=0;i<num;i++)
			n[i]=sc.nextInt();
		
		Arrays.sort(n);
		for(int i=0;i<n.length;i++)
			System.out.print(n[i]+" ");
		
	} 
}
