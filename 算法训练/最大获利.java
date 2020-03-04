package AlgorithmTrainning;
import java.util.*;
public class ������ {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//��������
        int M=sc.nextInt();//ʱ�������
        int[][] A=new int[N][M];//ÿ������ÿ��ʱ��η���Ա����
        int[][] B=new int[N][M];//ÿ������ÿ��ʱ��ι˿�����
        long[][] C=new long[N][M];//ÿ������ÿ��ʱ��ι˿�ƽ�����Ѷ�
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
