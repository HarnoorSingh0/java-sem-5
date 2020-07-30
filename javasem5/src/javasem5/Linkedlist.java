package javasem5;

public class Linkedlist {
	
	
    Node head;
    public static int size,sum;
    static class Node{
        Node next;
        int data;
        Node (int d)
        {
            data =d;
            next=null;
        }
    }
    
    
    public static Linkedlist beg(Linkedlist list ,int data)
    {
        Node node = new Node(data); 
		node.next =list.head;
		list.head = node;
		size ++;
		return list;
		
    }
    
    
    public static Linkedlist insert(Linkedlist list,int data)
    {
        Node node =new Node(data);
        node.next=null;
        if (list.head==null)
         list.head=node;
        else
        {
            Node last=list.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=node;
        }
        size++;
        return list;
    }
    
    
    public static Linkedlist Mid(Linkedlist list,int data){  
          
        Node newNode = new Node(data);  
  
          
        if(list.head == null) {  
              
            list.head = newNode;  
              
        }  
        else {  
            Node temp, current;  
              
            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);  
              
            temp = list.head;  
            current = null;  
  
            
            for(int i = 0; i < count; i++) {  
                  
                current = temp;  
                temp = temp.next;  
            }  
  
            current.next = newNode;  
            newNode.next = temp;  
        }  
        size++;
        return list;
    }
    
    
    
    public static Linkedlist  delete(Linkedlist list,int position ) 
	{ 
		 
		if (list.head == null)
		{
		    System.out.println("list is empty");
			return list; 
		}
	 
		Node temp = list.head; 

		 
		if (position == 0) 
		{ 
			list.head = temp.next;  
			return list; 
		} 


		for (int i=0; temp!=null && i<position-1; i++) 
			temp = temp.next; 

		
		if (temp == null || temp.next == null) 
		{   System.out.println("Invalid index");
		    return list; 
		}
		 
		Node next = temp.next.next; 

		temp.next = next;
		size --;
		return list;
	} 
	
	
	
	static Node reverse(Node head)  
    {  
        if (head == null || head.next == null)  
            return head;  
  
        
        Node rest = reverse(head.next);  
        head.next.next = head;  
  
        head.next = null;  
  
        
        return rest;  
    }

    
    public static void printt(Linkedlist list)
    {
        Node cnode=list.head;
        while(cnode!=null)
        {
            System.out.print(cnode.data+" ");
            cnode =cnode.next;
        }
        System.out.println();
    }
    
    
      public static int avg(Linkedlist list)
    {
      
        Node cnode=list.head;
        
        while(cnode!=null)
        {
             sum=sum+cnode.data;
            cnode =cnode.next;
        }
        return sum;
    }
    
    
	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		list= insert(list,1);//add element at last
		list= insert(list,2);
		list= insert(list,4);
		list= beg(list,5);   //add element at front
		list= insert(list,5);
		list= insert(list,6);
		list= insert(list,7);
		list= beg(list,0);
		list= Mid(list,99);  //add element at middle
		printt(list);        //print the list
		list= delete(list,2);//delete a element
		System.out.println("list after deletion");
		printt(list);
		System.out.print("avg:-");
		System.out.println(avg(list)/(size+1));//avg of linked list
		System.out.println("original");
		printt(list);
		System.out.println("reversed");
		list.head = reverse(list.head);//reverse linklist
		printt(list);
	}



}
