package com.sarath.datastructure;

import java.util.Hashtable;

/**
 * Created by spilathottathil on 10/21/17.
 */
public class BinarySearchTree {

    private TreeNode rootNode;
    private Hashtable hashtable;

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

    public int countLeafNodes(){
        if(rootNode != null){
           rootNode.getNoLeafNodes(rootNode);
        }
        return -1;
    }


}
