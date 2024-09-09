class DoubleLinkedList{
	Node head;
	Node tail;
	DoubleLinkedList(){
		this.head=null;
		this.tail=null;	
		}
	class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
			}
		}
		
		public void addF(int data){
			Node newNode=new Node(data);
			if(head==null){
				head=newNode;
				tail=newNode;
				return;
				}
			
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
			}
			
		public void addL(int data){
			Node newNode=new Node(data);
			if(head==null){
				head=newNode;
				tail=newNode;
				}
				tail.next=newNode;
				newNode.prev=tail;
				tail=newNode;
			}
		public void delF(){
			if(head==null){System.out.println("Empty List"); return;}
			if(head==tail){head=null; tail=null; return;}
				Node temp=head;
				head=head.next;
				head.prev=null;
				temp.next=null;
				}
		public void delL(){
			if(head==null){System.out.println("The list is Empty"); return;}
			if(head==tail){head=null; tail=null; return;}
				Node tempp=tail;
				tail=tail.prev;
				tail.next=null;
				tempp.prev=null;			
			}
			
			public void display(){
				if(head==null){System.out.println("EmptyList"); return;}
				Node temp=head;
				System.out.print("NULL->");
				while(temp!=null){
					System.out.print(temp.data+"->");
					temp=temp.next;
					}
					System.out.println("NULL");
				}
			public static void main(String[] args){
				DoubleLinkedList dll=new DoubleLinkedList();
				dll.addF(5);
				dll.addF(8);
				dll.addF(13);
				dll.addL(0);
				dll.addL(5);
				dll.addL(8);
				dll.addL(13);
			
				dll.display();
				dll.delF();
				dll.display();
				dll.delL();
				dll.display();
				}
			}
