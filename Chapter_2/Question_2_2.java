import java.util.Random;

/**
 * Chapter 2 questions
 * Problems from Cracking the Coding Interview
 * @author Eric Elguea
 *
 */
public class Question_2_2 {
	public static iNode nthToLast(iNode head, int k) {
		iNode p1 = head;
		iNode p2 = head;
		
		/* Move p1 k nodes into the list.*/
		for (int i = 0; i < k; i++) {
			if (p1 == null) return null; // Out of bounds
			p1 = p1.next;
		}
		
		/* Move them at the same pace. When p1 hits the end, 
		 * p2 will be at the right element. */
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
	  	}
	  	return p2;
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
			iNode x = null;
			Random rand = new Random();
			int size = 8;
			for(int i=0; i<size; i++) {
				x = new iNode(rand.nextInt(size-1), x);
			}
			
			System.out.println("List before nth: ");
			printList(x);
			x = nthToLast(x, 8);
			System.out.println("List after nth: ");
			printList(x);
		}
}