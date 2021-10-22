class Song
{
	private String title;
	private String album;
	private String artist;
	private Genre genre;
	
	public Song()
	{
		title = "unknown";
		album = "unknown";
		artist = "unknown";
		genre = Genre.UNKNOWN;
	}
	public Song(String title, String album, String artist)
	{
		this.title = title;
		this.album = album;
		this.artist = artist;
	}
	public Song(String title, String album, String artist, Genre genre)
	{
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.genre = Genre.UNKNOWN;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	public String getAlbum()
	{
		return this.album;
	}
	public String getArtist()
	{
		return this.artist;
	}
	public Genre getGenre()
	{
		return genre;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setAlbum(String album)
	{
		this.album = album;
	}
	public void setArist(String artist)
	{
		this.artist = artist;
	}
	public void setGenre(Genre genre)
	{
		this.genre = genre;
	}	 
	
	@Override
	public String toString()
	{
		return "[Song] --> " + this.title + ", " + this.album + ", " + this.artist + ", " + this.genre;
	}
		 
}
