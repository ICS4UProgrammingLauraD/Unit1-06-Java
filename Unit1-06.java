/**

* This program caluclates the mean and median from a set of numbers from an array.

*

* @author  Laura Duffley

* @version 1.0

* @since   2022-03-08

*/


// import necessary packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// import scanner
import java.util.Scanner;

class Unit106 {
	// to handle exceptions add throws
	public static void main(String[] args)
		throws IOException
	{
		// list holding strings of file
		List<String> listOfStrings
			= new ArrayList<String>();

		// load data from the file
		BufferedReader bf = new BufferedReader(
			new FileReader("set1.txt"));
			
		// get array length
        int length = array.length;
        
        // create default sum value.
        int sum = 0;
 
        // sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
 
		// define totalMean
        double totalMean = sum / length;
        
        System.out.println("Average of array : " + totalMean);
			
		// load data from file
		BufferedReader bf = new BufferedReader(
		new FileReader("set2.txt"));
			
		// load data from file
		BufferedReader bf = new BufferedReader(
		new FileReader("set3.txt"));

		// read entire line as string
		String line = bf.readLine();

		// checking for end of file (section from: https://www.javacodegeek
		// s.com/2020/10/java-program-to-calculate-average-using-arrays
		// .html#:~:text=First%2C%20create%20an%20array%20with,get%20the%20average%20of%20numbers.)
		while (line != null) {
			listOfStrings.add(line);
			line = bf.readLine();
		}

		// create calcMedian function
		public class Main {
		static void calcMedian() {
			
		}

		// closing bufferreader object
		bf.close();

		// storing the data in arraylist to array
		String[] array
			= listOfStrings.toArray(new String[0]);
	
		// dislay chosen numbers
		System.out.println("These are the chosen numbers: ");

		// printing each line of file
		// which is stored in array
		for (String str : array) {
			System.out.println(str);
		}
		// display mean and median
		System.out.println("The median is: " + totalMedian);
		System.out.println("Thank you for using this program!");
	}
}
