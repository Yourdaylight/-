package AlgorithmTrainning;
import java.util.*;
public class 集合运算 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList A=new ArrayList();
		ArrayList B=new ArrayList();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			A.add(sc.nextInt());
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
			B.add(sc.nextInt());
		
		//求交集
		ArrayList And=new ArrayList();
		ArrayList temp=new ArrayList();
		temp.addAll(A);
		temp.retainAll(B);
		And.addAll(temp);
		And.sort(null);

		for(Object and:And)
			System.out.print(and+" ");
		if(And.size()!=0)
			System.out.println();
		
		//求并集
		ArrayList Or=new ArrayList();
		temp.clear();
		temp.addAll(A);
		for(int i=0;i<B.size();i++)
		{
			if(temp.contains(B.get(i)))
				continue;
			else
				temp.add(B.get(i));
		}
		
		Or.addAll(temp);
		Or.sort(null);
		for(Object or:Or)
			System.out.print(or+" ");
		System.out.println();
		
		//求余集(A-(A∩B))
		ArrayList Yu=new ArrayList();
		A.removeAll(And);
		A.sort(null);
		for(Object yu:A)
			System.out.print(yu+" ");
		System.out.println();

	}
}
