import java.util.*;
public class �������� {
    static int sum=0;
    static int n;
    static int[] road;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();//С���ĳ���n
        int m=sc.nextInt();//����ĸ���
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
