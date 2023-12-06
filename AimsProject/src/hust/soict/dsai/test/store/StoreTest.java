//Vu Thuong Dat 20215031
package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store(10);
		var dvd1 = new DigitalVideoDisc(
				"The Lion King",
				"Animation",
				"Roger Allers",
				87,
				19.95f
		);
		var dvd2 = new DigitalVideoDisc(
				"Star Wars",
				"Science Fiction",
				"George Lucas",
				87,
				24.95f
		);
		var dvd3 = new DigitalVideoDisc(
				"Aladdin",
				"Animation",
				"Piaka",
				92,
				18.99f
		);
		var dvd4 = new DigitalVideoDisc(
				"My Destiny",
				"Love",
				"Home Seckia",
				97,
				24.35f
		);
		
		store.addDVD(dvd1);
		store.addDVD(dvd2);
		store.addDVD(dvd3);

		store.displayStore();
		store.removeDVD(dvd2);
		store.displayStore();
	}
}
