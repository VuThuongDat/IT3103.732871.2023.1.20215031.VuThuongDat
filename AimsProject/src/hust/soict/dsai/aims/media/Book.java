package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;
public class Book {
	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	public void addAuthor(String authorname) {
    	if(authors.contains(authorname)){
    		System.out.println("Tac gia da co trong danh sach");
    	}
    	else {
    		authors.add(authorname);
    		System.out.println("Them thanh cong");
    	}
    }
	 public void removeAuthor(String authorname) {
	    	if(authors.contains(authorname)) {
	    		authors.remove(authorname);
	    		System.out.println("Xoa thanh cong");
	    	}
	    	else {
	    		System.out.println("Tac gia khong co trong danh sach");
	    	}
	    }
}
