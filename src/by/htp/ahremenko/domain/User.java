package by.htp.ahremenko.domain;

public class User {
	private String name;
	private String login;
	private String password;
	{
		this.password = "123";
	}
	public User (String l) {
		login = l;
		name = l+" "+password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
