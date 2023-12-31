//Vu Thuong Dat 20215031
package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.List;
public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public String getArtist() {
		return artist;
	}
	public CompactDisc(String artist, List<Track> tracks) {
		super();
		this.artist = artist;
		this.tracks = tracks;
	}
	public CompactDisc(String title,String category,String artist, List<Track> tracks,float cost) {
		super(title,category,cost);
		this.artist = artist;
		this.tracks = tracks;
	} 

	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("Track " + this.getTitle() + " is already in the list!");
		}
		else {
			tracks.add(track);
			System.out.println("Successfully added " + this.getTitle() + " to list!");
		}
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Successfully removed " + this.getTitle()+ " from the list!");
		}
		else {
			System.out.println("Track "+ this.getTitle() +" does not exist in the list");
		}
	}
	public int getLength() {
		int length = 0;
		for (Track track : tracks)
			length += track.getLength();
		return length;
	}
	public String toString() {
	    StringBuilder result = new StringBuilder();
	    result.append(String.format("ID: %d - %s - %s - ", getId(), getTitle(),getCategory()));
	    for (Track track : tracks) {
	        result.append(track.getTitle()).append(". ");
	    }
	    result.append(String.format("- %s - %d - %.2f $", getArtist(), getLength(),getCost()));
	    return result.toString();
	}
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());	
		for (Track track : tracks)
			track.play();		
	}

}
