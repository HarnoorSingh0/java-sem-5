package javasem5;

import java.util.Scanner;
import java.util.Stack;

public class Prfefix_to_postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String exp;
		Stack<String> stk=new Stack<String>();
		System.out.println("enter the expression");
		exp=input.nextLine();

		
		for(int i=exp.length()-1;i>=0;i--)
		{
			char ch=exp.charAt(i);
			
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				stk.push(ch+"");
			}
			else
			{
				String s1=stk.pop();
				String s2=stk.pop();
				String s3=s1+s2+ch;
				
				stk.push(s3);
			}
		}
		
		System.out.println(stk.peek());
	}
}
