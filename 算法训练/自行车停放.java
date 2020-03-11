package AlgorithmTrainning;
import java.util.*;
public class ���г�ͣ�� {
    public static class Node{
        public int no;
        public Node left;
        public Node right;
        public Node(){};
        public Node(Node left,int no,Node right){
            this.left=left;
            this.right=right;
            this.no=no;
        }
        public Node(int no){
            this.no=no;
            this.left=new Node();
            this.right=new Node();
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Node> list=new ArrayList<Node>();
        HashMap<Integer,Node> map=new HashMap<Integer,Node>();
        int n=sc.nextInt();//Ҫͣ�ŵ����г�����
        int m=sc.nextInt();//��һ�����ı��
        Node first=new Node(m);

        map.put(m,first);
        for (int i=0;i<n-1;i++)
        {
            int x=sc.nextInt();//�����복������г����
            int y=sc.nextInt();//ͣ�ŵ����г�(������)
            int z=sc.nextInt();//0Ϊ��1Ϊ��
            Node bikeY=map.get(y);//��ȡ������ڵ�
            if(z==0){
                Node add=new Node(bikeY.left,x,bikeY);
                bikeY.left.right=add;
                bikeY.left=add;
                if(add.left.no==0)
                    first=add;
                map.put(x,add);

            }
            else{
                Node add=new Node(bikeY,x,bikeY.right);
                bikeY.right.left=add;
                bikeY.right=add;
                if(add.left.no==0)
                    first=add;
                map.put(x,add);
            }

        }

        Node out=first;
        while (true) {
            System.out.print(out.no+" ");
            if(out.right.no!=0)
                out=out.right;
            else
                break;
        }

    }
}
