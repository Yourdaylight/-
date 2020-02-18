import java.util.*;
public class Main {
    static  double a,b,c,d;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=sc.nextDouble();
        for(double i=-100;i<=100;i++)
        {
            double x1=i-0.1;
            double x2=i+0.1;
            if(f(x1)*f(x2)<0)
                System.out.printf("%.2f ",i);
        }
    }
    public static  double f(double x){
        return x*x*x*a+x*x*b+x*c+d;}

}
