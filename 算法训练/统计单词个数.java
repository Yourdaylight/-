import java.util.HashSet;
import java.util.Scanner;

public class ͳ�Ƶ��ʸ��� {
  static int p,k,s;
  static String str="";//������ַ�
  static int dp[][];//dp[i][j]:ǰi���ַ����ֳ�j������,���ƥ����ٸ�����
  static int include_word[];//���ַ����ĵ�i��λ�ÿ�ʼ�������ֵ䵥�ʵĽ���������λ�á�
  static HashSet dict;//�ֵ�
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
      p=sc.nextInt();//�ִ�������
      k=sc.nextInt();//���ֳɵĲ���

      dp=new int[201][50];
      include_word=new int[210];
      dict=new HashSet();
      for(int i=0;i<p;i++)
          str+=sc.next();
      s=sc.nextInt();//�ֵ��е��ʵĸ���
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
          for (int j = 0;j <= i-1;j++) {//ö��ǰһ��״̬��j
              int cost = get_num(j+1,i);//��ȡj+1..i��һ���ж��ٸ�����
              for (int l = 0;l <= Math.min(j, k);l++) {//ö��1..i����ַ������ֳ��˶��ٶ�
                  dp[i][l+1] = Math.max(dp[i][l+1],dp[j][l]+cost);//���Ը���״̬
              }
          }
      System.out.println(dp[length][k]);

  }
}
