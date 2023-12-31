//Vu Thuong Dat 20215031
package hust.soict.hedspi.aims.store;
import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Media;
public class Store {
	private ArrayList<Media> itemsInStore;
	private int MAX_SIZE = 20 ;
	private static int nextId = 1;
	public Store() {
        itemsInStore = new ArrayList<>(MAX_SIZE);
    }
	public void addMedia(Media media) {
		if (itemsInStore.size() >= MAX_SIZE) {
			System.out.println("Store is full");
			return;
		}

		if (itemsInStore.contains(media)) {
			System.out.println("Can't add because " + media.getTitle() + " is already in the store!");
			return;
		}

		media.setId(nextId++);
		itemsInStore.add(media);
		System.out.println("Successfully added " + media.getTitle() + " (ID: " + media.getId() + ") to store!");
		return;
	}
	public void removeMedia(Media media) {
		if (itemsInStore.isEmpty()) {
			System.out.println("Store is empty");
			return;
		}

		if (itemsInStore.contains(media)) {
			itemsInStore.remove(media);
			System.out.println("Successfully removed " + media.getTitle() + " (ID: " + media.getId() + ") from the store!");
		} else {
			System.out.println("Cannot remove because " + media.getTitle() + " does not exist in the store!");
		}
	}
	public void printStore() {
        System.out.println("********** STORE **********");
        if(!itemsInStore.isEmpty()) {
        	for(Media media: itemsInStore) {
        		System.out.println(media.printMedia());
    		}
    	}
    		else {
    			System.out.println("Store is empty!");
        }
        System.out.println("***************************");
    }
	public Media searchMedia(int id) {
		for (Media media : itemsInStore) {
			if (media.isMatch(id)) System.out.println(media.printMedia());
		}
		return null;
	}
	
	public Media searchMedia(String title) {
		for (Media media : itemsInStore) {
			if (media.isMatch(title)) return media;
		}
		return null;
	}
	
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
}
