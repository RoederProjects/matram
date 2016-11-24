package core.entities.bricks;

/**
 * Class GroupItem
 * 
 * @author Timo Röder	
 * @version 1.0
 * @datum 24.11.2016
 */
public class GroupItem {

	private String itemIdentifier;
	private ItemCategory itemCategory;
	private Item[] includedItems;
	/**
	 * @return the itemIdentifier
	 */
	public String getItemIdentifier() {
		return itemIdentifier;
	}
	/**
	 * @param itemIdentifier the itemIdentifier to set
	 */
	public void setItemIdentifier(String itemIdentifier) {
		this.itemIdentifier = itemIdentifier;
	}
	/**
	 * @return the itemCategory
	 */
	public ItemCategory getItemCategory() {
		return itemCategory;
	}
	/**
	 * @param itemCategory the itemCategory to set
	 */
	public void setItemCategory(ItemCategory itemCategory) {
		this.itemCategory = itemCategory;
	}
	/**
	 * @return the includedItems
	 */
	public Item[] getIncludedItems() {
		return includedItems;
	}
	/**
	 * @param includedItems the includedItems to set
	 */
	public void setIncludedItems(Item[] includedItems) {
		this.includedItems = includedItems;
	}
	

}
