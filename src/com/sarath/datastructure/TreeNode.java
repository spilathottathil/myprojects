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

    public void insertData(Integer data){
        if(this.data.compareTo(data) >= 0 ){
            if(this.rightNode == null){
                this.rightNode = new TreeNode(data);
            }else {
                rightNode.insertData(data);
            }
        }else {
            if(this.leftNode == null){
                this.leftNode = new TreeNode(data);
            }else {
                leftNode.insertData(data);
            }

        }
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
}
