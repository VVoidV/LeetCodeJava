package LinkedList;



/**
 * <div class="content__eAC7"><div><p>反转一个单链表。</p>

<p><strong>示例:</strong></p>

<pre><strong>输入:</strong> 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;NULL
<strong>输出:</strong> 5-&gt;4-&gt;3-&gt;2-&gt;1-&gt;NULL</pre>

<p><strong>进阶:</strong><br>
你可以迭代或递归地反转链表。你能否用两种方法解决这道题？</p>
</div></div>

 * @author lbr19
 *
 */

public class ReverseList {

	
    public ListNode reverseList2(ListNode head) {
        ListNode p;
        ListNode q;
        if(head == null || head.next == null) return head;
        p = head.next;
        head.next = null;
        while(p.next != null){
            q = p.next;
            p.next = head;
            head = p;
            p = q;
        }
        p.next = head;
        return p;
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode tmp  = null;
        ListNode last = null;
        while(head != null){
            tmp = head.next;
            head.next = last;
            last = head;
            head = tmp;
        }
        return last;
    }
}
