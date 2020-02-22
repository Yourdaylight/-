import java.util.HashSet;
import java.util.Scanner;

public class 统计单词个数 {
  static int p,k,s;
  static String str="";//输入的字符
  static int dp[][];//dp[i][j]:前i个字符，分成j个部分,最多匹配多少个单词
  static int include_word[];//从字符串的第i个位置开始，包含字典单词的结束的索引位置。
  static HashSet dict;//字典
  public static int get_num(int start,int end)
  {
      int count=0;
      for(int i=start;i<=end;i++)
      {
          if(include_word[i]<=end)
              count++;
      }
      return count;
  }
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      p=sc.nextInt();//字串的行数
      k=sc.nextInt();//被分成的部分

      dp=new int[201][50];
      include_word=new int[210];
      dict=new HashSet();
      for(int i=0;i<p;i++)
          str+=sc.next();
      s=sc.nextInt();//字典中单词的个数
      for(int i=0;i<s;i++)
          dict.add(sc.next());

      int length=str.length()-1;
      System.out.println(length);
      for(int i=0;i<=length;i++)
      {
          String temp="";
          include_word[i]=999999;
          for(int j=i;j<=length;j++)
          {
            temp+=str.charAt(j);
            if(dict.contains(temp)) {
                include_word[i] = j;
                break;
            }
          }
      }
      System.out.println(dict);
      for (int i = 1;i <= length;i++)
          for (int j = 0;j <= i-1;j++) {//枚举前一个状态的j
              int cost = get_num(j+1,i);//获取j+1..i这一段有多少个单词
              for (int l = 0;l <= Math.min(j, k);l++) {//枚举1..i这个字符串被分成了多少段
                  dp[i][l+1] = Math.max(dp[i][l+1],dp[j][l]+cost);//尝试更新状态
              }
          }
      System.out.println(dp[length][k]);

  }
}
