package AlgorithmTrainning;
import java.util.*;
public class 最大获利 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//饭店数量
        int M=sc.nextInt();//时间段数量
        int[][] A=new int[N][M];//每个饭店每个时间段服务员数量
        int[][] B=new int[N][M];//每个饭店每个时间段顾客数量
        long[][] C=new long[N][M];//每个饭店每个时间段顾客平均消费额
        int i=0,j=0;
        for(i=0;i<N;i++)
            for(j=0;j<M;j++)
                A[i][j]=sc.nextInt();

        for(i=0;i<N;i++)
            for(j=0;j<M;j++)
                B[i][j]=sc.nextInt();

        for(i=0;i<N;i++)
            for(j=0;j<M;j++)
               C[i][j]=sc.nextInt();

        for(j=0;j<M;j++){
            for(i=0;i<N;i++){
                if(B[i][j]>A[i][j])
                    C[i][j]=A[i][j]*C[i][j];
                else
                    C[i][j]=B[i][j]*C[i][j];
            }
        }

        long sum=0;
        for(i=0;i<N;i++){
            Arrays.sort(C[i]);
            sum+=C[i][M-1];
        }
        System.out.println(sum);


    }
}
