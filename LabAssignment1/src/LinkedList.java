
public class LinkedList<E> implements ILinkedList<E> {

	public Node head;	

	public class Node{

		public Node next = null;
		public E item;

		Node(E item) {
		this.item = item;
			
		}

	}

	@Override
	public void add(E item) {
		// TODO Auto-generated method stub
		if (head == null)
			head = new Node(item);
		else {
			Node iterator = head;
			while (iterator.next != null)				 

				iterator = iterator.next;
				iterator.next = new Node(item);							
		}

	}
	public E get(int index){
		Node iterator = head;
		int counter = 0;
		while(iterator != null){
		if(counter == index) { 
			return iterator.item; }
		counter++;
		iterator = iterator.next;
          }
		return iterator.item;							
		}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		if (head != null) {
			Node iterator = head; // Call by Reference!
			while (iterator != null) {		
				System.out.print(iterator.item + " ");
				iterator = iterator.next;
			}
		}

	}

}
