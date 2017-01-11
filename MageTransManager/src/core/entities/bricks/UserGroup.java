package core.entities.bricks;

/**
 * Class UserGroup
 * 
 * @author Timo Röder	
 * @version 1.0
 * @datum 24.11.2016
 * @category brick
 */
public class UserGroup {

	private int id;
	private String name;
	private User[] member;
	/**
	 * @param userGroupID
	 * @param userGroupName
	 * @param member
	 */
	public UserGroup(int userGroupID, String userGroupName, User[] member) {
		this.id = userGroupID;
		this.name = userGroupName;
		this.member = member;
	}
	/**
	 * @return the userGroupID
	 */
	public int getUserGroupID() {
		return id;
	}
	/**
	 * @param userGroupID the userGroupID to set
	 */
	public void setUserGroupID(int userGroupID) {
		this.id = userGroupID;
	}
	/**
	 * @return the userGroupName
	 */
	public String getUserGroupName() {
		return name;
	}
	/**
	 * @param userGroupName the userGroupName to set
	 */
	public void setUserGroupName(String userGroupName) {
		this.name = userGroupName;
	}
	/**
	 * @return the member
	 */
	public User[] getMember() {
		return member;
	}
	/**
	 * @param member the member to set
	 */
	public void setMember(User[] member) {
		this.member = member;
	}
	
}
