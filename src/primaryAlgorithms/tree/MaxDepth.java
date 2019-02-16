package primaryAlgorithms.tree;

/**
 * <div class="question-detail"><div class="question-description__3U1T"><div class="translation-tool__3Ffj"><span class="" data-toggle="tooltip" data-placement="left" data-original-title="显示英文" aria-hidden="true" style="cursor: pointer;"><div class="switch-base__1Zql" data-on="false"><div class="toggle__3ZBJ"></div></div></span></div><div><p>给定一个二叉树，找出其最大深度。</p>

<p>二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。</p>

<p><strong>说明:</strong>&nbsp;叶子节点是指没有子节点的节点。</p>

<p><strong>示例：</strong><br>
给定二叉树 <code>[3,9,20,null,null,15,7]</code>，</p>

<pre>    3
   / \
  9  20
    /  \
   15   7</pre>

<p>返回它的最大深度&nbsp;3 。</p>
</div></div></div>
 * @author lbr19
 *
 */
public class MaxDepth {
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return traverse(root);
    }
    
    private int traverse(TreeNode node){
        int leftDepth = 0;
        int rightDepth = 0;
        if(node.left != null){
            leftDepth = traverse(node.left);
        }
        if(node.right !=null){
            rightDepth = traverse(node.right);
        }
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
