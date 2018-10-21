package itemview;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "ITEM_MENU",schema = "test")
public class Item {

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name = "ITEM_ID")
	private int itemId;
	
	@Column(name = "ITEM_NAME")
	private String itemName;
	
	@Column(name = "ITEM_PRICE")
	private double itemPrice;
	
	@Column(name = "status")
	private String itemstatus;
	
	
	public String getItemstatus() {
		return itemstatus;
	}
	public void setItemstatus(String itemstatus) {
		this.itemstatus = itemstatus;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemstatus="
				+ itemstatus + "]";
	}
}
