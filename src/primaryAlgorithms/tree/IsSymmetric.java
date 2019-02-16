package primaryAlgorithms.tree;

/**
 * <div><p>����һ����������������Ƿ��Ǿ���ԳƵġ�</p>

<p>���磬������&nbsp;<code>[1,2,2,3,4,4,3]</code> �ǶԳƵġ�</p>

<pre>    1
   / \
  2   2
 / \ / \
3  4 4  3
</pre>

<p>�����������&nbsp;<code>[1,2,2,null,3,null,3]</code> ���Ǿ���ԳƵ�:</p>

<pre>    1
   / \
  2   2
   \   \
   3    3
</pre>

<p><strong>˵��:</strong></p>

<p>�����������õݹ�͵������ַ������������⣬��ܼӷ֡�</p>
</div>
 * @author lbr19
 *
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isIdentical(root.left, root.right);
    }
    
    private boolean isIdentical(TreeNode n1, TreeNode n2){
        if(n1 == null && n2 == null) return true;
        
        if(n1 == null && n2 != null || n1 != null && n2 == null){
            return false;
        }
                
        return n1.val == n2.val&&
            isIdentical(n1.left, n2.right)
            && isIdentical(n1.right, n2.left);
    }
}
