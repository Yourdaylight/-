import java.util.*;
public class ������ {
    static int[][] board;
    static int[][] visited;
    static int result=0;
    //���÷���Ӽ�
    static int dx[]={1,0,-1,0};
    static int dy[]={0,1,0,-1};

    static int m,n;
    static int sum=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();//���ӵĿ��(��)
        n=sc.nextInt();//���ӵĸ߶ȣ��У�
        board=new int[n][m];
        visited=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                board[i][j] = sc.nextInt();
                sum+=board[i][j];
            }
        }

        //������������֮����ҪΪż�����ܽ��м���
        if(sum%2==0) {
            dfs(0, 0, 0, 0);
            System.out.println(result);
        }
        else
            System.out.println(0);
    }

    static void dfs(int x,int y,int num,int cnt){
        /*
        * x,y���ӵ�����
        * num��ǰ�����������и���֮��
        * cnt�����ĸ��ӵ�����
        * */

        if(num==sum/2)
        {
            result=cnt;
            return;
        }

        if(check(x,y,num)){
            visited[x][y]=1;
            for(int i=0;i<4;i++){
                int vx=x+dx[i];
                int vy=y+dy[i];
                dfs(vx,vy,num+board[x][y],cnt+1);
            }
            visited[x][y]=0;
        }
    }

    static boolean check(int x,int y,int num){
        /*
        * ��鵱ǰ���� �ܷ����
        * */
        //�ж������Ƿ�Խ��
        if(x<0 || x>=n ||y<0 ||y>=m)
            return false;
        if(visited[x][y]==1 ||num+board[x][y]>sum/2)
            return false;
        return true;
    }
}
