public class LinkedListEx {
Node head;
int size=0;
class Node {
	String data;
	Node  next;
	Node(String data){
		this.data=data;
		this.next=null;
		size++;
	}
}
public void addFirst(String data) {
	Node newNode=new Node(data);
	if(head==null) {
		head=newNode;
		return;
	}
	newNode.next=head;
	head=newNode;
}
public void addLast(String data) {
	Node newNode=new Node(data);
	if(head==null) {
		head=newNode;
		return;
	}
	Node currentNode=head;
	while(currentNode.next!=null) {
		currentNode=currentNode.next;
	}
	currentNode.next=newNode;
}
public void printList() {
	if(head==null) {
		System.out.println("list is empty");
		return;
	}
	Node currentNode=head;
	while(currentNode!=null) {
		System.out.print(currentNode.data+" ->");
		currentNode=currentNode.next;
	}
	System.out.println("NULL");
}

public void deleteFirst() {
	if(head==null) {
		System.out.println("list is empty");
		return;
	}
	size--;
	head=head.next;
}
public void deleteLast() {
	if(head==null) {
		System.out.println("list is empty");
		return;
	}
	size--;
	if(head.next==null) {
		head=null;
		return;
	}
	Node secondLastNode=head;
	Node lastNode=head.next;
	while(lastNode.next!=null) {
		secondLastNode=secondLastNode.next;
		lastNode=lastNode.next;
	}
secondLastNode.next=null;
}
public int getSize() {
	return this.size;
}

public static void main(String[] args) {
	LinkedListEx ll=new LinkedListEx();
	ll.addFirst("aaa");
	ll.addFirst("is");
	ll.addLast("list");
	ll.addFirst("this");
	ll.printList();
	ll.deleteFirst();
	ll.printList();
	ll.deleteLast();
	ll.printList();
	System.out.println(ll.getSize());
	ll.addFirst("this");
	System.out.println(ll.getSize());
	ll.deleteFirst();
	System.out.println(ll.getSize());
}
}
