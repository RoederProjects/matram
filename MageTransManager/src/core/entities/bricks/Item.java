package core.entities.bricks;

import java.io.File;

/**
 * Class Item
 * 
 * @author Timo Röder	
 * @version 1.0
 * @datum 24.11.2016
 * @category brick
 */
public class Item extends GroupItem {
	
	private ItemType itemType;
	private String text;
	private String textHistoryFirst;
	private String textHistorySecond;
	private String textHistoryThird;
	private File attachedScreens; /** IMG-file to show usage in shops **/
	private int status;
	private int reviewState;
	/**
	 * @return the itemType
	 */
	public ItemType getItemType() {
		return itemType;
	}
	/**
	 * @param itemType the itemType to set
	 */
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the textHistoryFirst
	 */
	public String getTextHistoryFirst() {
		return textHistoryFirst;
	}
	/**
	 * @param textHistoryFirst the textHistoryFirst to set
	 */
	public void setTextHistoryFirst(String textHistoryFirst) {
		this.textHistoryFirst = textHistoryFirst;
	}
	/**
	 * @return the textHistorySecond
	 */
	public String getTextHistorySecond() {
		return textHistorySecond;
	}
	/**
	 * @param textHistorySecond the textHistorySecond to set
	 */
	public void setTextHistorySecond(String textHistorySecond) {
		this.textHistorySecond = textHistorySecond;
	}
	/**
	 * @return the textHistoryThird
	 */
	public String getTextHistoryThird() {
		return textHistoryThird;
	}
	/**
	 * @param textHistoryThird the textHistoryThird to set
	 */
	public void setTextHistoryThird(String textHistoryThird) {
		this.textHistoryThird = textHistoryThird;
	}
	/**
	 * @return the attachedScreens
	 */
	public File getAttachedScreens() {
		return attachedScreens;
	}
	/**
	 * @param attachedScreens the attachedScreens to set
	 */
	public void setAttachedScreens(File attachedScreens) {
		this.attachedScreens = attachedScreens;
	}
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return the reviewState
	 */
	public int getReviewState() {
		return reviewState;
	}
	/**
	 * @param reviewState the reviewState to set
	 */
	public void setReviewState(int reviewState) {
		this.reviewState = reviewState;
	}
	
	
	
}
