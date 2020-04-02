import com.sun.javafx.geom.Edge;

import java.util.ArrayList;
import java.util.Scanner;

public class 大臣的旅费 {
    public static int n;
    public static ArrayList<Edge>[] map;//存放所有的节点，每个节点中存放有相关联的边
    public static int max=0;//行走的最大距离
    public static int terminal=0;//终点
    public static int[] visited;

    public static class Edge{
        int v1;
        int v2;
        int weight;

        public Edge(int v1, int v2, int weight) {
            this.v1 = v1;
            this.v2 = v2;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Edge{" +
                     v1 +
                    "->" + v2 +
                    "=" + weight +
                    '}';
        }
    }

    public static void dfs(int start,int distance){
        visited[start]=1;
        //遍历每个节点的每条边
        for(int i=0;i<map[start].size();i++){
            Edge temp=map[start].get(i);

            if(visited[temp.v2]==0){
                distance+=temp.weight;
                if(distance>max) {
                    max = distance;
                    terminal=temp.v2;
                }
                dfs(temp.v2,distance);
//                visited[start]=0;
                distance-=temp.weight;
            }
        }
    }

    public static void getResult(){
        dfs(1,0);
        visited=new int[n+1];
        int start=terminal;
        dfs(start,0);
        int money=max*10+(1+max)*max/2;
        System.err.println("行走的最大距离:"+max);
        System.out.println(money);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        visited=new int[n+1];
        map=new ArrayList [n+1];
        for(int i=1;i<=n;i++)
            map[i]=new ArrayList<Edge>();

        for(int i=1;i<n;i++){
            int pi=sc.nextInt();
            int qi=sc.nextInt();
            int di=sc.nextInt();
            Edge edge1=new Edge(pi,qi,di);
            Edge edge2=new Edge(qi,pi,di);
            map[pi].add(edge1);
            map[qi].add(edge2);
        }

        for(int i=1;i<=n;i++)
            System.out.println(map[i].toString());
        getResult();

    }
}
