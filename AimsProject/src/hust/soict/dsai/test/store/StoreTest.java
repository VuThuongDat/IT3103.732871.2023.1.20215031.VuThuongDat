//Vu Thuong Dat 20215031
package hust.soict.dsai.test.store;
import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;
public class StoreTest {
	private static List<Track> tracks;
	private static List<String> authors;
	public static void main(String[] args) {
		Store anOrder = new Store();
		
		Media[] mediaList = new Media[3];

		Media media1 = new DigitalVideoDisc("The Lion King", "Animation", "John Director", 87,  19.95f);
		authors= new ArrayList<>();
		authors.add("Antoine de Saint-Exupéry");
		Media media2 = new Book("The little prince","Animation",authors, 18.15f);
		authors= new ArrayList<>();
		authors.add("Antoine de Saint-Exupéry");
		tracks = new ArrayList<>();
		tracks.add(new Track("I do", 5));
		tracks.add(new Track("The night", 3));
		Media media3 = new CompactDisc("Music", "US-UK","Artist X", tracks , 20.81f);
		
		mediaList[0] = media1;
		mediaList[1] = media2;
		mediaList[2] = media3;

		anOrder.addMedia(media1);
		anOrder.addMedia(media2);
		anOrder.addMedia(media3);

		anOrder.printStore();
		anOrder.removeMedia(media2);
		anOrder.printStore();
		anOrder.searchStore(2);
		anOrder.searchStore("M");
	}
	
}
