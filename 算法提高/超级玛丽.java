import java.util.*;
public class 超级玛丽 {
    static int sum=0;
    static int n;
    static int[] road;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();//小道的长度n
        int m=sc.nextInt();//陷阱的个数
        road=new int[n];
        for(int i=0;i<m;i++){
            int trap=sc.nextInt();
            if(trap<n)
                road[trap-1]=-1;
        }
        dfs(0);
        System.out.println(sum);

    }

    static void dfs(int step){
        if(step>n-1)
            return;
        if(step==n-1)
            sum += 1;

        if(road[step]==-1)
            return;

        dfs(step + 1);
        dfs(step + 2);

    }
}
