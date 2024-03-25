package Server;
import client.User;
public class Verify_user_age {
	boolean vaildateAge(User usr) {
		boolean result = false;
		if(usr.getAge()>=18) {
			result = true;
		}
		return result;
	}

}
