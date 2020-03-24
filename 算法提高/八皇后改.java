import java.util.*;
public class 八皇后改 {
    static int maxvalue=0;
    static int[][] pic=new int[8][8];

    static boolean check(int pos[],int row){
        /*
        对于八皇后的放置，每行只可能出现一次皇后
        * pos:存放八皇后的位置
        * row:当前所在行数
        * */
        for(int i=0;i<row;i++){
            if(pos[i]==pos[row]|| Math.abs(i-row)==Math.abs(pos[i]-pos[row]))
                return false;
        }
        return true;
    }


    static void dfs(int[] pos,int row){
        /*
        * 从第一行开始遍历，遍历到最后一行了停止
        * pos[i]第i个棋子（位于第i行）所在的列数*/
        if(row==8) {
            int sum = 0;
            for (int i = 0; i < 8; i++)
                sum += pic[i][pos[i]];
            if(sum>maxvalue)
                maxvalue=sum;
            return;
        }

        for(pos[row]=0;pos[row]<8;pos[row]++){
            if(check(pos,row))
                dfs(pos,row+1);

        }

    }

    public static void main(String[] args){
        int[] pos=new int[8];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++)
                pic[i][j]=sc.nextInt();
        }
        dfs(pos,0);
        System.out.println(maxvalue);
    }
}
