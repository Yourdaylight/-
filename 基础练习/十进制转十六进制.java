package BasicPractice;

import java.util.Scanner;
public class 十进制转十六进制 {
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	int ten=scan.nextInt();
	System.out.println(Integer.toHexString(ten).toUpperCase());
	}
}
