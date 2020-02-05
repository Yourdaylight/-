package AlgorithmTrainning;
import java.util.Scanner;
public class º”∑®‘ÀÀ„ {

	public static void main(String[] args)
	{
		int arr[]=GetTwoInts();
		System.out.println(arr[0]+arr[1]);
	}
	public static  int[] GetTwoInts()
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int arr[]= {a,b};
		return arr;
	}
}
