package com.sarath.datastructure;

/**
 * Created by spilathottathil on 10/21/17.
 */
public class TreeNode {

    private Integer data;
    private TreeNode leftNode;
    private TreeNode rightNode;
    private boolean isDeleted;

    public TreeNode(Integer data){
        this.data = data;
        this.isDeleted = false;
    }


    public boolean isDeleted(){
        return isDeleted;
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    /**
     *
     * @param data
     * @return
     */
    public TreeNode  findData(Integer data){
        if(this.data.compareTo(data)== 0 && !isDeleted){
            return this;
        }
        if(this.data.compareTo(data) < 0  && leftNode != null )
          return leftNode.findData(data);
        if ( rightNode != null)
           return rightNode.findData(data);
        return null;
    }



    public void deleteNode(){
       this.isDeleted = true;
    }

    public Integer getMinNode(){

        if(this.leftNode == null){
            return this.data;
        }else
          return this.leftNode.getMinNode();

    }

    public Integer getMax(TreeNode node){
        if(node==null) return null;
        if(this.rightNode == null){
            return this.data;
        }else
            return this.rightNode.getMax(this.rightNode);
    }

    int getNoLeafNodes(TreeNode node){

        int count =0;

        if(node == null){
            return count;
        }

        if(this.leftNode == null && this.rightNode == null){
            count++;
        }

        getNoLeafNodes(this.leftNode);
        getNoLeafNodes(this.rightNode);

        return count;

    }

    //In order Traversal
    public void inOrder(TreeNode node){
        if(node != null) {
            inOrder(node.leftNode);
            System.out.println(node.data);
            inOrder(node.rightNode);
        }
    }

    public void preOrder(TreeNode node){
        if(node != null){
            System.out.println(node.data);
            preOrder(node.leftNode);
            preOrder(node.rightNode);
        }

    }

    public void postOrder(TreeNode node){
        if(node != null){
            postOrder(node.leftNode);
            postOrder(node.rightNode);
            System.out.println(node.data);
        }
    }

    //check if a binary tree is a binary search tree. this is simple but wrong.
    public boolean checkBinarySearchTree( TreeNode node,Integer last) {

        if (node != null) {

            System.out.println("node data "+node.data);
            System.out.println("prev node data " + last);

            //In order traversal
            if (!checkBinarySearchTree(node.leftNode, last)) return false;

            //check the current.

            if (last != null && node.data <= last) {
                return false;
            }
            last = node.data;

            if (!checkBinarySearchTree(node.rightNode, last)) return true;
        }
            return true;
    }

    //efffiecient way

    public static boolean checkBST(TreeNode node, int min, int max){

        if(node == null) return true;

        if(node.data < min || node.data > max) return false;

        return (checkBST(node.leftNode,Integer.MIN_VALUE , node.data -1)&&
        checkBST(node.rightNode, node.data +1,max)) ;

    }


    public static void insertNode(TreeNode node,Integer keyData){

        if(node == null) node.leftNode = new TreeNode(keyData);
        //need to check whetehr insert right or left
        if(node.data.compareTo(keyData)>=0){
            if(node.leftNode == null){
                //insert here
                node.leftNode = new TreeNode(keyData);
            }else
            insertNode(node.leftNode,keyData);
        }else
            if(node.rightNode == null) {
                node.rightNode = new TreeNode(keyData);
            }else insertNode(node.rightNode,keyData);
    }
}
