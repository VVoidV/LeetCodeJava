package primaryAlgorithms.tree;

/**
<div><p>����һ�����������ж����Ƿ���һ����Ч�Ķ�����������</p>

<p>����һ��������������������������</p>

<ul>
	<li>�ڵ��������ֻ����<strong>С��</strong>��ǰ�ڵ������</li>
	<li>�ڵ��������ֻ����<strong>����</strong>��ǰ�ڵ������</li>
	<li>�������������������������Ҳ�Ƕ�����������</li>
</ul>

<p><strong>ʾ��&nbsp;1:</strong></p>

<pre><strong>����:</strong>
    2
   / \
  1   3
<strong>���:</strong> true
</pre>

<p><strong>ʾ��&nbsp;2:</strong></p>

<pre><strong>����:
</strong>    5
   / \
  1   4
&nbsp;    / \
&nbsp;   3   6
<strong>���:</strong> false
<strong>����:</strong> ����Ϊ: [5,1,4,null,null,3,6]��
&nbsp;    ���ڵ��ֵΪ 5 �����������ӽڵ�ֵΪ 4 ��
</pre>
</div>
 */
class Solution {
    public boolean isValidBST(TreeNode node) {
        if(node == null) return true;
        
        TreeNode leftBiggest = findRightest(node.left);
        TreeNode rightSmallest = findLeftest(node.right);
        
        if(leftBiggest != null && leftBiggest.val >= node.val 
           || rightSmallest != null && rightSmallest.val <= node.val){
            return false;
        }
        
        return isValidBST(node.left) && isValidBST(node.right);
    }

    private TreeNode findRightest(TreeNode node){
        if(node == null) return null;
        while(node.right != null)
            node = node.right;
        return node;
    }
    
    private TreeNode findLeftest(TreeNode node){
        if(node == null) return null;
        while(node.left != null)
            node = node.left;
        return node;
    }
}