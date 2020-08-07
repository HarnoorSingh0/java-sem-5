package javasem5;

public class DoublyLL {
	
	  
		Node head;

		class Node { 
			int data; 
			Node prev; 
			Node next; 
 
			Node(int d) { 
				data = d; } 
		} 
 
		public void atbeg(int new_data) 
		{ 
 
			Node new_Node = new Node(new_data); 
 
			new_Node.next = head; 
			new_Node.prev = null; 
			if (head != null) 
				head.prev = new_Node; 
			head = new_Node; 
		} 

		public void printlist(Node node) 
		{ 
			Node last = null; 

			while (node != null) { 
				System.out.print(node.data + " "); 
				last = node; 
				node = node.next; 
			} 

			System.out.println(); 
		} 
		
		public void InsertAfter(Node prev_Node, int new_data) 
	    { 
	  
	        
	        if (prev_Node == null) { 
	            System.out.println("The prev node is NULL "); 
	            return; 
	        } 
	        Node new_node = new Node(new_data); 
	        new_node.next = prev_Node.next; 
	  
	        prev_Node.next = new_node; 
	  
	        new_node.prev = prev_Node; 
	  
	  
	        if (new_node.next != null) 
	            new_node.next.prev = new_node; 
	    } 
	  
	    void add(int new_data) 
	    { 
	        Node new_node = new Node(new_data); 
	  
	        Node last = head; 
	  
	        
	        new_node.next = null; 
	  
	       
	        if (head == null) { 
	            new_node.prev = null; 
	            head = new_node; 
	            return; 
	        } 
	  
	       
	        while (last.next != null) 
	            last = last.next; 
	  
	        
	        last.next = new_node; 
	  
	        new_node.prev = last; 
	    } 
	  

		void deleteNode(Node del) 
		{ 

			if (head == null || del == null) { 
				return; 
			} 

			if (head == del) { 
				head = del.next; 
			} 

			if (del.next != null) { 
				del.next.prev = del.prev; 
			} 
			if (del.prev != null) { 
				del.prev.next = del.next; 
			} 
			return; 
		} 

		public static void main(String[] args) 
		{ 
			DoublyLL dll = new DoublyLL(); 
			dll.atbeg(1); 
			dll.atbeg(4); 
			dll.atbeg(3); 
			dll.atbeg(0); 
			dll.add(5); 
			dll.add(1);
		
			dll.printlist(dll.head); 

			dll.deleteNode(dll.head); 

			 
			dll.printlist(dll.head); 

	 
		} 
	
	


}
