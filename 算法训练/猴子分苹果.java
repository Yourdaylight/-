import java.util.*;
public class 猴子分苹果 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        //每次吃m个再分配，拿走一份
        int sum = (int) Math.pow(n, n+1) - (n-1)*m;
        System.out.println(sum);

    }
}
