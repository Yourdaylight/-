package AlgorithmTrainning;
import java.util.*;
public class ÏàÁÚ×ÖÄ¸ {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().toCharArray()[0];
        char before,next;
        if((int)ch==97 || (int)ch==65){
            before= (char)(ch+25);
            next=(char)(ch+1);
        }
        else if((int)ch==90 ||(int)ch==122){
            before=(char)(ch-1);
            next=(char)(ch-25);
        }

        else{
            before=(char)(ch-1);
            next=(char)(ch+1);
        }
        System.out.print(before+""+ch+""+next);
    }
}
