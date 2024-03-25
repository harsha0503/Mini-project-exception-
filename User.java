package client;

public class User {
	private String name;
	private long phnoenum;
	private String email;
	private int age;
	private String password;
	public User(String name2, long phnoenum2, String email2, int age2, String password2) {
		super();
		this.name = name;
		this.phnoenum = phnoenum;
		this.email = email;
		this.age = age;
		this.password = password;
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhnoenum() {
		return phnoenum;
	}
	public void setPhnoenum(long phnoenum) {
		this.phnoenum = phnoenum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
