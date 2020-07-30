package javasem5;
import java.util.*;

public class LinkList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}	
	}
	public static LinkList insert(LinkList list,int data) {
		Node node =new Node(data);
		
		//node.next =null;
		if (list.head==null)
		{
			list.head=node;
		}
		else {
			Node last = list.head;
			while(last.next!=null)
				last=last.next;
			
			last.next=node;
		}
		
		return list;
	}
	public static  void printt(LinkList list)
	{
		Node cnode = list.head;
		while(cnode !=null)
		{
			System.out.print(cnode.data+" ");
			cnode=cnode.next;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList list = new LinkList();
		list =insert(list,5);
		list =insert(list,4);
		list =insert(list,9);
		list =insert(list,5);
		list =insert(list,1);
		printt(list);
				
	}
	
}































