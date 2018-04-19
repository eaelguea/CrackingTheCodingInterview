/**
 * Chapter 3 questions
 * Problems from Cracking the Coding Interview
 * @author Eric Elguea
 *
 * Implement a MyQueue class which implements a queue using two stacks.
 */

class Node {
    public Integer data = null;
    public Node next = null;
    
    public Node(Integer data){
        this.data = data;
    }
    
    @Override
    public String toString(){
        return this.data.toString();
    }
}

class Stack {
    public Integer size = null;
    public Node head = null;
    
    public Stack(){
        this.size = 0;
    }
    
    public void push(Integer data){
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
        this.size++;
    }
    
    public Integer pop(){
        if(this.head==null){
            return null;
        }
        int top = this.head.data;
        this.head = this.head.next;
        this.size--;
        return top;
    }
    
    public Integer peek(){
        if(this.head==null){
            return null;
        }
        return this.head.data;
    }
    
    public boolean isEmpty(){
        return this.size==0;
    }
    
    @Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Stack size = ");
		sb.append(this.size);
		sb.append(".");
		if (this.size > 0) {
			sb.append(" Items: ");

			Node curr = this.head;
			while (curr != null) {
				sb.append(curr);
				if (curr.next != null) {
					sb.append(", ");
				}
				curr = curr.next;
			}
		}
		return sb.toString();
	}
}

class Queue {
	private Stack main = null;
	private Stack aux = null;
	
	public Queue() {
		this.main = new Stack();
		this.aux = new Stack();
	}

	@Override
	public String toString() {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Main stack. ");
		sb1.append(this.main.toString());
		sb1.append("\n");
		sb1.append("Aux stack. ");
		sb1.append(this.aux.toString());
		sb1.append("\n");
		return sb1.toString();
	}
	
	public void enqueue(int value) {
		this.main.push(value);
	}
	
	public int dequeue() {
		while (!this.main.isEmpty()) {
			this.aux.push(this.main.pop());
		}
		int value = this.aux.pop();
		while (!this.aux.isEmpty()) {
			this.main.push(this.aux.pop());
		}
		return value;
	}
}

public class Question_3_4 {
    public static void main(String[] args){
        Queue queue = new Queue();
        System.out.println(queue);
        
        for(int i=1; i<=8; i++){
            queue.enqueue(i);
            System.out.println("-----\nAdding " + i);
            System.out.println(queue);
        }
        
        System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		queue.enqueue(25);
		queue.enqueue(10);
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
    }
}
