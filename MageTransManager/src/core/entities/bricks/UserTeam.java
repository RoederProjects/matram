package core.entities.bricks;

public class UserTeam {

	private String id;
	private String name;
	private User[] member;

	/**
	 * @param id
	 * @param name
	 * @param member
	 */
	public UserTeam(String id, String name, User[] member) {
		this.id = id;
		this.name = name;
		this.member = member;
	}

	/**
	 * @return the userTeamID
	 */
	public String getUserTeamID() {
		return id;
	}

	/**
	 * @param userTeamID the userTeamID to set
	 */
	public void setUserTeamID(String userTeamID) {
		this.id = userTeamID;
	}

	/**
	 * @return the userTeamName
	 */
	public String getUserTeamName() {
		return name;
	}

	/**
	 * @param userTeamName the userTeamName to set
	 */
	public void setUserTeamName(String userTeamName) {
		this.name = userTeamName;
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
