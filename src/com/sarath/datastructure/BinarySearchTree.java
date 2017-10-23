package com.sarath.datastructure;

/**
 * Created by spilathottathil on 10/21/17.
 */
public class BinarySearchTree {

    private TreeNode rootNode;

    public TreeNode findData(Integer data){
        if(rootNode != null){
            rootNode.findData(data);
        }

        return null;
    }

    public void insertData(Integer data){
        if(rootNode == null){
            rootNode = new TreeNode(data);
        }else
            rootNode.insertData(data);
    }

}
