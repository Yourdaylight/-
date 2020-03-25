import java.util.*;
public class ×î³¤×Ö·ûÐòÁÐ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str1 = (","+sc.next()).toCharArray();
        char[] str2 = ("."+sc.next()).toCharArray();
        int[][]dp=new int[str1.length][str2.length];

        for(int i=1;i<str1.length;i++){
            for(int j=1;j<str2.length;j++){
                if(str1[i]==str2[j])
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        System.out.println(dp[str1.length-1][str2.length-1]);
    }
}
