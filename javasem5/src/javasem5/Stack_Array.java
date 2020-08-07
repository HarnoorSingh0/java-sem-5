package javasem5;



class Stack { 
	static final int MAX = 100; 
	int top; 
	int a[] = new int[MAX]; 
    
 
	Stack() 
	{ 
		top = -1; 
	} 

	boolean push(int x) 
	{ 
		if (isFull()) { 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			a[++top] = x; 
			return true; 
		} 
	} 

	void pop() 
	{ 
		if (isEmpty()) { 
			System.out.println("Stack Underflow"); 
			return ; 
		} 
		else { 
			int x = a[top--]; 
			System.out.println("pop   "+x);
			return ; 
		} 
	}
	boolean isEmpty() 
	{ 
		return (top < 0); 
	}
	boolean isFull() 
	{ 
		return (top >= (MAX - 1)); 
	}

	void peek() 
	{ 
		if (isEmpty()) { 
			System.out.println("Stack Underflow"); 
			return ; 
		} 
		else { 
			int x = a[top];
			System.out.println("element at top is  "+x);
			return ; 
		} 
	}
	void display()
	{
	    if (isEmpty()) { 
			System.out.println("stack is empty"); 
			return ; 
		}
		for(int i=top;i>=0;i--)
		System.out.print(a[i]+" "); 
		return ;
	    
	}
} 

public class Stack_Array { 
	public static void main(String args[]) 
	{ 
		Stack s = new Stack(); 
		
		s.push(1); 
		s.push(2); 
		s.push(3);
		s.push(4);
		s.push(5);
		s.pop();
		s.peek();
		s.display();
	} 
 
 

}


