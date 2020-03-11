package AlgorithmTrainning;
import java.util.*;
public class Êı×éÄæĞòÅÅĞò {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[20];
        int i=0;
        while (true){
            int input=sc.nextInt();
            if(input!=0){
                num[i]=input;
                i+=1;
            }
            else
                break;
        }

        for(int start=0,end=i-1;start<i/2;start++,end--)
            swap(num,start,end);

        for(int j=0;j<i;j++)
            System.out.print(num[j]+" ");
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
