
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
        this.value=value;
        left=right=null;
    }
}
public class TreeTraversal{
    public void preorder(TreeNode node){
        if(node==null)
        return;
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(TreeNode node){
        if(node==null)
        return;
        inorder(node.left);
        System.out.print(node.value+" ");
        inorder(node.right);
    }
    public void postorder(TreeNode node){
        if(node==null)
        return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(8);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.right.right.left=new TreeNode(9);
        root.right.right.right=new TreeNode(10);
        TreeTraversal tree=new TreeTraversal();
        System.out.println("Question 1");
        System.out.print("Preorder traversal: ");
        tree.preorder(root);
        System.out.println();
        System.out.print("Inorder traversal: ");
        tree.inorder(root);
        System.out.println();
        System.out.print("Postorder traversal: ");
        tree.postorder(root);
        System.out.println("\nQuestion 2");
        TreeNode root2=new TreeNode(4);
        root2.left=new TreeNode(2);
        root2.right=new TreeNode(5);
        root2.left.left=new TreeNode(3);
        root2.left.left.right=new TreeNode(9);
        root2.left.left.right.left=new TreeNode(1);
        root2.right.left=new TreeNode(7);
        root2.right.right=new TreeNode(6);
        root2.right.right.left=new TreeNode(8);
        System.out.print("Preorder traversal: ");
        tree.preorder(root2);
        System.out.println();
        System.out.print("Inorder traversal: ");
        tree.inorder(root2);
        System.out.println();
        System.out.print("Postorder traversal: ");
        tree.postorder(root2);
        System.out.println();
    }
}
