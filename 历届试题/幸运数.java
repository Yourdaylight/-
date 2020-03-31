import java.util.ArrayList;
import java.util.Scanner;

public class авдЫЪ§ {

    static int num=1;
    static ArrayList<Integer> result;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        result=new ArrayList<>();
        for(int i=1;i<=n;i++)
            result.add(i);

        int luck=result.get(1);
        fun(result,luck);
        int sum=0;
        for(Integer i1:result)
            if(i1>m && i1<n)
                sum++;
        System.out.println(sum);
    }

    public static void fun(ArrayList<Integer> list,int lucky){
        int flag=1;

        ArrayList<Integer> delete=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if((i+1)%lucky==0) {
                delete.add(list.get(i));
                flag=0;
            }
        }

        if (flag==0) {
            if(lucky!=2)
                num+=1;
            list.removeAll(delete);
            result=list;
            fun(result, result.get(num));
        }
        else
            return;
    }
}
