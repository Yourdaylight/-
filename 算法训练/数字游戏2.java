import java.lang.reflect.Array;
import java.util.*;
public class 数字游戏2 {
    static int sum;
    static String order;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sum=sc.nextInt();
        int add=0;
        int[] number=new int[n];
        order ="999999999999";
        for(int i=0;i<n;i++)
            number[i]=i+1;
        permutation(number,0,n-1);

        for(char ch:order.toCharArray())
            System.out.print(ch+" ");

    }
    public static int addThem(String[] array)
    {
        int sum=0;
        int[][] dp=new int[array.length][array.length];
        if(array.length>1) {
            for (int i = 1; i < array.length; i++)//n个数要进行n-1步运算
                for (int j = 0; j < array.length - i; j++)//对于n个数需要进行n-1次加法操作
                    dp[i][j] = Math.max(Integer.valueOf(array[j]) + Integer.valueOf(array[j + 1]), dp[i - 1][j] + dp[i - 1][j + 1]);
            return dp[array.length - 1][0];
        }
        else
            return Integer.valueOf(array[0]);
    }
    public static void permutation(int[] array,int start,int end) {
        if(start==end) {
            String str=Arrays.toString(array);
            str=Arrays.toString(array).replace("[","").replace("]","").replace(" ","");
            String[] ss=str.split(",");
            int result=addThem(ss);
            if(result==sum){
                String sss="";
                for(String s:ss)
                    sss+=s;
                if(order.length()==sss.length())
                {
                    for(int i=0;i<order.length();i++) {
                        if (order.toCharArray()[i] < sss.toCharArray()[i])
                            return;
                    }
                }
                if(order.compareTo(sss)>0)//比较两个字符串大小，order更大，则将sss的值赋给order
                    order=sss;
            }
        } else {
            for (int i = start; i <= end; i++) {
                swap(array,start,i);
                permutation(array,start+1,end);
                swap(array,start,i);
            }
        }
    }
    public static void swap(int[] array ,int i,int j)
    {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
