package Start;
import client.Registration;
public class mainclass {
public static void main(String[] args) {
	Registration reg = new Registration();
	reg.submit("Harsha",876543,"harsha@",23,123);
	System.out.print(reg);
}
}
