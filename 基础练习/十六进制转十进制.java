package BasicPractice;
import java.util.Scanner;
public class 十六进制转十进制 {
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	String input=scan.next();
	int n=Integer.parseInt(input, 16);
	System.out.println(n);
	}
	
}
