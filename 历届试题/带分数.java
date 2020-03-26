import java.util.*;
public class ������ {
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
            //�жϵ�һ�����Ƿ����N
            int m1=sum(a,0,i);
            if(m1>=N)
                return;

            //��ʼ�ж������������ڶ�����һ��С��1-9�У���ȥm1ʹ�õ�����֮�͵�����һ�룩
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
