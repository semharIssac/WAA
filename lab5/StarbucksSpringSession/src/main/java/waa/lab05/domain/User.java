package waa.lab05.domain;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 748392349L;
	
	private String userName;
	private String password;
	
	public User() {}
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof User)) return false;
		User userObj = (User) obj;
		return (
				this.userName.equals(userObj.getUserName())) && 
				(this.password.equals(userObj.getPassword())
		);
	}
}
