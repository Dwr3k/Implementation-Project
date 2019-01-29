
public class Song extends DigitalMedia
{
	private String artist;
	private String album;
	
	//Constructors for Song objects
	public Song(String name, long size)
	{
		super(name, size);
	}
	
	public Song(String name, long size, String artistName, String albumnName)
	{
		super(name, size);
		artist = artistName;
		album = albumnName;
	}
	
	//Getter/Setter methods for all instance variables of song
	public String getTitle()
	{
		return super.getName().replaceAll(".mp3", null);
	}
	
	public String getArtist()
	{
		return artist;
	}
	
	public String getAlbum()
	{
		return album;
	}
	
	public void setTitle()
	{
		String titleExtension = super.getName();
		String title = titleExtension.replaceAll(".mp3", null);
	}
	
	public void setArtist(String artistName)
	{
		artist = artistName;
	}
	
	public void setAlbum(String albumnName)
	{
		album = albumnName;
	}
	
	
	//equals method to determine equality
	public boolean equals(Object otherObject)
	{
		boolean truthValue = false;
		
		if(otherObject == otherObject)
		{
			if(otherObject instanceof Song)
			{
				Song comparison = (Song) otherObject;
				
				if(comparison.artist.equals(this.artist))
				{
					if(comparison.album.equals(this.album))
					{
						if(comparison.getTitle().equals(getTitle()))
						{
							truthValue = true;
						}
					}
				}
			}
		}
		
		return truthValue;
	}
	
	//Method that displays Song information
	public String toString()
	{
		String title = "Title: " + getTitle().replaceAll(".mp3", "");
		String artist = "Artist: " + this.artist;
		String album = "Album: " + this.album;
		
		String info = title + "\n" + artist + "\n" + album;
		return info;
	}
}
