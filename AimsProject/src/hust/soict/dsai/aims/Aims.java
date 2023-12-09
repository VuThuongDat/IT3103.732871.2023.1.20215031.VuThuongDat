//Vu Thuong Dat 20215031
package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Aims {
	private static final Scanner scanner = new Scanner(System.in);
	private static Store store = new Store();
	private static Cart cart = new Cart();
	static class ConsoleMenu {
		public static void showMenu() {
			System.out.println("AIMS ");
			System.out.println("--------------------------------");
			System.out.println("1. View store");
			System.out.println("2. Update store");
			System.out.println("3. See current cart");
			System.out.println("0. Exit");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3");
		}
		public static void storeMenu() {
			System.out.println("Options:	 ");
			System.out.println("--------------------------------");
			System.out.println("1. See a media's details");
			System.out.println("2. Add a media to cart");
			System.out.println("3. Play a media");
			System.out.println("4. See current cart");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3-4");
		}
		public static void mediaDetailsMenu() {
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Add to cart");
			System.out.println("2. Play");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2");
		}
		public static void updateStoreMenu() {
			System.out.println("Update store - Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Add a media to store");
			System.out.println("2. Remove a media from store");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2");
		}
		public static void cartMenu() {
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Filter medias in cart");
			System.out.println("2. Sort medias in cart");
			System.out.println("3. Remove media from cart");
			System.out.println("4. Play a media");
			System.out.println("5. Place order");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3-4-5");
		}
		public static void filterCartMenu() {
			System.out.println("Filter cart - Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Filter by id");
			System.out.println("2. Filter by title");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2");
		}
		public static void sortCartMenu() {
			System.out.println("Sort cart - Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Sort by title");
			System.out.println("2. Sort by cost");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2");
		}
		public static void addMediaMenu() {
			System.out.println("Add new media - Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Add a new book");
			System.out.println("2. Add a new CD");
			System.out.println("3. Add a new DVD");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3");
		}

		public static void start() {
			while (true) {
				showMenu();
				switch (scanner.nextInt()) {
					case 1:
						viewStore();
						break;
					case 2:
						updateStore();
						break;
					case 3:
						viewCart();
						break;
					case 0:
						System.out.println("Exited!");
						return;
					default:
						System.out.println("Invalid choice!");
						break;
				}
			}
		}
		
		private static void viewStore() {
			store.printStore();
			Media fMedia;
			while (true) {
				storeMenu();
				switch (scanner.nextInt()) {
					case 1:
						System.out.println("Enter the title of media you want to see details: ");
						scanner.nextLine();
						fMedia = store.searchMedia(scanner.nextLine());
						if (fMedia == null) {
							System.out.println("Media  not found!");
						} else {
							System.out.println(fMedia.toString());
							mediaDetails(fMedia);
						}
						break;
					case 2:
						System.out.println("Enter the title of media you want to add to cart: ");
						scanner.nextLine();
						fMedia = store.searchMedia(scanner.nextLine());
						if (fMedia == null) {
							System.out.println("Media  not found!");
						} else {
							cart.addMedia(fMedia);
						}
						break;
					case 3:
						System.out.println("Enter the title of media you want to play: ");
						scanner.nextLine();
						fMedia = store.searchMedia(scanner.nextLine());
						if (fMedia == null) {
							System.out.println("Media  not found!");
						} else {
							if ((fMedia instanceof DigitalVideoDisc)||(fMedia instanceof CompactDisc)) {
								fMedia.play();
							} else {
								System.out.println("Media is not DVD or CD. Can't play!");
							}
						}
						break;
					case 4:
						cart.printCart();
						break;
					case 0:
						return;
					default:
						System.out.println("Invalid choice!");
						break;
				}
			}
		}
		private static void mediaDetails(Media media) {
			while (true) {
				mediaDetailsMenu();
				switch (scanner.nextInt()) {
					case 1:
						cart.addMedia(media);
						break;
					case 2:
						if ((media instanceof DigitalVideoDisc)||(media instanceof CompactDisc)) {
							media.play();
						} else {
							System.out.println("Media is not DVD or CD. Can't play!");
						}
						break;
					case 0:
						return;
					default:
						System.out.println("Invalid choice!");
						break;
				}
			}
		}
		private static void updateStore() {
			while(true) {
				updateStoreMenu();
				switch (scanner.nextInt()) {
					case 1:
						addMedia();
						break;
					case 2:
						System.out.println("Enter the title of media you want to remove from store: ");
						scanner.nextLine();
						Media fMedia = store.searchMedia(scanner.nextLine());
						store.removeMedia(fMedia);
						break;
					case 0:
						return;
					default:
						System.out.println("Invalid choice!");
						break;
				}
			}
		}
		private static void addMedia() {
			while(true) {
				addMediaMenu();
				switch (scanner.nextInt()) {
					case 1:{
						List<String> authors= new ArrayList<>();
						System.out.println("Enter new book informations: ");
						System.out.println("Title: ");
						scanner.nextLine();
						String title1 = scanner.nextLine();
						System.out.println("Category: ");
						String category1 = scanner.nextLine();
						System.out.println("Number of authors: ");
						int i= scanner.nextInt();
						scanner.nextLine();
						for (int j=1;j<=i;j++) {
							System.out.println("Author: ");
							authors.add(scanner.nextLine());
						}
						System.out.println("Cost: ");
						float cost1 = scanner.nextFloat();
						Media newBook = new Book(title1,category1,authors,cost1);
						store.addMedia(newBook);
						}
						break;
					case 2:
						System.out.println("Enter new CD informations: ");
						System.out.println("Title: ");
						scanner.nextLine();
						String title2 = scanner.nextLine();
						System.out.println("Category: ");
						String category2 = scanner.nextLine();					 
						System.out.println("Artist: ");
						String artist = scanner.nextLine();
						List<Track> tracks = new ArrayList<>();
						System.out.println("Number of tracks: ");
						int i= scanner.nextInt();
						for (int j=1;j<=i;j++) {
							System.out.println("Track: "+j);
							scanner.nextLine();
							tracks.add(new Track(scanner.nextLine(),scanner.nextInt()));
						}
						System.out.println("Cost: ");
						float cost2 = scanner.nextFloat();
						Media newCD = new CompactDisc(title2,category2,artist,tracks,cost2);
						store.addMedia(newCD);
						break;
					case 3:
						System.out.println("Enter new DVD informations: ");
						System.out.println("Title: ");
						scanner.nextLine();
						String title3 = scanner.nextLine();
						System.out.println("Category: ");
						String category3 = scanner.nextLine();
						System.out.println("Director: ");
						String director = scanner.nextLine();
						System.out.println("Length: ");
						int length = scanner.nextInt();
						System.out.println("Cost: ");
						float cost3 = scanner.nextFloat();
						Media newDVD = new DigitalVideoDisc(title3, category3, director,length, cost3);
						store.addMedia(newDVD);
						break;
					case 0:
						return;
					default:
						System.out.println("Invalid choice!");
						break;
				}
			}
		}
		private static void viewCart(){
			cart.printCart();
			while (true) {
				cartMenu();
				switch(scanner.nextInt()){
					case 1:
						filterCart();
						break;
					case 2:
						sortCart();
						break;
					case 3:
						System.out.println("Enter the title of media you want to remove from Cart: ");
						scanner.nextLine();
						Media fMedia = cart.searchMedia(scanner.nextLine());
						cart.removeMedia(fMedia);
						break;
					case 4:
						System.out.println("Enter the title of media you want to play: ");
						scanner.nextLine();
						fMedia = cart.searchMedia(scanner.nextLine());
						if (fMedia == null) {
							System.out.println("Media  not found!");
						} else {
							if ((fMedia instanceof DigitalVideoDisc)||(fMedia instanceof CompactDisc)) {
								fMedia.play();
							} else {
								System.out.println("Media is not DVD or CD. Can't play!");
							}
						}
						break;
					case 5:
						System.out.println("An order is created");
						cart.removeMedia();
						cart.printCart();
						break;
					case 0:
						return;
					default:
						System.out.println("Invalid choice!");
						break;
				}
			}
		}
		private static void filterCart(){
			while (true) {
				filterCartMenu();
				switch(scanner.nextInt()){
					case 1:
						break;
					case 2:						
						break;
					case 0:
						return;
					default:
						System.out.println("Invalid choice!");
						break;
				}
			}
		}
		private static void sortCart(){
			while (true) {
				sortCartMenu();
				switch(scanner.nextInt()){
					case 1:
						cart.sortCartByTitle();
						cart.printCart();
						break;
					case 2:
						cart.sortCartByTitle();
						cart.printCart();
						break;
					case 0:
						return;
					default:
						System.out.println("Invalid choice!");
						break;
				}
			}
		}
	}

	public static void main(String[] args) {
		ConsoleMenu.start();
	}
}