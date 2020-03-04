package AlgorithmTrainning;
import java.util.*;
public class ³Ë·¨´ÎÊý {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] num = new int[m];
        for (int i = 0; i < m; i++) {
            num[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<m;i++){
            System.out.println(calculateTime(num[i]));
        }
    }

    public static int calculateTime(int n){
        int time=0;
        while (n!=1){
            if(n%2==0)
                time+=1;
            else
                time+=2;
            n/=2;
        }
        return time;
    }
}
