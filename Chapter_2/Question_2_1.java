import java.util.Random;

/**
 * Chapter 2 questions
 * Problems from Cracking the Coding Interview
 * @author Eric Elguea
 *
 */
public class Question_2_1 {
	public static void removeDuplicates(iNode head) {
		iNode curr = head;
		while(curr!=null) {
			iNode temp = curr;
			while(temp.next != null) {
				if(temp.next.data == curr.data) {
					temp.next = temp.next.next;
				}else {
					temp = temp.next;
				}
			}
			curr = curr.next;
		}
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
		int size = 10;
		for(int i=0; i<size; i++) {
			x = new iNode(rand.nextInt(size-1), x);
		}
		
		System.out.println("List before duplicates are removed: ");
		printList(x);
		removeDuplicates(x);
		System.out.println("List after duplicates are removed: ");
		printList(x);
	}
}
