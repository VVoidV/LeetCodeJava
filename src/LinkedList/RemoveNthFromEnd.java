package LinkedList;

/**
 * <div><p>����һ������ɾ������ĵ�����&nbsp;<em>n&nbsp;</em>���ڵ㣬���ҷ��������ͷ��㡣</p>

<p><strong>ʾ����</strong></p>

<pre>����һ������: <strong>1-&gt;2-&gt;3-&gt;4-&gt;5</strong>, �� <strong><em>n</em> = 2</strong>.

��ɾ���˵����ڶ����ڵ�������Ϊ <strong>1-&gt;2-&gt;3-&gt;5</strong>.
</pre>

<p><strong>˵����</strong></p>

<p>������ <em>n</em>&nbsp;��֤����Ч�ġ�</p>

<p><strong>���ף�</strong></p>

<p>���ܳ���ʹ��һ��ɨ��ʵ����</p>
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
        
        // ɾ���м�ڵ�����
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
