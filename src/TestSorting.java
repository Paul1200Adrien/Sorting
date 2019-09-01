/**
 * 
 */
import java.util.Scanner;
/**
 * @author Adrien
 *
 */
public class TestSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
while (true) {
		Scanner keys = new Scanner(System.in);
	
			int []array;
		
		
		System.out.print("Chose betw quick sort, bubble sort , insertion sort and selection sort : ");
		String a = keys.nextLine();//next; for 1 word 
									//nextLine; for a line.
	
		System.out.print("length of list : ");
		int n = keys.nextInt();
		array = new int [n];
		
		Sorting type = new Sorting();
		n = array.length;
		 System.out.println("Enter Array Elements : ");
		 int i;
	       for(i=0; i<n; i++)
	       {
	           array[i] = keys.nextInt();
	       }


	    if (a.equalsIgnoreCase("quick sort")  )
			{
			int low = 0;
			int high = n-1;
			type.quickSort(array, low, high);
			type. printArray(array);
			}
	    else if (a.equalsIgnoreCase("bubble sort"))
		{
			type.bubbleSort(array, n);
			type.printbubbleSort(array, n);
		}
	    else if(a.equalsIgnoreCase("insertion sort"))
		{ type.insertionSort(array);
		type.printinsertionSort(array);
		}
		
	    else if (a.equalsIgnoreCase("selection sort"))
	    {
			type.selectionSort(array);
			type.printselectionSort(array);
	
		}
		else //(a!="selection sort" || a != "insertion sort" || a != "bubble sort" || a != "quick sort"); 
			{System.out.println("please enter a valid type of sorting .");
			}

	   System.out.print("Do you wish to continue ?" );
	   String ans = keys.next();
		
		if (ans.equalsIgnoreCase("yes"))
		{
			continue;
				}
		else if (ans.equalsIgnoreCase("no"))
		{
		 System.out.println(" Thank you !");
		 break;
		}
			
	keys.close();	}
}
		

}
		
	


