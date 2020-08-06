
public class »ØÎÄÊı {
	
public static void main(String[] args)
{
	for(int i=1000;i<=9999;i++)
	{
		String str=String.valueOf(i);
		StringBuilder lastTwo=new StringBuilder(str.substring(2,4));
		if (str.substring(0,2).equals(lastTwo.reverse().toString()))
			System.out.println(i);
	}
}
}
