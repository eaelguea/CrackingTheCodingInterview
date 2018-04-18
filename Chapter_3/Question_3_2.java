/**
 * Chapter 3 questions
 * Problems from Cracking the Coding Interview
 * @author Eric Elguea
 *
 * How would you design a stack which, in addition to push and pop, 
 * also has a function min which returns the minimum element? 
 * Push, pop and min should all operate in O(1) time.
 */

class LinkNode<T extends Comparable<T>>{
    public T value = null;
    public LinkNode<T> next = null;
    public LinkNode<T> prev = null;
    public T min = null;
    
    
    public LinkNode(T value){
        this.value = value;
    }
}

class Stack<T extends Comparable<T>>{
    protected LinkNode<T> root = null;
    protected LinkNode<T> head = null;
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        if(this.root == null){
            return null;
        }
        LinkNode<T> curr = this.root;
        while(curr!= null){
            sb.append(curr.value);
            if(curr.next != null){
                sb.append(" --> ");
            }
            curr = curr.next;
        }
        return sb.toString();
    }
    
    public void push(T value){
        LinkNode<T> node = new LinkNode<>(value);
        if(this.root==null){
            node.min = value;
            this.root = node;
        }else{
            LinkNode<T> prev = this.head;
            if(value.compareTo(prev.min) <= 0){
                node.min = value;
            }else{
                node.min = prev.min;
            }
            node.prev = prev;
            prev.next = node;
        }
        this.head = node;
    }
    
    public T pop(){
        if(this.head==null){
            return null;
        }
        T value = this.head.value;
        if(this.head.prev==null){
            this.head=null;
            this.root=null;
        }else{
            this.head=this.head.prev;
            this.head.next=null;
        }
        return value;
    }
    
    public T peek(){
        if(this.head==null){
            return null;
        }
        return this.head.value;
    }
    
    public T min(){
        if(this.head == null){
            return null;
        }
        return this.head.min;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
}

public class Question_3_2{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        
        for(int i=1; i<10; i++){
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            System.out.println("Min: "+ stack.min() + " Pop: " + stack.pop());
        }
    }
}