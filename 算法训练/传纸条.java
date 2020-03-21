import java.util.*;
public class ��ֽ�� {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] room=new int[m+1][n+1];
        int[][][][] dp=new int[m+1][n+1][m+1][n+1];
        for(int i=1;i<=m;i++) {
            for (int j = 1; j <= n; j++)
                room[i][j] = sc.nextInt();
        }


        for(int x1=1;x1<=m;x1++){
            for(int y1=1;y1<=n;y1++){
                for(int x2=1;x2<=m;x2++){
                    for(int y2=1;y2<=n;y2++){
                        //����λ������������������ѭ��
                        if((x1<m||y1<n)&&x1==x2&&y1==y2)
                            continue;

                        //�Ƚ����½ǵ�ֵ
                        int compare1=Math.max(dp[x1-1][y1][x2-1][y2],dp[x1-1][y1][x2][y2-1]);
                        //�Ƚ����½ǵ�ֵ
                        int compare2=Math.max(dp[x1][y1-1][x2-1][y2],dp[x1][y1-1][x2][y2-1]);
                        //�ҵ�ǰһ�������ֵ+��ǰֵ
                        dp[x1][y1][x2][y2]=Math.max(compare1,compare2)+room[x1][y1]+room[x2][y2];
                    }
                }
            }
        }

        System.out.println(dp[m][n][m][n]);
    }
}
