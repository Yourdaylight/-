import java.util.*;
public class 未名湖边的烦恼 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();//还鞋的
        int n=sc.nextInt();//租鞋的
        System.out.println(fun(m,n));
    }

    static int fun(int m,int n){
        if(m<n)
            return 0;
        else if(n==0)
            return 1;
        return fun(m,n-1)+fun(m-1,n);
    }
}
