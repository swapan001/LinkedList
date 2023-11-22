public class LinkedListProb{
	Node head;
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
			this.next=next;
			}
		}
	
	public void addFirst(String data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			return;
			}
		newNode.next=head;
		head=newNode;
		}
	public void addLast(String data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			return;
			}
		Node currentNode=head;
		while(currentNode.next!=null){
			currentNode=currentNode.next;
			}
			currentNode.next=newNode;	
		}
		
	public void removeFirst(){
		if(head==null){
			System.out.println("Empty List");
			return;
			}
			head=head.next;
		}
		
	public void removeLast(){
		if(head==null){
			System.out.println("Empty List");
			return;
			}
		if(head.next==null){
			head=null;
			return;
			}
		Node secondLast=head;
		Node lastNode=head.next;
		while(lastNode.next!=null){
			lastNode=lastNode.next;
			secondLast=secondLast.next;
			}
			secondLast.next=null;
		}
		
	public void Display(){
		if(head==null){
			System.out.println("Empty List");
			return;
			}
		Node currentNode=head;
		while(currentNode!=null){
			System.out.print(currentNode.data+"-->");
			currentNode=currentNode.next;
			}
			System.out.println("null");
		}
	public static void main(String[] args){
		LinkedListProb t=new LinkedListProb();
		t.addFirst("hi");
		t.addFirst("hello");
		t.Display();
		t.addLast("bye");
		t.Display();
		t.addLast("pie");
		t.Display();
		t.removeFirst();
		t.Display();
		t.removeLast();
		t.Display();
		}
	}
