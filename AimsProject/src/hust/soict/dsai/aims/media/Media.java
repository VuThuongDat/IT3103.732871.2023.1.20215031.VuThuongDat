//Vu Thuong Dat 20215031
package hust.soict.dsai.aims.media;
public abstract class Media {
	private int id;
	private String title;
	private String category;
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
	public float getCost() {
		return cost;
	}
	public Media() {
		super();
	}
	public Media(String title){
		super();
		this.title = title;
	}
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
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
	public String toString() {
		return String.format("ID: %d - %s - %s - %f $\n",this.id, this.title, this.category, this.cost);
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Media))
			return false;
			return this.id == ((Media) obj).id;
	}
}
