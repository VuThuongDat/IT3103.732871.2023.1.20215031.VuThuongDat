//Vu Thuong Dat 20215031
package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc {
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category,director, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}
	public String toString() {
		return String.format("%s - %s - %s - %d: %.2f $", getTitle(), getCategory(), getDirector(), getLength(), getCost());
	}
}
	
