package LinkedList;

/**
 * <div><p>给定一个链表，删除链表的倒数第&nbsp;<em>n&nbsp;</em>个节点，并且返回链表的头结点。</p>

<p><strong>示例：</strong></p>

<pre>给定一个链表: <strong>1-&gt;2-&gt;3-&gt;4-&gt;5</strong>, 和 <strong><em>n</em> = 2</strong>.

当删除了倒数第二个节点后，链表变为 <strong>1-&gt;2-&gt;3-&gt;5</strong>.
</pre>

<p><strong>说明：</strong></p>

<p>给定的 <em>n</em>&nbsp;保证是有效的。</p>

<p><strong>进阶：</strong></p>

<p>你能尝试使用一趟扫描实现吗？</p>
</div>

 * @author lbr19
 *
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode cur = head;
        ListNode pre = null;
        while(cur.next != null){
            ++count;
            pre = cur;
            cur = cur.next;
        }
        
        if(n == count){
            head = head.next;
            return head;
        }
        if(n == 1){
            pre.next = null;
            return head;
        }
        
        // 删除中间节点的情况
        int nFromHead = count - n;
        cur = head;
        pre = null;  
        while(nFromHead > 0){
            pre = cur;
            cur = cur.next;
            --nFromHead;
        }
        pre.next = cur.next;
        cur.next = null;
        return head;
    }
}
