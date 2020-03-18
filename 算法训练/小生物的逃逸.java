package AlgorithmTrainning;
import java.util.*;
public class 小生物的逃逸 {
    public static class Ball{
        int x,y,z,r;
        public Ball(int x,int y,int z,int r){
            this.x=x;
            this.y=y;
            this.z=z;
            this.r=r;
        }

        public double distance(int x ,int y,int z){
            double distance=Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2)+Math.pow((this.z-z),2));
            return distance;
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//球的数量
        int m=sc.nextInt();//小生物的数量
        ArrayList<Ball> list=new ArrayList<>();//所有球
        int[] res=new int[m];//每个小生物逃逸经过的球面数
        for(int i=0;i<n;i++)
        {
            int xi=sc.nextInt();
            int yi=sc.nextInt();
            int zi=sc.nextInt();
            int ri=sc.nextInt();
            Ball ball=new Ball(xi,yi,zi,ri);
            list.add(ball);
        }

        for(int i=0;i<m;i++)
        {
            int xi=sc.nextInt();
            int yi=sc.nextInt();
            int zi=sc.nextInt();
            for(Ball b:list){
                if(b.distance(xi,yi,zi)<b.r)
                    res[i]+=1;
            }
        }

        for(int i:res)
            System.out.print(i+" ");
    }
}
