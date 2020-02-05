package AlgorithmTrainning;

import java.util.Scanner;


public class 摆动序列 {
	public static int [] v = new int [30];
	public static int [] value = new int [30];
	public static int n,ans=0;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		dfs(1);
		System.out.println(ans-n);
	}
	public static void dfs(int x){
	    if(x>n) {System.out.println();return ;}
	    if(x==1||x==2){             //初始长度为1或者2时比较特殊 
	        for(int i=1;i<=n;i++){
	            if(v[i]==0){
	                value[x]=i;
	                System.out.print(x);
	                v[i]=1;
	                ans++;
	
	                dfs(x+1);
	                value[x]=0;     //每次记得还原回来就行了 
	                v[i]=0;
	            }
	            System.out.println();
	        }
	    }
	    else {
	        if(value[x-1]>value[x-2]){  //下面分别是两种情况 
	            for(int i=1;i<value[x-2];i++){
	                if(v[i]==0){
	                    ans++;
	                    value[x]=i;
	                    v[i]=1;
	                    dfs(x+1);
	                    value[x]=0;
	                    v[i]=0;
	                }
	            }
	        }
	        else if(value[x-1]<value[x-2]){
	            for(int i=value[x-2];i<=n;i++){
	                if(v[i]==0){
	                    ans++;
	                    value[x]=i;
	                    v[i]=1;
	                    dfs(x+1);
	                    value[x]=0;
	                    v[i]=0;
	                }
	            }
	        }
	    }
	}

	

}

