package javasem5;

import java.util.*;
import java.util.Stack;

public class Infix_to_postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String exp;
		Stack<Character> stk=new Stack<Character>();
		System.out.println("enter the expression");
		exp=input.nextLine();
		String st="";

		for(int i=0;i<exp.length();i++)
		{
			char ch=exp.charAt(i);
			if(ch>='a' && ch<='z')
			{
				st+=ch;
			}
			else
			{
				if(stk.empty())
				{
					stk.push(ch);
				}
				else if(ch=='+' || ch=='-')
				{
					if(stk.peek()!='(' && stk.peek()!=')')
					{
						st+=stk.pop();

						while(stk.empty()==false && (stk.peek()=='+' || stk.peek()=='-' || stk.peek()=='/' || stk.peek()=='*'))
						{
							st+=stk.pop();
						}

							stk.push(ch);

					}
					else
					{
						stk.push(ch);
					}

				}
				else if(ch=='*' || ch=='/')
				{
					if(stk.peek()=='*' || stk.peek()=='/')
					{
						st+=stk.pop();
						stk.push(ch);
					}
					else
					{
						stk.push(ch);
					}
				}
				else if(ch=='(')
				{
					stk.push(ch);
				}
				else if(ch==')')
				{
					while(stk.peek()!='(')
					{
						st+=stk.pop();
					}
					stk.pop();
				}
				else if(ch=='^')
				{
					stk.push(ch);
				}
			}
		}

		//System.out.println(stk.peek());

		while(stk.empty()==false)
		{
			st+=stk.pop();
		}

		System.out.println(st);
	}

}
