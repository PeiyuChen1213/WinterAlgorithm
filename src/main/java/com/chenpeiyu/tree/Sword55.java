package com.chenpeiyu.tree;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description 计算树的深度的题
 * @date 1/17/2023 7:52 PM
 */
public class Sword55 {
    public boolean isBalanced(TreeNode root) {
        if(root==null)  return true;
        //如果一个树是 平衡二叉树，那么它的左子树它的右子树和 左右子树的深度小于1
        return isBalanced(root.right)&&isBalanced(root.left)&&(Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1);
    }


    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        long s= 100;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
