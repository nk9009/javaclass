package member;

public class Member {
	private String userid, password, name;

	public Member() { 
		// TODO Auto-generated constructor stub
	}
	
	public void setUserId(String userid) {
		this.userid = userid;
	}
	public String getUserId() {
		return this.userid;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		return "[아이디: "+userid+", 비번: "+password+", 이름: "+name+"]";}
	}