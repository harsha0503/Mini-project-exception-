package Server;

public class InvailAgeException extends Exception  {
	public char[] message;

	public InvailAgeException (String message){
		super(message);
	}

}
