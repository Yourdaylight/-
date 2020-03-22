import java.util.*;
public class 回文数字 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        for(int i=10000;i<999999;i++)
        {
            if(fun(i)==true){
                if(n==getnum(i)) {
                    System.out.println(i);
                    flag = 1;
                }

            }
        }
        if(flag==0)
            System.out.println(-1);
    }
    static boolean fun(int num){

        String str=String.valueOf(num);
        StringBuilder sb=new StringBuilder(str);

        if(sb.toString().equals(sb.reverse().toString()))
            return true;
        else
            return false;
    }
    static int getnum(int num){
        int sum=0;
       char[] each=String.valueOf(num).toCharArray();
       for(char c:each)
           sum+=(c-'0');
       return sum;
    }
}
