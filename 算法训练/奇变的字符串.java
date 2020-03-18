package AlgorithmTrainning;
import java.util.*;
public class Ææ±äµÄ×Ö·û´® {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] str=sc.next().toCharArray();

        StringBuilder sb=new StringBuilder();
        for(int i=1;i<str.length;i+=2)
            sb.append(str[i]);
        sb.reverse();

        for(int i=1;i<str.length;i+=2)
            str[i]=sb.charAt((i-1)/2);
        System.out.println(str);
    }
}
