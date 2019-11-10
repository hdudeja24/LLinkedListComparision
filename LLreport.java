import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LLReport {
	
	static unsortedLL unsortedLL;
	
	final static String FileName = "Hamlet.txt";
	
	public static void readFile()
	{
		try
		{
			Scanner readFile = new Scanner(new File(FileName));
			while (readFile.hasNextLine())
			{

	Scanner line = new Scanner(readFile.nextLine());
			while (line.hasNext())
				{
				//System.out.println(cleanWord(line.next()));
				return unsortedLL.insertNode(cleanWord(line.next()));
				}

			}

		}
		catch (Exception e)
		{
			System.out.println("Error reading file");
		}
}
	
	public static void main (String[] args) throws FileNotFoundException
	{
		
		System.out.println("Testing ReadFile()");
		readFile();
		
		unsortedLL.printLL();
	}
	static String cleanWord (String str)
		{
		char word [] = str.toCharArray();

			String returnStr = "";
			
			for (char c: word)
			{
				if (!(c == '.' || c == ',' || c == '\'' || c == '?' || c == '!' || c == ';' || c == '-' || c== ':'))
					returnStr += Character.toString(c).toLowerCase();
			}
			return returnStr;

		}
	}
