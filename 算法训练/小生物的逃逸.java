package AlgorithmTrainning;
import java.util.*;
public class С��������� {
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
        int n=sc.nextInt();//�������
        int m=sc.nextInt();//С���������
        ArrayList<Ball> list=new ArrayList<>();//������
        int[] res=new int[m];//ÿ��С�������ݾ�����������
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
