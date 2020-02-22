import java.util.*;
public class 先序排列 {
//	static String forward,backwar
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String mid=sc.next();
		String backward=sc.next();
		tree(mid,backward);
	}
	
	//后序的最后一个节点为每个字数的根结点
	//通过上述找到的根结点，划分左右子树
	public static void tree(String m,String b)
	{
		char root=b.charAt(b.length()-1);//后序的最后一个为树的根
		int IndexInMid=m.indexOf(root);//根在中序的索引值
		System.out.print(root);
		//在中序遍历中，以根为界，划分左右子树（递归）
		
		//左子树
		if(IndexInMid>0) {
			String Mnext=m.substring(0,IndexInMid);
			String Bnext=b.substring(0,m.indexOf(root));
			tree(Mnext,Bnext);
		}
		//右子树
		if(IndexInMid<m.length()-1)
			tree(m.substring(IndexInMid+1),b.substring(IndexInMid,b.length()-1));
	}
}
