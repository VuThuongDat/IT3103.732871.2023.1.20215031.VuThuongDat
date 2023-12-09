//Vu Thuong Dat 20215031
package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.Collections;
import hust.soict.dsai.aims.media.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.media.MediaComparatorByTitleCost;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
			System.out.println("Cart is full");
			return;
		}

		if (itemsOrdered.contains(media)) {
			System.out.println("Can't add because " + media.getTitle() + " is already in the cart!");
			return;
		}
		itemsOrdered.add(media);
		System.out.println("Successfully added " + media.getTitle() + " (ID: " + media.getId() + ") to cart!");
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
			System.out.println("Cart is empty");
			return;
		}

		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("Successfully removed " + media.getTitle() + " (ID: " + media.getId() + ") from the store!");
		} else {
			System.out.println("Cannot remove because " + media.getTitle() + " does not exist in the cart!");
		}
	}
	
	public void removeMedia() {
			itemsOrdered.clear();
	}
	public float totalCost() {
		float totalCost = 0f;
		for (Media media : itemsOrdered) {
			totalCost += media.getCost();
		}
		return totalCost;
	}
	
	public void printCart() {
		System.out.println("***********************CART***********************");
		if (!itemsOrdered.isEmpty()) {
			for (Media media : itemsOrdered) {
				System.out.println(media.printMedia());
			}
		} else {
			System.out.println("Cart is empty!");
		}
		System.out.println("Total cost: " +String.format("%.2f",totalCost()) + " $");
		System.out.println("***************************************************");
	}
	
	public Media searchMedia(int id) {
		for (Media media : itemsOrdered) {
			if (media.isMatch(id)) return media;
		}
		return null;
	}
	
	public Media searchMedia(String title) {
		for (Media media : itemsOrdered) {
			if (media.isMatch(title)) return media;
		}
		return null;
	}
	
	public void sortCartByTitle() {
		Collections.sort(itemsOrdered, new MediaComparatorByTitleCost());
	}
	
	public void sortCartByCost() {
		Collections.sort(itemsOrdered, new MediaComparatorByCostTitle());
	}	
}

	