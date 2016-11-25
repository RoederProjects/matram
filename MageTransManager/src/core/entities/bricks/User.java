package core.entities.bricks;

public class User {

	private String userName;
	private String userPass;
	
	/**
	 * @param userName
	 * @param userPass
	 */
	public User(String userName, String userPass) {
		this.userName = userName;
		this.userPass = userPass;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userPass
	 */
	public String getUserPass() {
		return userPass;
	}

	/**
	 * @param userPass the userPass to set
	 */
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	
}
