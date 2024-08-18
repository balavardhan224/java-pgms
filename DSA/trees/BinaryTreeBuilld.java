package DSA.trees;

import java.util.*;

private class BinaryTreeBuilld{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        
        System.out.print(root.data+" ");
        
        preorder(root.left);
        preorder(root.right);
    }
//inorder-> L,ROOT,R
public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
   
    System.out.print(root.data+" ");
    inorder(root.right);
}
//postorder=> L,R,ROOT
public static void postorder(Node root){
    if (root==null){
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
}
//level order traversal print in one line recursive 
public static void lot(Node root){
    Queue <Node> q= new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        Node curr=q.poll();
        System.out.print(curr.data+" ");
        if(curr.left!=null){
            q.add(curr.left);
        }
        if(curr.right!=null){
            q.add(curr.right);
        }
    }
}
//level order traversal print in different lines recursive 
public static void lot1(Node root){
    Queue <Node> q1=new LinkedList<>();
    q1.add(root);
    q1.add(null);
    while(!q1.isEmpty()){
        Node curr1=q1.poll();
        if(curr1==null){
            if(q1.isEmpty()){
                return;
            }
            else{
                q1.add(null);
                System.out.println();
                continue;
            }
        }
        else{
            System.out.print(curr1.data+" ");
            if(curr1.left!=null){
                q1.add(curr1.left);
            }
            if(curr1.right!=null){
                q1.add(curr1.right);
            }
        }
    }
}
//count of nodes
public static int countNodes(Node root){
    if(root==null){
        return 0;
    }
    int leftNode=countNodes(root.left);
    int righNode=countNodes(root.right);

    return leftNode+righNode+1;
}
//sumofnodes
public static int sumNodes(Node root){
    if(root==null){
        return 0;
    }
    int leftNode=sumNodes(root.left);
    int righNode=sumNodes(root.right);

    return leftNode+righNode+root.data;

}
//height
public static int height(Node root){
    if(root==null){
        return 0;
    }
    int leftNode=height(root.left);
    int righNode=height(root.right);

    return Math.max(leftNode, righNode) +1;


}
    public static void main(String args[]) {
       int nodes[] = {5,1,2,-1,-1,4,3,-1,-1,6,-1,-1,7,-1,-1};
       BinaryTree tree = new BinaryTree();
      
       Node root = tree.buildTree(nodes);
       System.out.println("Pre order");
       preorder(root);
       System.out.println();
       System.out.println("In Order");
       inorder(root);
       System.out.println();
       System.out.println("Post Order");
       postorder(root);
       System.out.println();
       System.out.println("level Order traversal");
       lot(root);
       System.out.println();
       System.out.println("level Order traversal with lines");
       lot1(root);
       System.out.println();
       System.out.print("Count of Nodes: ");
       System.out.print(countNodes(root));
       System.out.println();
       System.out.print("sum of Nodes: ");
       System.out.print(sumNodes(root));
       System.out.println();
       System.out.print("height of Nodes: ");
       System.out.print(height(root));
       //System.out.println(root.data);
   }
}