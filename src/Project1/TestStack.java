package Project1;


import java.util.Scanner;

public class TestStack {

	public static void main(String[] args) {
		stackTest();

	}
	
	public static void stackTest() {
		MyStack stack = new MyStack(10);
		Scanner input = new Scanner(System.in);
		int choice;
		boolean flag=true;
		String userString;

		
		do {
			System.out.println();
			System.out.println("Please choose a number below: ");
			System.out.println("1 - PUSH a string to the stack.");
			System.out.println("2 - POP the top data element from the stack.");
			System.out.println("3 -PEEK to top data element in the stack.");
			System.out.println("4 -EXIT the program.");
			choice = input.nextInt();
			if(choice==1) {
				System.out.println("Enter the a string you want to push to the stack: ");
				userString = input.next();//Can't take spaces i.e. Multiple words in one string
				stack.push(userString);
			}else if(choice==2) {
				stack.pop();
			}else if(choice==3) {
				stack.peek();
			}else {
				if(choice==4) {
					System.out.println("System Terminated..");
					
				}else {
					System.out.println("Please try again..");
				}
				flag = false;
				input.close();
			}
		}while(flag==true);
		
	}

}