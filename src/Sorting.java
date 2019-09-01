/**
 * 
 */

/**
 * @author Adrien
 *
 */
public class Sorting {
	void selectionSort(int array [] ) {
		int n = array.length;
		int i ;
		int j ;
		
		for (i= 0 ; i<(n-1); i++)
		{int index = i ;
		
		for (j=i +1 ;j<n ; j++  ) {
		  if (array[j] < array[index]) {
			  index = j;
		  }
		}
		  
		int x = array[index];
		array[index]= array[i];
		array[i]= x;}		
	}
		
void printselectionSort(int array[]) {
	int n = array.length;
	int i;
	for (i = 0 ; i<n ; ++i)
	{
		System.out.print(array[i] + " ");
		
	
	}
	
	System.out.println();
}

void bubbleSort(int array[], int n) 
{ 	
    int i, j, temp; 
    boolean swapped; 
    for (i = 0; i < n - 1; i++)  
    { 
        swapped = false; 
        for (j = 0; j < n - i - 1; j++)  
        { 
            if (array[j] > array[j + 1])  
            { 
                temp = array[j]; 
                array[j] = array[j + 1]; 
                array[j + 1] = temp; 
                swapped = true; 
            } 
        } 

 
        if (swapped == false) 
            break; 
    } 
} 

void printbubbleSort(int arr[], int n) 
{ 
    int i; 
    for (i = 0; i < n; i++) 
        System.out.print(arr[i] + " "); 
    System.out.println(); 
} 



void insertionSort(int array[]) 
{ 
    int n = array.length; 
    for (int i = 1; i < n; ++i) { 
        int key = array[i]; 
        int j = i - 1; 

        /* Move elements of arr[0..i-1], that are 
           greater than key, to one position ahead 
           of their current position */
        while (j >= 0 && array[j] > key) { 
            array[j + 1] = array[j]; 
            j = j - 1; 
        } 
        array[j + 1] = key; 
    } 
} 

/* A utility function to print array of size n*/
void printinsertionSort(int array[]) 
{
    int n = array.length ;
    for (int i = 0; i < n; ++i)
    {
        System.out.print(array[i] + " "); 
    }
    
    System.out.println(); 
} 

 int partition(int array[], int low, int high )
{        

	 
	 
    int pivot = array[high];  
    int i = (low-1); // index of smaller element 
    for (int j=low; j<high; j++) 
    { 
        // If current element is smaller than or 
        // equal to pivot 
        if (array[j] <= pivot) 
        { 
            i++; 

            // swap arr[i] and arr[j] 
            int temp = array[i]; 
            array[i] = array[j]; 
            array[j] = temp; 
        } 
    } 

    // swap arr[i+1] and arr[high] (or pivot) 
    int temp = array[i+1]; 
    array[i+1] = array[high]; 
    array[high] = temp; 

    return i+1; 
} 


/* The main function that implements QuickSort() 
  arr[] --> Array to be sorted, 
  low  --> Starting index, 
  high  --> Ending index */
void quickSort(int array[], int low, int high) 
{ 
	
    if (low < high) 
    { 
        /* pi is partitioning index, arr[pi] is  
          now at right place */
    	int pi = partition (array, low ,high) ;

        // Recursively sort elements before 
        // partition and after partition 
        quickSort(array, low, pi-1); 
        quickSort(array, pi+1, high); 
    } 
} 

/* A utility function to print array of size n */
void printArray(int[]array) 
{ 
    int n = array.length; 
    for (int i=0; i<n; ++i) 
        System.out.print(array[i]+" "); 
    System.out.println(); 
} 







}
 
