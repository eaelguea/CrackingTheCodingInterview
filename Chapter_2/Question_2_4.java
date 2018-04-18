import java.util.*;

/**
 * Chapter 2 questions
 * Problems from Cracking the Coding Interview
 * @author Eric Elguea
 *
 */

public class Question_2_4 {
	public static iNode partition(iNode node, int x) {
		iNode head = node;
		iNode tail = node;
		
		while(node != null) {
			iNode next = node.next;
			if(node.data < x) {
				node.next = head;
				head = node;
			}else {
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		return head;
	}
	
	public static void printList(iNode x){
		if(x!=null){
			System.out.print(x.data+" ");
			printList(x.next);
		}else
			System.out.println();
	}
	
	public static void main(String[] args) {
		iNode x = null;
		int size = 4;
		Random rand = new Random();
		for(int i=0; i<size; i++) {
			x = new iNode(rand.nextInt(size-1), x);
		}
		
		printList(x);
		partition(x, 8);
		printList(x);
	}
}
