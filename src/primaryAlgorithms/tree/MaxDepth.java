package primaryAlgorithms.tree;

/**
 * <div class="question-detail"><div class="question-description__3U1T"><div class="translation-tool__3Ffj"><span class="" data-toggle="tooltip" data-placement="left" data-original-title="��ʾӢ��" aria-hidden="true" style="cursor: pointer;"><div class="switch-base__1Zql" data-on="false"><div class="toggle__3ZBJ"></div></div></span></div><div><p>����һ�����������ҳ��������ȡ�</p>

<p>�����������Ϊ���ڵ㵽��ԶҶ�ӽڵ���·���ϵĽڵ�����</p>

<p><strong>˵��:</strong>&nbsp;Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣</p>

<p><strong>ʾ����</strong><br>
���������� <code>[3,9,20,null,null,15,7]</code>��</p>

<pre>    3
   / \
  9  20
    /  \
   15   7</pre>

<p>��������������&nbsp;3 ��</p>
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
