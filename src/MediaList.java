import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class MediaList 
{
	
	private static void printHeading()
	{
		System.out.println("Derrick McGlone");
		System.out.println("Project #1");
		System.out.println("CMSC 256");
		System.out.println("Spring 2019");
		System.out.println("");
	}
	
	public static void main(String args[]) throws FileNotFoundException
	{
		printHeading();
		
		
		File inputFile = null;
		
		if(args.length > 0)
		{
			inputFile = new File(args[0]);
		}
		
		
		Scanner input = new Scanner(inputFile); //Reads the text file
		input.useDelimiter(":");
		
		String mediaType; //String that determines if the object is an image or song
		
		//Variables for songs
		String songName;
		String artistName;
		String albumName;
		Long songSize;
		
		//Variables for Images
		String imageName;
		int imageWidth;
		int imageHeight;
		Long imageSize;
		
		Scanner stringInput;
		
		DigitalMedia media = new DigitalMedia(); //Makes DigitalMedia object
		ArrayList<DigitalMedia> mediaList = new ArrayList<DigitalMedia>(); //New Arraylist for Song and Image objects
		
		//Loop that goes through the text file and builds the songs and images
		while(input.hasNext())
		{
			
			String inputLine = input.nextLine(); //String that takes in a line of text
			
			stringInput = new Scanner(inputLine);	//New scanner that reads the string inputLine and breaks it up into parts
			stringInput.useDelimiter(":");
			
			mediaType = stringInput.next().trim();
			
			if(mediaType.equals('S')) //If else to determine which object to build and add to the ArrayList
			{
				
				//Collecting the parameters for the song object
				songName = stringInput.next().trim();
				artistName = stringInput.next().trim();
				albumName = stringInput.next().trim();
				songSize = Long.valueOf(stringInput.next().trim());
				
				Song finishedSong = new Song(songName, songSize, artistName, albumName); //Builds the song object
				
				mediaList.add(finishedSong);//Adds the song object to list
			}
			
			else if(mediaType.equals('I'))
			{
				//Gets the parameters for the Image object
				imageName = stringInput.next().trim();
				imageWidth = Integer.valueOf(stringInput.next().trim());
				imageHeight = Integer.valueOf(stringInput.next().trim());
				imageSize = Long.valueOf(stringInput.next().trim());
				
				Image finishedImage = new Image(imageName, imageSize, imageWidth, imageHeight); //Builds Image object
				
				mediaList.add(finishedImage);//Adds Image object to list
			}
		}
		
		input.close();
		
		//Prompts the user for which list they want to see
		System.out.println("Select from one of the following options by entering the character specified:");
		System.out.println("Press S to display a list of all the songs");
		System.out.println("Press I to display a list of all the images");
		System.out.println("Press Q to quit the program.");
		
		Scanner userInput = new Scanner(System.in); //Scanner that takes user input in
		
		char inputSelection = userInput.next().charAt(0);
		
		if(inputSelection == 'Q')
		{
			System.exit(0);
		}
		
		if(inputSelection == 'S')
		{
			
		}
		
		if(inputSelection == 'I')
		{
			
		}
		
		userInput.close();
	}
}
		