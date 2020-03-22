import java.util.*;
public class 入学考试 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//总采摘时间
        int M = sc.nextInt();//草药数量

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
