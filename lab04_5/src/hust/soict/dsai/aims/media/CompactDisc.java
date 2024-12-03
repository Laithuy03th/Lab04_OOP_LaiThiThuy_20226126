package hust.soict.dsai.aims.media;
import java.util.List;

import java.util.Scanner;

import java.util.ArrayList;

public class CompactDisc extends Disc  {

//	public CompactDisc(int id, String title, String category, float cost, int length, String director) {
//		super(id, title, category, cost, length, director);
//		// TODO Auto-generated constructor stub
//		
//	}
	

	
	private List<Track> tracks = new ArrayList<>();
	private String artist;

	
	public CompactDisc(int id, String title, String category, float cost, int length, String director,
			List<Track> tracks, String artist) {
		super(id, title, category, cost, length, director);
		this.tracks = tracks;
		this.artist = artist;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void addTrack(Track track) {
		if(!tracks.contains(track)) {
			tracks.add(track);
		}else {
			System.out.println("Track " + track.getTitle() + "is in the list");
			
		}
	}
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
		}else {
			System.out.println("Track " + track.getTitle() + "isn't in the list");
		}
	}
	
	public int getLength() {
	    int totalLength = 0;
	    for (Track track : tracks) {
	        totalLength += track.getLength();
	    }
	    return totalLength;
	}

	 public String toString() {
	        return "CompactDisc ID: " + getId() + "\nTitle: " + getTitle() + "\nCategory: " + getCategory() +
	               "\nCost: " + getCost() + "\nDirector: " + getDirector() + "\nArtist: " + artist +
	               "\nTotal Length: " + getLength() + " minutes" + "\nTracks: " + tracks;
	    }
	 
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   List<Track> trackList = new ArrayList<>();
	   System.out.println("so luong tracks: ");
	   int soLuongTrack = sc.nextInt();
	   sc.nextLine();
	   for(int i = 0;i<soLuongTrack;i++) {
		   System.out.println("nhap vao title " + i + ":");
		   String title = sc.nextLine();
//		   sc.nextLine();
		   System.out.println("nhap vao length of Track: ");
		   int length = sc.nextInt();
		   sc.nextLine();
		   trackList.add(new Track(title, length));
	   }
	   
	   System.out.println("danh sach Tracks : ");
	   for(Track track : trackList) {
		   System.out.println("Track list: " + track.getTitle() + ", Length : " + track.getLength() + " minutes");
		   
	   }
	   System.out.println("Enter CompactDisc ID:");
       int id = sc.nextInt();
       sc.nextLine(); 

       System.out.println("Enter CompactDisc Title:");
       String cdTitle = sc.nextLine();

       System.out.println("Enter CompactDisc Category:");
       String category = sc.nextLine();

       System.out.println("Enter CompactDisc Cost:");
       float cost = sc.nextFloat();
       sc.nextLine();

       System.out.println("Enter CompactDisc Director:");
       String director = sc.nextLine();

       System.out.println("Enter CompactDisc Artist:");
       String artist = sc.nextLine();
       
       CompactDisc cd = new CompactDisc(id, cdTitle, category, cost, 0, director, trackList, artist);
        System.out.println("thong tin compacDisc: ");
        System.out.println(cd.toString());
        
//        add new Track
        cd.addTrack(new Track("Track 4", 6));
        
        System.out.println(cd);
        
//        remove a track
        cd.removeTrack(new Track("Track 2", 8));
        System.out.println(cd);

	   
	   
	}

	
	
	

}
