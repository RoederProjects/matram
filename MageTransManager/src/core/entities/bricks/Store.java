package core.entities.bricks;

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
