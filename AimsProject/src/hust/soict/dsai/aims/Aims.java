//Vu Thuong Dat 20215031
package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
public class Aims {
	public static void main(String[] args) {
		var anOrder = new Cart();
		DigitalVideoDisc[] dvdList = new DigitalVideoDisc[19];
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
		
		dvdList[0] = dvd1;
		dvdList[1] = dvd2;
		
		anOrder.addMedia(dvdList);
		anOrder.addMedia(dvd3, dvd4);
		System.out.println("Tong so tien phai tra la ");
		System.out.println(anOrder.totalCost());
	}
}