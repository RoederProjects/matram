package core.entities.bricks;

/**
 * Class Store(ShopType)
 * 
 * @author Timo Röder	
 * @version 1.0
 * @datum 24.11.2016
 * @category brick
 */
public class Store {

	public String url;
	public String shopSys;
	
	
	public Store(String url, String shopSys) {
		super();
		this.url = url;
		this.shopSys = shopSys;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getShopSys() {
		return shopSys;
	}
	public void setShopSys(String shopSys) {
		this.shopSys = shopSys;
	}
}
