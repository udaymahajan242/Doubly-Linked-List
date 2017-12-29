//Doubly-link by Uday Mahajan
//(Doubly Linked List)

public class DoublyLinkedList {
	Node head;
	Node tail;
	Node prev;

	public DoublyLinkedList() {
		head = null;
		tail = null;
		prev = null;

	}

	public void insert(int i, Object itemToInsert) {
		// Node to contain new item.

		Node newNode = new Node();
		newNode.data = itemToInsert;

		int count = 0;
		Node current = head;

		if (i >= size() | i < 0) {
			throw new LocationOutOfBounds("Sorry, Your i for insert is out of range. Please try again.");
		}

		if (i == 0) {
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				newNode.next = head;
				head.prev = newNode;
				head = newNode;
			}
		} else {

			while (head != null & i-1 != count) {
				count++;
				current = current.next;
			}
		
			Node temp = current.next;
			current.next = newNode;
			newNode.next = temp;
			temp.prev = newNode;
			newNode.prev = current;
			
		}
	}

	public void add(Object newThing) {

		Node newNode = new Node();

		newNode.data = newThing;
		newNode.next = null;

		if (head == null) {
			head = newNode;
			head.prev = null;
			head.next = null;
			
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
			newNode.next = null;
			tail = newNode;
			
		}
	}

	public void delete(int i) {
		
		int count = 0;

		Node current = head;
		Node previous = null;
		
		if (i >= size() | i < 0) {
			throw new LocationOutOfBounds("Sorry, Your i for delete is out of range. Please try again.");
		}

		if (i == 0) {

			head = head.next;
			head.prev = null;
		    
			
			
		} else {
			while (i != count) {
				current = current.next;
				previous=current;
				count++;
			}

			if (current.next == null) {
				current.prev.next = null;
				//current.prev=null;
				tail = current.prev;

			} else {
				
				current.prev.next = current.next;
				current.next.prev = current.prev;
				tail = current.next.next;
			

			}
		}

	}

	public Object get(int i) {

		Node traverse = head;
		// we don't need prev for this.
		int count = 0;

		if (i >= size() | i < 0) {
			throw new LocationOutOfBounds("Sorry, Your i for get is out of range. Please try again.");
		}

		else {

			while (traverse != null & i != count) {
				count++;
				traverse = traverse.next;
			}

			return traverse.data; // if we are here => we have found i and can
			// return the data from head

		}

	}
	
	// Size method to get the size. We just need to traverse and count so do not need previous.

	public int size() {
		int count = 0;
		Node traverse = head;
		// we don't actually need prev for this .

		while (traverse != null) {
			count++;
			traverse = traverse.next;
		}
		return count;

	}

	//  Set method is not required for assignment but required for tester to work.
	public Object set(int i, Object itemToSet) {

		Node traverse = head;
		int count = 0;
		
		if (i >= size() | i < 0) {
			throw new LocationOutOfBounds("Sorry, Your i for set is out of range. Please try again.");
		}

		if (i == 0) {
			traverse.data = itemToSet;
			return "Done: Successfully set the item at location " + i + " to " + itemToSet;

		} else {

			while (traverse != null & count != (i)) {
				count++;
				traverse = traverse.next;
			}
			if ((i) > count | i < 0 | traverse == null) {
				// do nothing
				return "Error: Location is out of range";

			} else {
				traverse.data = itemToSet;
				return "Done: Successfully set the item at location " + i + " to " + itemToSet;
			}
		}

	}

	// Traverse method as provided by yourself
	public void traverse() {
		System.out.println("** Starting traverse ***");
		Node tmp = head;
		int i = 0;
		while (tmp != null) {
			System.out.println(i + ": " + tmp.data);
			i++;
			tmp = tmp.next;
		}

		System.out.println("** going back ***");
		
		tmp = tail;
		i = size() - 1;
		
		while (tmp != null) {
			System.out.println(i + ": " + tmp.data);
			i--;
			tmp = tmp.prev;
		}
		System.out.println("** traverse done ***");
		System.out.println();

	}

}
