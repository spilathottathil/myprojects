package com.sarath.datastructure;

import java.util.Hashtable;

/**
 * Created by spilathottathil on 10/21/17.
 */
public class BinarySearchTree {

    private TreeNode rootNode;
    private Hashtable hashtable;
    private static Integer precedessor, successor;
    private static int lheight=1, rheight=1;

    public TreeNode findData(Integer data){
        if(rootNode != null){
            rootNode.findData(data);
        }

        return null;
    }



    public void deleteNode(Integer data){
        TreeNode nodeToBeDeleted = findData(data);
        nodeToBeDeleted.deleteNode();
    }

    public Integer getSmallest(){

       if(rootNode != null){
           return rootNode.getMinNode();
       }
        return null;
    }

    //check pre cedessor and successor
    static void findPreSuccessor(TreeNode node, Integer keyData){
        if(node.getData().compareTo(keyData) == 0 ){
            //then it is right most element of left subtree
            if(node.getLeftNode() != null){
                TreeNode rightMost = node.getLeftNode();
                while(rightMost.getRightNode() != null){
                    rightMost = rightMost.getRightNode();
                }
                precedessor = rightMost.getData();

            }
            //successsor will be the left most node in right sub tree
            if(node.getRightNode() != null){
                TreeNode leftMost = node.getRightNode();
                while(leftMost.getLeftNode() != null){
                    leftMost = leftMost.getLeftNode();
                }

                successor = leftMost.getData();

            }
        }else if(node.getData().compareTo(keyData) > 0){
            //if key value is less, then make root as successor
            successor = node.getData();
            findPreSuccessor(node.getLeftNode(),keyData);
        }else {
            //if key value is greater then root is predessor
            precedessor = node.getData();
            //now search right sub tree
            findPreSuccessor(node.getRightNode(),keyData);
        }


    }

    public int countLeafNodes(){
        if(rootNode != null){
           rootNode.getNoLeafNodes(rootNode);
        }
        return -1;
    }

    //find height and print the data of binary tree
    public void printBinaryTree(){


    }

    private static  int getHeight(TreeNode node){
      if(node == null){
            return -1;
        }

        //get left height
       lheight = getHeight(node.getLeftNode());rheight = getHeight(node.getRightNode());

        if(lheight > rheight){
            return lheight+1;
        }else return rheight+1;


    }

       public static void main(String[] args) {
        BinarySearchTree binaryTree = new BinarySearchTree();
        //create the tree
        TreeNode root = createBinaryTree();
       // root.insertNode(root,50);
           System.out.println("printing in order *****");
        root.inOrder(root);
           System.out.println("*******");
            //int h = getHeight(root);
          System.out.println(getHeight(root));
        findPreSuccessor(root, 30);
           System.out.println("presssedor of  is "+ precedessor);
           System.out.println("successor of is "+ successor);
        //System.out.println(root.checkBinarySearchTree(root,null));
        //System.out.println(root.getMax(root));

    }

    private static  TreeNode createBinaryTree(){

        TreeNode root = new TreeNode(20);
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(30);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(15);
         TreeNode node5 = new TreeNode(35);
              TreeNode node6 = new TreeNode(40);

        root.setLeftNode(node1);
        root.setRightNode(node2);

        node1.setLeftNode(node3);
        node1.setRightNode(node4);
        node2.setLeftNode(node5);
        node2.setRightNode(node6);
        return root;

    }

}
