/**
 * Chapter 3 questions
 * Problems from Cracking the Coding Interview
 * @author Eric Elguea
 *
 * Imagine a (literal) stack of plates. If the stack gets too high, it might topple. 
 * Therefore, in real life, we would likely start a new stack when the previous stack exceeds some threshold. 
 * Implement a data structure SetOfStacks that mimics this. 
 * SetOfStacks should be composed of several stacks, 
 * and should create a new stack once the previous one exceeds capacity. 
 * SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack 
 * (that is, pop() should return the same values as it would if there were just a single stack).
 */

import java.util.Map;
import java.util.HashMap;

class Node {
    public Integer data = null;
    public Node next = null;
    
    public Node(Integer data){
        this.data = data;
    }
    
    public Node(Integer data, Node next){
        this.data = data;
        this.next = next;
    }
    
    @Override
    public String toString(){
        return this.data.toString();
    }
}

class Stack {
    public Integer capacity = null;
    public Integer size = null;
    public Node head = null;
    public Stack next = null;
    
    public Stack(Integer capacity){
        this.capacity = capacity;
        this.size = 0;
    }
    
    public void push(Integer data) throws Exception {
        if(this.size==this.capacity){
            throw new Exception("Capacity is full");
        }
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

class SetOfStacks {
    public Integer size = null;
	public Integer stackCapacity = null;
	public Stack top = null;

	public Map<Integer, Stack> index = null;

	public SetOfStacks(Integer stackCapacity) {
		this.stackCapacity = stackCapacity;
		this.size = 0;
		this.index = new HashMap<Integer, Stack>();
	}

	public void push(Integer value) throws Exception {
		if (this.top == null) {
			this.top = new Stack(this.stackCapacity);
			this.index.put(this.size, this.top);
			this.size++;
		}
		if (this.top.size == this.stackCapacity) {
			Stack newStack = new Stack(this.stackCapacity);
			newStack.next = this.top;
			this.top = newStack;
			this.index.put(this.size, this.top);
			this.size++;
		}

		this.top.push(value);
	}

	public Integer pop() {
		if (this.top == null) {
			return null;
		}
		Integer value = this.top.pop();

		if (this.top.size == 0) {
			Stack next = this.top.next;
			this.top = next;
			
			this.index.remove(this.size - 1);
			this.size--;
		}

		return value;
	}

	public Integer popAt(Integer i) {
		if (this.index.containsKey(i)) {
			return this.index.get(i).pop();
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Set of stacks size = ");
		sb.append(this.size);
		sb.append(".");
		if (this.size > 0) {
			sb.append(" Stacks: \n");
			Stack current = this.top;
			while (current != null) {
				sb.append(current.toString());
				if (current.next != null) {
					sb.append(";\n");
				}
				current = current.next;
			}
		}
		return sb.toString();
	}
}

public class Question_3_3{
    public static void main(String[] args){
        SetOfStacks stacks = new SetOfStacks(6);
        try {
            for(int i=1; i<= 10; i++){
                stacks.push(i);
                System.out.println(stacks);
                System.out.println();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        System.out.println(stacks.popAt(1));
        System.out.println(stacks.popAt(0));
        
        for(int j=0; j<= 10; j++){
            System.out.println(stacks.pop());
            System.out.println(stacks);
            System.out.println();
        }
    }
}