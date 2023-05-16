package vo;

public class P_orderVO {

	private int no;
	private int menu_no;
	private String id;
	private String store;
	private int price;
	private String menu_name;
	private String category;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getMenu_no() {
		return menu_no;
	}
	public void setMenu_no(int menu_no) {
		this.menu_no = menu_no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "P_orderVO [no=" + no + ", menu_no=" + menu_no + ", id=" + id + ", store=" + store + ", price=" + price
				+ ", menu_name=" + menu_name + ", category=" + category + "]";
	}
	
}
