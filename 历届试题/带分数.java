import java.util.*;
public class 带分数 {
    static int N;
    static int[] num={1,2,3,4,5,6,7,8,9};
    static int[] visited=new int[9];
    static int[] perm=new int[9];
    static int result=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        dfs(0);
        System.out.println(result);
    }
    public static int sum(int[] a,int start,int end){
        int sum=0;

        for(int i=start;i<end;i++)
            sum=sum*10+a[i];
        return sum;
    }

    public static void check(int a[]){
        for(int i=1;i<9;i++){
            //判断第一个数是否大于N
            int m1=sum(a,0,i);
            if(m1>=N)
                return;

            //开始判断两个分数（第二个数一定小于1-9中，剪去m1使用的数字之和的数的一半）
            for(int j=i;j<9;j++){
                int m2=sum(a,i,j);
                int m3=sum(a,j,9);

                if(m2>m3&& m2%m3==0 &&N==m2/m3+m1) {
                    result += 1;
                    System.out.println(N+"="+m1+"+"+m2+"/"+m3);
                }
            }
        }
    }

    public static void dfs(int start){
        if(start==9) {
//            System.out.println(Arrays.toString(perm));
            check(perm);
            return;
        }

        for(int i=0;i<num.length;i++){
            if(visited[i]==1)
                continue;
            perm[start]=num[i];
            visited[i]=1;
            dfs(start+1);
            visited[i]=0;
        }
        return;
    }

}
