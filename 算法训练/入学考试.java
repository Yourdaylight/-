import java.util.*;
public class ��ѧ���� {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//�ܲ�ժʱ��
        int M = sc.nextInt();//��ҩ����

        int[] dp = new int[T + 1];
        for (int i=1;i<=M;i++){
            int time=sc.nextInt();
            int value=sc.nextInt();

            for(int j=T;j>=time;j--){
                dp[j]=Math.max(dp[j],dp[j-time]+value);
            }
        }
        System.out.println(dp[T]);
    }
}
