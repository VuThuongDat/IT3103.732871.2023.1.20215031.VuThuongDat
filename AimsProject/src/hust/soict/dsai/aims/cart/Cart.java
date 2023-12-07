//Vu Thuong Dat 20215031
package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private static int nextId = 1;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
			System.out.println("Gio hang da day");
			return;
		}

		if (itemsOrdered.contains(media)) {
			System.out.println("Khong the them vi " + media.getTitle() + " da co trong gio hang!");
			return;
		}

		media.setId(nextId++);
		itemsOrdered.add(media);
		System.out.println("Them thanh cong: " + media.getTitle() + " (ID: " + media.getId() + ")");
		return;
	}
	public void addMedia(Media... mediaList) {
		for (Media media : mediaList) {
			addMedia(media);
		}
	}
	public void addMedia (Media media1, Media media2) {
		addMedia(media1);
		addMedia(media2);
	}
	public void removeMedia(Media media) {
		if (itemsOrdered.isEmpty()) {
			System.out.println("Gio hang trong");
			return;
		}

		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("Xoa thanh cong " + media.getTitle() + " (ID: " + media.getId() + ")");
		} else {
			System.out.println("Khong the xoa vi " + media.getTitle() + " khong co trong gio hang");
		}
	}
	
	public float totalCost() {
		float totalCost = 0f;
		for (Media media : itemsOrdered) {
			totalCost += media.getCost();
		}
		return totalCost;
	}
	
	public void displayCart() {
		if(itemsOrdered.size()!=0) {
			for(Media media: itemsOrdered) {
				media.printDetail();
			}
		}
		else {
			System.out.println("Gio hang trong!!!");
			
		}
		
		System.out.println("Tong tien : " + totalCost() + "\n\n");
	}
	
	public void searchCart(int id) {
		for (Media media : itemsOrdered) {
			if (media.isMatch(id)) {
				media.printDetail();
				return;
			}
			System.out.println("Khong tim thay '" + id + "'");
			return;
		}
	}

	public void searchCart(String title) {
		for (Media media : itemsOrdered) {
			if (media.isMatch(title)) {
				media.printDetail();
			}
			return;
		}
		System.out.println("Khong tim thay '" + title + "'");
		return;
	}
}

	