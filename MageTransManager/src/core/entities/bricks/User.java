package core.entities.bricks;

/**
 * Class User
 * 
 * @author Timo Röder	
 * @version 1.0
 * @datum 24.11.2016
 * @category brick
 */
public class User {

	private String userName;
	private String userPass;
	
	/**
	 * @param userName
	 * @param userPass
	 */
	public User() {
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
