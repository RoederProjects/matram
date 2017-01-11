package core.entities.bricks;

/**
 * Class ItemType
 * 
 * @author Timo Röder	
 * @version 1.0
 * @datum 24.11.2016
 * @category brick
 */
public class ItemType {
	
	private int countryCodeID;
	private String countryCode;
	private boolean enabled;
	private boolean enabledFormatting;
	private boolean enabledExport;
	/**
	 * @return the countryCodeID
	 */
	public int getCountryCodeID() {
		return countryCodeID;
	}
	/**
	 * @param countryCodeID the countryCodeID to set
	 */
	public void setCountryCodeID(int countryCodeID) {
		this.countryCodeID = countryCodeID;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}
	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	/**
	 * @return the enabledFormatting
	 */
	public boolean isEnabledFormatting() {
		return enabledFormatting;
	}
	/**
	 * @param enabledFormatting the enabledFormatting to set
	 */
	public void setEnabledFormatting(boolean enabledFormatting) {
		this.enabledFormatting = enabledFormatting;
	}
	/**
	 * @return the enabledExport
	 */
	public boolean isEnabledExport() {
		return enabledExport;
	}
	/**
	 * @param enabledExport the enabledExport to set
	 */
	public void setEnabledExport(boolean enabledExport) {
		this.enabledExport = enabledExport;
	}
}
