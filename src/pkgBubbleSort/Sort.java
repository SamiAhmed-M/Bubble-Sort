package pkgBubbleSort;

public class Sort {
  public static void display(String[] arr)
  {
	  for (int i=0; i<arr.length; i++) {
		  for (int j=0; j<arr.length-i-1; j++) {
			  // sort ascending order
			  if (Integer.parseInt(arr[j])>Integer.parseInt(arr[j+1]))
			  {
				  String temp = arr[j];
				  arr[j] = arr[j+1];
				  arr[j+1] = temp;
			  }
		  }
	  }
	  // display the sorted result
	  for (int z=0; z<arr.length; z++) {
		  System.out.print(arr[z] + " ");
	  }
  }
}
