/** Name: Eric Elguea
 * Purpose: iNode Class that has the basic structure for linked lists
 * @author Eric Elguea
 *
 */
public class iNode {
	public int data;
	public iNode next;
	
	public iNode(int d, iNode n){
		data = d;
		next = n;
	}
	
	public iNode(int d){
		data = d;
		next = null;
	}
}