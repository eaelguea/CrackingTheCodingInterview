/**
 * Chapter 3 questions
 * Problems from Cracking the Coding Interview
 * @author Eric Elguea
 *
 * Write a program to sort a stack such that the smallest 
 * items are on the top.
 * The following are the only functions that should be used to write this program: push | pop | peek | isEmpty.
 */

import java.util.*;

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
    public String name = null;
    public Integer size = null;
    public Node head = null;
    
    public Stack(String name){
        this.size = 0;
        this.name = name;
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
    
    public void sort(){
        Stack s = new Stack("s");
        while(!this.isEmpty()){
            int value = this.pop();
            s.push(value);
        }
        while(!s.isEmpty()){
            int value = s.pop();
            while(!this.isEmpty() && this.peek() > value){
                s.push(this.pop());
            }
            this.push(value);
        }
    }
}

public class Question_3_5{
    public static void main(String[] args){
        Random rand = new Random();
        Stack s = new Stack("s");
        for(int i=0; i<10; i++){
            s.push(rand.nextInt(i-1));
        }
        System.out.println(s);
        s.sort();
        System.out.println(s);
    }
}