//Vu Thuong Dat 20215031
package hust.soict.dsai.aims.media;
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
	public CompactDisc(String artist ,String title,String category,String director, float cost) {
		super(title,category,director,cost);
		this.artist = artist;
	} 
	public CompactDisc(String artist, List<Track> tracks,String title,String category, String director,float cost) {
		super(title,category,director,cost);
		this.artist = artist;
		this.tracks = tracks;
	} 

	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("Ban nhac da co trong danh sach");
		}
		else {
			tracks.add(track);
			System.out.println("Them thanh cong");
		}
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Xoa thanh cong");
		}
		else {
			System.out.println("Ban nhac khong co trong danh sach");
		}
	}
	public int getLength() {
		int length = 0;
		for (Track track : tracks)
			length += track.getLength();
		return length;
	}
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());	
		for (Track track : tracks)
			track.play();		
	}
}
