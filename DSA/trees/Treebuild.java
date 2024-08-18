import java.util.*;
public class Treebuild {
   
    
		static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node root = createTree();
		
	}
		//Node root = createTree();
    
    static Node createTree(){
        Node root=null;
        System.out.println("enter data");
        int data=sc.nextInt();
        if(data==-1) return null;
        root=new Node(data);
        System.out.println("Enter left for"+data);
        root.left=createTree();
        System.out.println("Enter right for"+data);
        root.right=createTree();
        return root;
    }
}
class Node{
    int data;
    Node left=right=null;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}