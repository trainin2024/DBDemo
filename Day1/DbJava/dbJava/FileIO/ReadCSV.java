package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSV {
	public static void main(String[] str) throws FileNotFoundException
	{
		Scanner sc  = new Scanner(new File("//Users//ashujauhari//democsv.csv"));
	    //parsing a CSV file into the constructor of Scanner class 
	    sc.useDelimiter(",");
	    //setting comma as delimiter pattern
	    while (sc.hasNext()) 
	    {
	      System.out.print(sc.next());
	    }
	    sc.close();
	    //closes the scanner  
	  }
	}


