package BasicPractice;
import java.math.BigDecimal;
import java.util.Scanner;
public class 高精度加法 {
 public static void main(String[] args)
 {

	 BigDecimal aBigDecimal ;
     BigDecimal bigDecimal;
     BigDecimal cBigDecimal;
     Scanner scanner = new Scanner(System.in);
     aBigDecimal = scanner.nextBigDecimal();
     bigDecimal = scanner.nextBigDecimal();
     cBigDecimal = aBigDecimal.add(bigDecimal);
     System.out.println(cBigDecimal);
 }
}
