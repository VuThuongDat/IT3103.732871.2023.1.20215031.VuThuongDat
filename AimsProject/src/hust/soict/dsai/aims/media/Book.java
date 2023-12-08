//Vu Thuong Dat 20215031
package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;
public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	public Book(String title, String category,List<String> authors,float cost) {
		super(title, category, cost);
		this.authors=authors;
	}
	public void addAuthor(String authorname) {
		if(authors.contains(authorname)){
			System.out.println("Tac gia " + authorname +" da co trong danh sach!");
		}
		else {
			authors.add(authorname);
			System.out.println("Them thanh cong " + authorname+ " vao danh sach!");
		}
	}
	 public void removeAuthor(String authorname) {
			if(authors.contains(authorname)) {
				authors.remove(authorname);
				System.out.println("Xoa thanh cong " + authorname+" khoi danh sach!" );
			}
			else {
				System.out.println("Tac gia " + authorname +" khong co trong danh sach!");
			}
	 }
	 public String toString() {
		    StringBuilder result = new StringBuilder();
		    result.append(String.format("ID: %d - %s - %s - ", getId(), getTitle(), getCategory()));
		    for (String author : authors) {
		        result.append(author).append(". ");
		    }
		    result.append(String.format("- %.2f $", getCost()));
		    return result.toString();
		}
}
