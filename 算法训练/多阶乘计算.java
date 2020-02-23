import java.util.Scanner;

public class ¶à½×³Ë¼ÆËã {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int m=sc.nextInt();
        long sum=0;
        for(int i=1;i<=k;i++)
            sum+=nk(n,i);
        if(m==1)
            System.out.print(sum);
        else
        {
            int total=0;
            char[] number=String.valueOf(sum).toCharArray();
            for(char ch:number)
                total+=(ch-'0');
            System.out.print(total);
        }
    }
    public static long nk(int n,int k)
    {
        long sum=1;
        int c=0;
        while(true)
        {
            if((n-c*k)<=1)
                break;
            else
                sum*=(n-c*k);
            c+=1;
        }
        return sum;
    }
}
