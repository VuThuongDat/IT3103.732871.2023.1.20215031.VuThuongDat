//Vu Thuong Dat 20215031
package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this(title, category, director, cost);
		this.length = length;
	}
	public String toString() {
		return String.format("%s - %s - %s - %d: %.2f $", getTitle(), getCategory(), getDirector(), getLength(), getCost());
	}
}
	
