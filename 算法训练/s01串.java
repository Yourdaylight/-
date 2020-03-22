import java.util.*;
public class s01´® {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str="0";
        for(int i=0;i<n;i++) {
            String newStr="";
            for (char c : str.toCharArray()) {
                if (c=='0')
                    newStr+="1";
                if(c=='1')
                    newStr+="01";
            }
            str=newStr;
        }
        System.out.println(str);
    }

}
