package LinkedList;

public class IsPalindrome {
	public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        
        int length = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        while(head != null){
            head = head.next;
            ++length;
        }
        int halfLength = length / 2;
        ListNode last = null;
        ListNode tmp = null;
        head = dummy.next;
        while(halfLength > 0){
            tmp = head.next;
            head.next = last;
            last = head;
            head = tmp;
            --halfLength;
        }
        ListNode lastPart = length % 2 == 0 ? head : head.next;
        ListUtil.printList(last);
        ListUtil.printList(lastPart);
        while(last != null && lastPart != null){
            if(last.val != lastPart.val) return false;
            last = last.next;
            lastPart = lastPart.next;
        }
        
        return true;
    }
	
	public static void main(String args[]) {
		int[] array = new int[] {1,2,3,2,1};
		ListNode head = ListUtil.arrayToList(array);
		ListUtil.printList(head);
		IsPalindrome solution = new IsPalindrome();
		System.out.println(solution.isPalindrome(head));
		ListUtil.printList(head);
	}
}
