package org.example.trees;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class OperationOnTree{

    public TreeNode insert(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }
        if(root.val < val){
            root.right = insert(root.right,val);
        }
        else{
            root.left = insert(root.left,val);
        }
        return root;
    }

    public void display(TreeNode root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
}

public class BinarySearchTree {

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 4, 6, 8};

        OperationOnTree tree = new OperationOnTree();
        TreeNode root = null;
        for (int val: arr){
            root = tree.insert(root,val);
        }

        tree.display(root);
    }
}
