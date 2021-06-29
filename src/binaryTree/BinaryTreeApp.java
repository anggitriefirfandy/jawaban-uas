/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryTree;

/**
 *
 * @author anggit rief irfandy
 */
public class BinaryTreeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree tree = new BinaryTree();
        
        TreeNode node;
        
        node = new TreeNode(30);
        tree.insert(node);
        
        node = new TreeNode (40);
        tree.insert(node);
        
        node = new TreeNode (50);
        tree.insert(node);
        
        node = new TreeNode (60);
        tree.insert(node);
        
        node = new TreeNode (80);
        tree.insert(node);
        System.out.print("Traversal dengan InOrder : ");
        tree.inOrder();
        System.out.print("\nTraversal dengan PreOrder: ");
        tree.preOrder();
        System.out.print("\nTraversal dengan PostOrder: ");
        tree.postOrder();
        System.out.println();
        
        
        
        
    }
}

