
public class DHS_DLL_Tester {
	@SuppressWarnings("rawtypes")
	static DoublyLinkedList l;
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		l = new DoublyLinkedList();
		l.add("Abe");
		l.add("Ben");
		l.add("Charlie");
		l.add("Dan");
		l.add("Ethelwulf");
		j("Initial");
		l.delete(2);
		j(" after l.delete(2)");
		l.insert(1, "Frank");
		j(" after l.insert(1, \"Frank\")");
		l.set(0, "Anvil");
		j(" after l.set(0, \"Anvil\")");
		l.insert(0, "Aardvark");
		j(" after l.insert(0, \"Aardvark\")");
		//check for out of bounds error on delete negative
		try{
			l.delete(-3);
			j(" after l.delete(-3)");
		}catch(LocationOutOfBounds e){
			System.out.println("" + e.getMessage()+"\n");
		}
		//check for out of bounds error on delete to large
		try{
			l.delete(8);
			j(" after l.delete(8)");
		}catch(LocationOutOfBounds e){
			System.out.println("" + e.getMessage()+"\n");
		}
		//check deleting tail
		try{
			l.delete(5);
			j(" after l.delete(5)");
		}catch(LocationOutOfBounds e){
			System.out.println("" + e.getMessage()+"\n");
		}
		//check deleting head
		try{
			l.delete(0);
			j(" after l.delete(0)");
		}catch(LocationOutOfBounds e){
			System.out.println("" + e.getMessage()+"\n");
		}
		//check for inserting out of bounds negative
		try{
			l.insert(-3, "Ere");
			j(" after l.insert(-3, \"Ere\")");
		}catch(LocationOutOfBounds e){
			System.out.println("" + e.getMessage() +"\n");
		}
		//check for inserting out of bounds to large
		try{
			l.insert(8, "Ultimate");
			j(" after l.insert(8, \"Ultimate\")");
		}catch(LocationOutOfBounds e){
			System.out.println("" + e.getMessage()+"\n");
		}
		//check for inserting tail
		try{
			l.insert(3, "Ultimate");
			j(" after l.insert(3, \"Ultimate\")");
		}catch(LocationOutOfBounds e){
			System.out.println("" + e.getMessage() +"\n");
		}
		//check for setting out of bounds negative
		try{
			l.set(8, "Ultimate");
			j(" after l.set(8, \"Ultimate\")");
		}catch(LocationOutOfBounds e){
			System.out.println("" + e.getMessage()+"\n");
		}
		//check for setting out of bounds to large
		try{
			l.set(-3, "Ere");
			j(" after l.set(-3, \"Ere\")");
		}catch(LocationOutOfBounds e){
			System.out.println("" + e.getMessage() +"\n");
		}
	}
	public static void j(String lab) {
		System.out.println(lab);
		l.traverse();

	}

}