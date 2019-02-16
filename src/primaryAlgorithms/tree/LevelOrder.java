package primaryAlgorithms.tree;
import java.time.temporal.TemporalUnit;
import java.util.*;

import javax.lang.model.type.NullType;
/**
 * <div><p>给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。</p>

<p>例如:<br>
给定二叉树:&nbsp;<code>[3,9,20,null,null,15,7]</code>,</p>

<pre>    3
   / \
  9  20
    /  \
   15   7
</pre>

<p>返回其层次遍历结果：</p>

<pre>[
  [3],
  [9,20],
  [15,7]
]
</pre>
</div>
 * @author lbr19
 *
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        // 记录当前层已经扫描过的节点个数
    	int curLevelCounter = 0;
    	// 记录下一层节点个数
    	int nextLevelCounter = 0;
    	// 当前层应该有的节点总数,用于判断是否已经遍历完成一层
        int maxLevelCounter = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> temp = new LinkedList<Integer>();
        
        while(!queue.isEmpty()) {
        	TreeNode cur = queue.poll();
        	if(cur.left != null) {
        		// 将下一层的节点放入队列中,稍后访问,同时维护下一层的节点个数计数器
        		queue.offer(cur.left);
                ++nextLevelCounter;
        	}
        	if(cur.right != null) {
        		queue.offer(cur.right);
                ++nextLevelCounter;
        	}
        	++curLevelCounter;
        	temp.add(cur.val);
            
        	if(curLevelCounter == maxLevelCounter) {
        		// 已经扫描完一层
        		result.add(temp);
        		temp = new LinkedList<Integer>();
        		maxLevelCounter = nextLevelCounter;
        		nextLevelCounter = 0;
                curLevelCounter = 0;
        	}
        }
        return result;
    }
}
