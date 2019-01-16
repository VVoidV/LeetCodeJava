package LinkedList;

/**
 * <div><p>���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㣬�㽫ֻ������Ҫ��ɾ���Ľڵ㡣</p>

<p>����һ������ --&nbsp;head =&nbsp;[4,5,1,9]�������Ա�ʾΪ:</p>

<pre>    4 -&gt; 5 -&gt; 1 -&gt; 9
</pre>

<p><strong>ʾ�� 1:</strong></p>

<pre><strong>����:</strong> head = [4,5,1,9], node = 5
<strong>���:</strong> [4,1,9]
<strong>����: </strong>������������ֵΪ&nbsp;<span style="">5</span>&nbsp;�ĵڶ����ڵ㣬��ô�ڵ�������ĺ���֮�󣬸�����Ӧ��Ϊ 4 -&gt; 1 -&gt; 9.
</pre>

<p><strong>ʾ�� 2:</strong></p>

<pre><strong>����:</strong> head = [4,5,1,9], node = 1
<strong>���:</strong> [4,5,9]
<strong>����: </strong>������������ֵΪ&nbsp;1&nbsp;�ĵ������ڵ㣬��ô�ڵ�������ĺ���֮�󣬸�����Ӧ��Ϊ 4 -&gt; 5 -&gt; 9.
</pre>

<p><strong>˵��:</strong></p>

<ul>
	<li>�������ٰ��������ڵ㡣</li>
	<li>���������нڵ��ֵ����Ψһ�ġ�</li>
	<li>�����Ľڵ�Ϊ��ĩβ�ڵ㲢��һ���������е�һ����Ч�ڵ㡣</li>
	<li>��Ҫ����ĺ����з����κν����</li>
</ul>
</div>

 * @author lbr19
 *
 */
public class DeleteNode {
	/**
	 * ������Ŀ�޶��˲���ɾĩβ�ڵ㣬��˿��Խ�Ҫɾ���Ľڵ�ĺ�̽ڵ��ֵ������Ҫɾ���Ľڵ㣬��ɾ����̽ڵ㡣
	 * @param node
	 */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
