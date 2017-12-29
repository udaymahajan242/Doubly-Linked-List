//Doubly-link by Uday Mahajan
//(Location out of Bounds- unchecked exception)

public class LocationOutOfBounds extends RuntimeException {
	String message;

	public LocationOutOfBounds(String Message) {
		super(Message);
		this.message = Message;
	}

}
