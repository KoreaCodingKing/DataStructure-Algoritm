package Test;

public class SingleLinkedList<T> {
	
	class Node{
		T data;
		Node next;
	}
	
	Node head;
	Node tail;
	
	public SingleLinkedList() {
		this.head=null;
		this.tail=null;
	}
	
	public void addHead(T data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=this.head;
		
		this.head=newNode;
		if(tail==null) {
			this.tail=newNode;
		}
	}
	
	public void addTail(T data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		
		if(tail==null) {
			this.head=newNode;
		}else {
			this.tail.next=newNode;
		}
		
		this.tail=newNode;
	}
	
	public T removeHead() {
		if(isEmpty())
			return null;
		
		Node temp=this.head;
		this.head=temp.next;
		
		if(this.head==null) {
			this.tail=null;
		}
		
		return temp.data;
	}
	
	public T removeTail() {
		if(isEmpty())
			return null;
		
		Node temp=this.tail;
		Node last=this.head;
		
		if(temp==last) {
			this.head=this.tail=null;
		}else {
			while(last !=null && last.next !=temp) {
				last=last.next;
			}
			last.next=null;
			this.tail=last;
		}
		return temp.data;
	}
	
	private boolean isEmpty() {
		return this.head==null;
	}

	public static void main(String[] args) {
		
	}
}
