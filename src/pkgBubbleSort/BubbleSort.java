package pkgBubbleSort;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// Scanner Object
		Scanner myObj = new Scanner(System.in);
		// Prompt user
		System.out.println("Please enter integer elements for sorting separated by space or comma");
		String []arr = myObj.nextLine().split("[ ,]+");
		myObj.close();
		Sort.display(arr);

	}

}
