package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class ListUtil {
	static ListNode arrayToList(int[] array) {
		if(array == null) return null;
		
		ListNode dummy = new ListNode(0);
		ListNode next = dummy;

		for(int i = 0; i < array.length; i++) {
			ListNode node = new ListNode(array[i]);
			next.next = node;
			next = next.next;
		}
		return dummy.next;
	}
	
	static void printList(ListNode head) {		
		while(head != null) {
			System.out.print(head.val);
			if(head.next != null) System.out.print("->");
			head = head.next;
		}
		System.out.println();
	}
}
