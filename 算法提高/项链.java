import java.util.*;
public class 项链 {
    static String necklace;
    static int M=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        necklace=sc.next();
        find(0);
        System.out.println(M);
    }


    public static void find(int start){
        if(start==necklace.length()-1)
            return;
        //将项链“解开”
        String now=necklace.substring(start)+necklace.substring(0,start);
        //第一段
        char[] first=now.toCharArray();
        int firstSize=getLength(first);
        //第二段
        String second=now.substring(firstSize);
        StringBuilder sb=new StringBuilder(second).reverse();
        int secondSize=getLength(sb.toString().toCharArray());
        //珠子数
        int maxsize=firstSize+secondSize;
        if(maxsize>M)
            M=maxsize;
        find(start+1);

    }

    public static int getLength(char[] seq) {
        int size=0;
        if(seq.length<=0)
            return 0;
        char firstChar=seq[0];
        for (int i = 0; i < seq.length; i++) {
            if(firstChar!='w') {
                if (seq[i] == firstChar || seq[i] == 'w')
                    size += 1;
                else
                    break;
            }
            else {
                size+=1;
                try{
                    firstChar=seq[i+1];
                }catch (Exception e){
                    return size;
                }

            }
        }
        return size;
    }

}
