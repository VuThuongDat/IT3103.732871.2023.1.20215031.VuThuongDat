
public class DigitalVideoDisc {
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public DigitalVideoDisc(String title) {
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		this(title);
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this(title, category, cost);
		this.director = director;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this(title, category, director, cost);
		this.length = length;
	}
	

	public String toString() {
		return String.format("%s - %s - %s - %d: %.2f $", getTitle(), getCategory(), getDirector(), getLength(), getCost());
	}
	
	public boolean equals(DigitalVideoDisc disc) {
		return this.getTitle().equals(disc.getTitle());
	}
	public boolean isMatch(int id) {
 		return this.id == id;
 	}
	public boolean isMatch(String title) {
		String[] tmp = title.split(" ", 0);
		for (String x : tmp) {
			if (getTitle().toLowerCase().contains(x.toLowerCase()))
				return true;
		}
		return false;
	}
}

