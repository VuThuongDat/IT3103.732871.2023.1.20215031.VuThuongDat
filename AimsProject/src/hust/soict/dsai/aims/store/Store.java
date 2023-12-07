//Vu Thuong Dat 20215031
package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
public class Store {
	private ArrayList<Media> itemsInStore;
	private int MAX_SIZE = 20 ;
	private static int nextId = 1;
	public Store() {
        itemsInStore = new ArrayList<>(MAX_SIZE);
    }
	public void addMedia(Media media) {
		if (itemsInStore.size() >= MAX_SIZE) {
			System.out.println("Cua hang da day");
			return;
		}

		if (itemsInStore.contains(media)) {
			System.out.println("Khong the them vi " + media.getTitle() + " da co trong cua hang!");
			return;
		}
		media.setId(nextId++);
		System.out.println("Them thanh cong: " + media.getTitle() + "vao cua hang!");
		return;
	}
	public void removeMedia(Media media) {
		if (itemsInStore.isEmpty()) {
			System.out.println("Gio hang trong");
			return;
		}

		if (itemsInStore.contains(media)) {
			itemsInStore.remove(media);
			System.out.println("Xoa thanh cong " + media.getTitle() + "khoi cua hang");
		} else {
			System.out.println("Khong the xoa vi " + media.getTitle() + " khong co trong cua hang!");
		}
	}
	public void DisplayStore() {
        System.out.println("********** STORE **********");
        if(itemsInStore.size()!=0) {
        	for(Media media: itemsInStore) {
    			media.printDetail();
    		}
    	}
    		else {
    			System.out.println("Cua hang trong!!!");
        }
        System.out.println("***************************");
    }
	public void searchStore(int id) {
		for (Media media : itemsInStore) {
			if (media.isMatch(id)) {
				media.printDetail();
				return;
			}
			System.out.println("Khong tim thay '" + id + "'");
			return;
		}
	}

	public void searchStore(String title) {
		for (Media media : itemsInStore) {
			if (media.isMatch(title)) {
				media.printDetail();
			}
			return;
		}
		System.out.println("Khong tim thay '" + title + "'");
		return;
	}
	
}
