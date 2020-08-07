
package javasem5;


public class CircularLinkedList {
 

		public static Node head,tail;   
		
		static class Node { 

			int data; 
			Node next; 
	 
			Node(int d) 
			{ 
				data = d; 
				next = null; 
			} 
		} 
	     
	     
	    public static void beg(int data)
	    {
	        Node node = new Node(data);
	        
	        if (head==null){
	            head=node;
	            tail=node;
	        }
	         else{
	         Node t=head;
			node.next =t;
			head =node;
			tail.next=head;
	         }
			
	    }

		public static void insert(int data) 
		{ 
			Node node = new Node(data); 
			node.next = null; 

			 
			if (head == null) { 
				head = node;
				tail = node;
			} 
			else { 
				 
				 tail.next=node;
				 tail=node;
				 tail.next=head;
				
				
			} 
		} 


		public static void printList() 
		{ 
			Node currNode = head; 

			 do{ 
				System.out.print(currNode.data + " "); 
				currNode = currNode.next; 
			} while (currNode != head);
			System.out.println();
			
		} 

		
		public static void main(String[] args) 
		{ 
			
			CircularLinkedList list = new CircularLinkedList(); 

		 
			insert(1); 
			insert(2); 
			insert(3); 
			insert(7); 
			printList();
			beg(0); 
			beg(5); 
			beg(4); 
			printList(); 
			
		} 
	


}

