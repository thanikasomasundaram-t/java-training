package memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
	public static void main(String[] args) {
		String[] songs = {"YourEyes", "Karu Karu vizhigalal", "Unnakul naane", "Vaadi vaadi"};
		SongsQueueManager songsQueueManager = new SongsQueueManager();
		
		for(String song: songs) {
			SongPlayer songPlayer = new SongPlayer(song);
			songsQueueManager.addSong(songPlayer.saveSong());
		}
		System.out.println("-----------------------");
		
		System.out.println("Song in queue position 0: " + songsQueueManager.getPreviousSongFromQueue(0).getSongName());
		System.out.println("Song in queue position 1: " + songsQueueManager.getPreviousSongFromQueue(1).getSongName());
		System.out.println("Song in queue position 2: " + songsQueueManager.getPreviousSongFromQueue(2).getSongName());
		System.out.println("Song in queue position 3: " + songsQueueManager.getPreviousSongFromQueue(3).getSongName());
		
		

	}
}

abstract class Spotify {

}

class Songs extends Spotify {
	private String songName;

	Songs(String songName) {
		this.songName = songName;
	}

	public String getSongName() {
		return songName;
	}

	public void setsongName(Songs songs) {
		songName = songs.getSongName();
	}
}

class SongPlayer extends Spotify {
	private String songName;

	SongPlayer(String songName) {
		this.songName = songName;
	}
	
	public Songs saveSong() {
		return new Songs(songName);
	}
}

class SongsQueueManager extends Spotify {

	private List<Songs> songsList = new ArrayList<Songs>();

	public void addSong(Songs songs) {
		System.out.println("song added: " + songs.getSongName());
		songsList.add(songs);
	}

	public Songs getPreviousSongFromQueue(int index) {
		return songsList.get(index);
	}
}
