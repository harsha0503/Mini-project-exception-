package Server;
import client.User;
public class Serverside {
	private static final Verify_user_age vua =new Verify_user_age();
	 public void receivedata1(User usr) throws InvailAgeException{
		 System.out.print("Receive data from client");
		 if(vua.vaildateAge(usr)!=true) {
			 System.out.print("Registration failed");
			 throw new InvailAgeException("Age should be grader 18");
		 }
		 else {
			 System.out.print("Registration success");
		 }
		 
	 }
	public void receivedata(User usr) {
		// TODO Auto-generated method stub
		
	}

}
