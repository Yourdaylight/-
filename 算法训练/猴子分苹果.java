import java.util.*;
public class ���ӷ�ƻ�� {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        //ÿ�γ�m���ٷ��䣬����һ��
        int sum = (int) Math.pow(n, n+1) - (n-1)*m;
        System.out.println(sum);

    }
}
