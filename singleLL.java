package linkedlist;

public class singleLL 
{
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node head;
	//creating a LL
	public void create(int[]arr)
	{
		for(int i = 0; i < arr.length ; i++)
		{
			insertEnd(arr[i]);
		}
		
	}
	
	//inserting at beginning
	public void insertBeg(int data)
	{
		Node newnode = new Node(data);
		if(head==null) {
			head = newnode;
		}
		else 
		{
			newnode.next = head;
			head = newnode;
		}
		display();
	}
	
	// insert at end
	public void insertEnd(int data)
	{
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
		}
		else {
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = newnode;
		}
		display();
	}
	
	//insert at any position
	public void insertPos(int data , int position)
	{
		Node newnode = new Node(data);
		if(head==null)
		{
			head = newnode;
		}
		else {
			Node temp = head;
			int tempposition=0;
			while(tempposition!=position-1)
			{
				temp = temp.next;
				tempposition++;
			}
			newnode.next = temp.next;
			temp.next = newnode;
		}
		display();
	}
	
	//deletion at beginning
	public void delBeg()
	{
		if(head==null)
		{
			System.out.println("LL is empty");
		}
		head =  head.next;
		display();
	}
	
	//delete at end
	public void delEnd()
	{
		if(head == null)
		{
			System.out.println("LL is empty");
			return;
		}
		if(head.next == null)
		{
			head = null;
			return;
		}
		Node secondlast = null;
		Node temp = head;
		while(temp.next != null)
		{
			secondlast = temp;
			temp = temp.next;
		}
		secondlast.next = null;
		
		display();
	}
	
	//delete at any position
	public void delPos(int position)
	{
		if(head ==  null)
		{
			System.out.println("LL is empty");
			return;
		}
		if(position < 0)
		{
			System.out.println("Invalid position");
		}
		if(position == 0)
		{
			head = head.next;
			return;
		}
		Node temp = head;
		Node secondlast = null;
		int tempposition = 0;
		
		while(tempposition < position)
		{
			secondlast = temp;
			temp = temp.next;
			tempposition++;
		}
		secondlast.next = temp.next;
		
		display();
	}
	//display of LL
	public void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	

	public static void main(String[] args) 
	{
		singleLL list = new singleLL();
		list.create(new int[] {10 , 20 , 30 , 40 , 50});
		System.out.print("Insertion at beginning : ");
		list.insertBeg(0);
		System.out.print("Insertion at end : ");
		list.insertEnd(60);
		System.out.print("Insertion at given position : ");
		list.insertPos(45, 5);
		System.out.print("Final LL : ");
		list.display();
		System.out.print("Deletion of first node : ");
		list.delBeg();
		System.out.print("Deletion of last node : ");
		list.delEnd();
		System.out.print("Deletion at any position : ");
		list.delPos(4);
		System.out.print("Final LL after deletion : ");
		list.display();
		
	}

}
