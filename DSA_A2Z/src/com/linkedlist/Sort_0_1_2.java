package com.linkedlist;

public class Sort_0_1_2 {

	public static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	// bruteforce approach( TC-> O(2N) , SC-> O(1))

	/*
	 * Intution :
	 * take 3 ptr and make them zero and start traversing linked list from
	 * head to null while traversing what ever data found put into that particular
	 * ptr and move and increase ptr count . after all count again make temp to head
	 * and check if ptr0 has data if yes then put into curr position and reduce
	 * count till null
	 * 
	 */
	public static Node segregate(Node head) {
		if (head == null) {
			return head;
		}
		int cnt0 = 0, cnt1 = 0, cnt2 = 0;
		Node curr = head;
		while (curr != null) {
			if (curr.data == 0) {
				cnt0++;
			} else if (curr.data == 1) {
				cnt1++;
			} else {
				cnt2++;
			}
			curr = curr.next;
		}

		curr = head;

		while (curr != null) {
			if (cnt0 > 0) {
				curr.data = 0;
				cnt0--;
			} else if (cnt1 > 0) {
				curr.data = 1;
				cnt1--;
			} else {
				curr.data = 2;
				cnt2--;
			}
			curr = curr.next;
		}
		return head;
	}
	
	
	
	//Optimal approach (TC-> O(N) SC-> O(1) )
	
	/* Here we use the dummy node and attach dummy.next to curr node and create 3 
	 * segrigated LL and we have to join them one after another
	 * 
	 * 
	 */
	public static Node segregate_0_1_2(Node head) {
		
		// Create three dummy nodes to handle the three partitions for 0, 1, and 2
	    Node zeroHead = new Node(-1);  // Dummy node for 0's
	    Node oneHead = new Node(-1);   // Dummy node for 1's
	    Node twoHead = new Node(-1);   // Dummy node for 2's
	    
	    Node zero = zeroHead;   // Pointer to track the end of 0's list
	    Node one = oneHead;     // Pointer to track the end of 1's list
	    Node two = twoHead;     // Pointer to track the end of 2's list
	    
	    Node curr = head;  // Start traversing the original list
	    
	    // Traverse the original list and partition the nodes based on their value
	    while (curr != null) {
	        if (curr.data == 0) {
	            zero.next = curr;
	            zero = zero.next;
	        } else if (curr.data == 1) {
	            one.next = curr;
	            one = one.next;
	        } else {  // curr.data == 2
	            two.next = curr;
	            two = two.next;
	        }
	        curr = curr.next;
	    }
	    
	    // Now connect the three partitions together:
	    // 1. Connect the end of the 0's list to the beginning of the 1's list
	    if (oneHead.next != null) {
	        zero.next = oneHead.next;
	    } else {
	        zero.next = twoHead.next;  // No 1's, connect directly to 2's list
	    }
	    
	    // 2. Connect the end of the 1's list to the beginning of the 2's list
	    one.next = twoHead.next;
	    
	    // 3. The last node of the 2's list should point to null to terminate the list
	    two.next = null;
	    
	    // The head of the final list is the node after the dummy node in zeroHead
	    head = zeroHead.next;
	    
	    return head;
	}
	
	// Function to print the linked list
	static void printLinkedList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
     
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(2);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(2);
		head.next.next.next.next.next = new Node(0);
		head.next.next.next.next.next.next = new Node(2);
		head.next.next.next.next.next.next.next = new Node(0);
		
		printLinkedList(head);
		head=segregate_0_1_2(head);
		printLinkedList(head);
		
	}

}
