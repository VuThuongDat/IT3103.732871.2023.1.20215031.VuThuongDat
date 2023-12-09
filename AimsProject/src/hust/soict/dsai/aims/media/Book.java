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
			System.out.println("Author " + authorname +" is already in the list!");
		}
		else {
			authors.add(authorname);
			System.out.println("Successfully added " + authorname+ " to list!");
		}
	}
	 public void removeAuthor(String authorname) {
			if(authors.contains(authorname)) {
				authors.remove(authorname);
				System.out.println("Successfully removed " + authorname+" from the list!" );
			}
			else {
				System.out.println("Author " + authorname +" does not exist in the list!");
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
