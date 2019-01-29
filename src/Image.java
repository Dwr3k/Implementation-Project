
public class Image extends DigitalMedia
{
	private int width;
	private int height;
	
	//Constructors for Image Objects
	public Image(String heck, int hecks)
	{
		super(heck, hecks);
	}
	
	public Image(String name, long size, int imageWidth, int imageHeight)
	{
		super(name, size);
		width = imageWidth;
		height = imageHeight;
	}
	
	//Getter/Setter Methods for instance variables
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setWidth(int imageWidth)
	{
		width = imageWidth;
	}
	
	public void setHeight(int imageHeight) 
	{
		height = imageHeight;
	}
	
	//Method that determines the object is logically equivalent 
	public boolean equals(Object otherObject)
	{
		boolean truthValue = false;
		
		if(otherObject == otherObject)
		{
			if(otherObject instanceof Image)
			{
				Image comparison = (Image) otherObject;
				
				if(comparison.width == this.width)
				{
					if(comparison.height == this.height)
					{
						truthValue = true;
					}
				}
			}
		}
		
		return truthValue;
	}
	
	//toString method that displays Image information
	public String toString()
	{
		String title = "Title: " + getName();
		String width = "Width: " + this.width;
		String height = "Height: " + this.height;
		
		String info = title + "\n" + width + "\n" + height;
		return info;
	}	
}
