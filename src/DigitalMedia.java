
public class DigitalMedia 
{
	private String name;
	private long size;
	
	//Constructors for DigitalMedia Objects
	public DigitalMedia()
	{
		
	}
	
	public DigitalMedia(String songName, long songSize)
	{
		name = songName;
		size = songSize;
	}
	
	//Getter/setter methods for name and size instance variables 
	public String getName()
	{
		return name;
	}
	
	public long getSize()
	{
		return size;
	}
	
	public void setName(String songName)
	{
		name = songName;
	}
	
	public void setSize(long songSize)
	{
		size = songSize;
	}
	
	//Method to determine an objects equivalence 
	public boolean equals(Object other)
	{
		boolean truthValue = false;
		
		if(other == other)
		{
			if(other instanceof DigitalMedia)
			{
				DigitalMedia comparison = (DigitalMedia) other;
				
				if(comparison.name.equals(this.name))
				{
					if(comparison.size == this.size)
					{
						truthValue = true;
					}
				}
			}
		}
		
		return truthValue;
	}
	
	//To String method that displays the objects name and size
	public String toString()
	{
		String name = "Name: " + this.name;
		String size = "Size: " + this.size;
		
		String info = name + "\n" + size;
		return info;
				
	}
	
}
