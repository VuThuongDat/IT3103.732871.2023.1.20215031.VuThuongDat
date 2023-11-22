//Vu Thuong Dat 20215031
package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Store {
	private DigitalVideoDisc itemStore[];
	private int qtyItem;

	public Store(int MAX_NUMBER_ITEM) {
		itemStore = new DigitalVideoDisc[MAX_NUMBER_ITEM];
		qtyItem = 0;
	}

	public void addDVD(DigitalVideoDisc dvd) {
		if (qtyItem < itemStore.length) {
			itemStore[qtyItem] = dvd;
			qtyItem++;
			System.out.println("Them thanh cong " + dvd.getTitle());
		} else {
			System.out.println("Khong the them " + dvd.getTitle() +"vi cua hang da day!!");
		}
	}

	public void removeDVD(DigitalVideoDisc dvd) {
		boolean check = false; 
		for (int i = 0; i < qtyItem; i++) {
			if (itemStore[i].equals(dvd)) {
				check = true;
				for (int j = i; j < qtyItem - 1; j++) {
					itemStore[j] = itemStore[j + 1];
				}
				qtyItem--;
				System.out.println("Da xoa " + dvd.getTitle());
				break;
			}
		}

		if (!check) {
			System.out.println("Khong tim thay " + dvd.getTitle());
		}
	}

	public void displayStore() {
		System.out.println("********** STORE **********");
		for (int i = 0; i < qtyItem; i++) {
			System.out.println((i + 1) + ". " + itemStore[i].toString());
		}
		System.out.println("***************************");
	}
}
