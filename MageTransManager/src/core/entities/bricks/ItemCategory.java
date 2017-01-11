package core.entities.bricks;

/**
 * Class ItemCategory
 * 
 * @author Timo Röder	
 * @version 1.0
 * @datum 24.11.2016
 * @category brick
 */
public class ItemCategory {

	private int itemCategoryID;
	private String itemCategoryName;
	/**
	 * @return the itemCategoryID
	 */
	public int getItemCategoryID() {
		return itemCategoryID;
	}
	/**
	 * @param itemCategoryID the itemCategoryID to set
	 */
	public void setItemCategoryID(int itemCategoryID) {
		this.itemCategoryID = itemCategoryID;
	}
	/**
	 * @return the itemCategoryName
	 */
	public String getItemCategoryName() {
		return itemCategoryName;
	}
	/**
	 * @param itemCategoryName the itemCategoryName to set
	 */
	public void setItemCategoryName(String itemCategoryName) {
		this.itemCategoryName = itemCategoryName;
	}
}
