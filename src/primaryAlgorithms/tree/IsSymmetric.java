package primaryAlgorithms.tree;

/**
 * <div><p>给定一个二叉树，检查它是否是镜像对称的。</p>

<p>例如，二叉树&nbsp;<code>[1,2,2,3,4,4,3]</code> 是对称的。</p>

<pre>    1
   / \
  2   2
 / \ / \
3  4 4  3
</pre>

<p>但是下面这个&nbsp;<code>[1,2,2,null,3,null,3]</code> 则不是镜像对称的:</p>

<pre>    1
   / \
  2   2
   \   \
   3    3
</pre>

<p><strong>说明:</strong></p>

<p>如果你可以运用递归和迭代两种方法解决这个问题，会很加分。</p>
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
