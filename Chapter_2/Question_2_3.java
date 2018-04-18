import java.util.Random;

/**
 * Chapter 2 questions
 * Problems from Cracking the Coding Interview
 * @author Eric Elguea
 *
 */

public class Question_2_3 {
	
	public static boolean deleteMiddle(iNode x) {
		if(x==null|| x.next==null) {
			return false;
		}
		iNode next = x.next;
		x.data = next.data;
		x.next = next.next;
		return true;
	}
	
	// Method that prints the list
	public static void printList(iNode x){
		if(x!=null){
			System.out.print(x.data+" ");
			printList(x.next);
		}else
			System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iNode head = null;
		Random rand = new Random();
		int size = 6;
		for(int i=0; i<size; i++) {
			head = new iNode(rand.nextInt(size-1), head);
		}
		
		printList(head);
		deleteMiddle(head);
		printList(head);
	}

}
