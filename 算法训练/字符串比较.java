package AlgorithmTrainning;
import java.util.*;
public class ×Ö·û´®±È½Ï {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int n=sc.nextInt();
        if(s.substring(0,n).compareTo(t.substring(0,n))>0)
            System.out.print(1);
        else if(s.substring(0,n).compareTo(t.substring(0,n))==0)
            System.out.print(0);
        else System.out.print(-1);

    }

}
