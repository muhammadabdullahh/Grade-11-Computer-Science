import java.util.ArrayList;

class TestSong
{
	public static void main(String[] args)
	{
		ArrayList<Song> songs = new ArrayList<Song>();
		
		songs.add(new Song());
		songs.add(new Song());
		songs.add(new Song("The One2", "Album2", "OConner1"));
		songs.add(new Song("The One3", "Album3", "OConner2"));
		songs.add(new Song("The One4", "Album4", "OConner3"));
		songs.add(new Song("The One5", "Album5", "OConner4", Genre.JAZZ));
		songs.add(new Song("The One6", "Album6", "OConner5", Genre.CLASSICAL));
		songs.add(new Song("The One7", "Album7", "OConner6", Genre.COUNTRY));
		songs.add(new Song("The One8", "Album8", "OConner7", Genre.HIP_HOP));
		songs.add(new Song("The One9", "Album9", "OConner8", Genre.METAL));
		
		     
		songs.get(0).setTitle("Yesir");
		songs.get(0).setAlbum("FOSHO");
		songs.get(0).setArist("Mo");
		songs.get(0).setGenre(Genre.CLASSICAL);
		
		System.out.println();
		System.out.println();
		
		System.out.println(songs.get(4).getArtist());
		System.out.println(songs.get(7));
		
		System.out.println();
		System.out.println();
		
		System.out.println(songs);
		
		System.out.println();
		System.out.println();
		
		songs.remove(1);
		
		songs.add(4,new Song("The One45", "Album45", "OConner45", Genre.ROCK));
		songs.add(new Song("The One100", "Album100", "OConner100", Genre.COUNTRY));
		
		System.out.println(songs);
		System.out.println();
		System.out.println(songs.size());
	}

	
	
	

}
