package primaryAlgorithms.tree;
import java.time.temporal.TemporalUnit;
import java.util.*;

import javax.lang.model.type.NullType;
/**
 * <div><p>����һ���������������䰴��α����Ľڵ�ֵ�� �������أ������ҷ������нڵ㣩��</p>

<p>����:<br>
����������:&nbsp;<code>[3,9,20,null,null,15,7]</code>,</p>

<pre>    3
   / \
  9  20
    /  \
   15   7
</pre>

<p>�������α��������</p>

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
        // ��¼��ǰ���Ѿ�ɨ����Ľڵ����
    	int curLevelCounter = 0;
    	// ��¼��һ��ڵ����
    	int nextLevelCounter = 0;
    	// ��ǰ��Ӧ���еĽڵ�����,�����ж��Ƿ��Ѿ��������һ��
        int maxLevelCounter = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> temp = new LinkedList<Integer>();
        
        while(!queue.isEmpty()) {
        	TreeNode cur = queue.poll();
        	if(cur.left != null) {
        		// ����һ��Ľڵ���������,�Ժ����,ͬʱά����һ��Ľڵ����������
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
        		// �Ѿ�ɨ����һ��
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
