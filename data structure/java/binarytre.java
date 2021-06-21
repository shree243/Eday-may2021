/* 
public class BinaryTreeDemo {

    static  Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            Node left, right = null;
        }
     }

     // Traversing in Depth First : InOrder.
     void inOrder(Node root){
         if(root != null){
             inOrder(root.left);
             System.out.print(root.data + " ");
             inOrder(root.right);
         }
     }
     //Traversing in Depth First : PostOrder.
     void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    //Traversing in Depth first : PreOrder.
    void pretOrder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            pretOrder(root.left);
            pretOrder(root.right);
        }
    }

     public static void main(String[] args) {
        BinaryTreeDemo obj = new BinaryTreeDemo();
        obj.root = new Node(10);
        obj.root.left = new Node(20);
        obj.root.right = new Node(30);
        obj.root.left.left = new Node(40);
        obj.root.left.right = new Node(50);
        obj.root.right.right = new Node(60);
        System.out.println("InOrder :");
        obj.inOrder(root);
        System.out.println("\nPreOrder :");
        obj.pretOrder(root);
        System.out.println("\nPostOrder :");
        obj.postOrder(root);

     }
}
*/

public class binarytre{

        static Node root;
        static class Node{

            int data;
            Node left;
            Node right;
            Node(int data)
            {
                this.data= data;
                left=null;
                right=null;
            } 
        }
        
        void preorder(Node root)
        {
            if (root!=null)
            {
                System.out.println(root.data+ " ");
                preorder(root.left);
                preorder(root.left);
            
            }
        }
        void inorder(Node root)
        {
            if (root!=null)
            {
                System.out.println(root.data+ " ");
                inorder(root.left);
                inorder.right(root);
            
            }
        }

        void postorder(Node root)
        {
            if (root!=null)
            {
                System.out.println(root.data+ " ");
                postorder.left(root);
                postorder.right(root);
            }
        }
    public static void main(String[] args) {
        
        binarytre obj= new binarytre();
        obj.root= new Node(10);
        obj.root.left= new Node(20);
        obj.root.right= new Node(30);
        obj.preorder(root);
    }
}



