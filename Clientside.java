package client;
import Server.InvailAgeException;
import Server.Serverside;
public class Clientside {
	final static private Serverside c1= new Serverside();
	void senddata(int i) throws InvailAgeException {
		System.out.print("sending registartion details to server");
		User usr = null;
		c1.receivedata(usr);
		
	}

}
