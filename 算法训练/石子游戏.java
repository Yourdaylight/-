package AlgorithmTrainning;
import java.util.*;
public class й╞вссно╥ {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long result=0;
        long[] stone=new long[n];
        for(int i=0;i<n;i++){
            stone[i]=sc.nextInt();
        }
        Arrays.sort(stone);

        for(int i=stone.length-1;i>0;i--)
        {
            result+=(stone[i]+1)*(stone[i-1]+1);
            stone[i-1]=stone[i]+stone[i-1];
        }
        System.out.print(result);
    }
}
