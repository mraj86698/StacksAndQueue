package Stack;

public class StackMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Stacks & Queue Program");

		/* Creating object of class linkedStack */
		Stack stack = new Stack();

		while (true) {
			/* Perform Stack Operations */
			System.out.println("Linked Stack Operations\n");
			System.out.println("1. push");
			System.out.println("Enter Your Choice:");
			int choice1 = Utility.inputInteger();
			switch (choice1) {
			case 1:

				System.out.println("How many items do u want to insert into the list: ");
				int totalItem3 = Utility.inputInteger();
				System.out.println("Enter integer element to push");
				for (int i = 0; i < totalItem3; i++) {
					int item2 = Utility.inputInteger();
					stack.push(item2);
				}
				break;

			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			/* display stack */
			stack.display();

		}
	}

}
