
/**
 * Chapter 2 questions
 * Problems from Cracking the Coding Interview
 * @author Eric Elguea
 *
 */

public class Question_2_5{
    private static iNode add(iNode l1, iNode l2, int carry){
        if(l1==null && l2==null && carry==0){
            return null;
        }

        iNode result = new iNode();
        int value = carry;
        if(l1!=null){
            value+=l1.data;
        }
        if(l2!==null){
            value+=l2.data;
        }
        result.data = value %10;
        if(l1==null || l2==null){
            iNode x = add((l1 == null ? null : l1.next, l2 == null ? null : l2.next, value >= 10 ? 1 : 0);
			result.setNext(more);
		}
		return result;
    }

    public static int linkedListToInt(iNode node) {
		int value = 0;
		if (node.next != null) {
			value = 10 * linkedListToInt(node.next);
		}
		return value + node.data;
	}

    public static void printList(iNode x){
		if(x!=null){
			System.out.print(x.data+" ");
			printList(x.next);
		}else
			System.out.println();
	}

    public static void main(String[] args){
        iNode l1=null, l2=null;
        int size = 3;
        Random rand = new Random();
        for(int i=0; i<3; i++){
            l1 = new iNode(rand.nextInt(size-1), l1);
        }
        for(int i=0; i<3; i++){
            l2 = new iNode(rand.nextInt(size-1), l1);
        }
        iNode l3 = add(l1, l2, 0);
        System.out.println(" " + printList(l1));
        System.out.println("+ " + printList(l2));
        System.out.println("= " + printList(l3));

        int a = linkedListToInt(l1);
        int b = linkedListToInt(l2);
        int c = linkedListToInt(l3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
		System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));
    }
}