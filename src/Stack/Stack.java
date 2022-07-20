package Stack;

public class Stack {
	 protected Node head ;
	    protected int size ;

	    /*  Constructor  */
	    public void Stack()
	    {
	        head = null;
	        size = 0;
	    }
	    /*  Function to check if stack is empty */
	    public boolean isEmpty()
	    {
	        return head == null;
	    }
	    /*  Function to get the size of the stack */
	    public int getSize()
	    {
	        return size;
	    }
	    /*  Function to push an element to the stack */
	    public void push(int data)
	    {
	        Node newNode = new Node (data, null);
	        if (head == null)
	            head = newNode;
	        else
	        {
	            newNode.setLink(head);
	            head = newNode;
	        }
	        size++ ;
	    }
	    /*  Function to display the status of the stack */
	    public void display()
	    {
	        System.out.print("\nStack : ");
	        if (size == 0)
	        {
	            System.out.print("Empty\n");
	            return ;
	        }
	        Node temp = head;
	        while (temp != null)
	        {
	            System.out.print(temp.getData()+" ");
	            temp = temp.getLink();
	        }
	        System.out.println();
	    }
}
