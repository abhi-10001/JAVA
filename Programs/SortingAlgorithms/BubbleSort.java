/* BubbleSort implementation
 *  Time Complexity of this algorithm --->> O(n^2)
 *  Space Complexity of this algorithm --->> O(1)
 * 
 * */

import java.util.Scanner;

public class BubbleSort
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scan.nextInt();
        System.out.print("Enter the no of elements: ");
        int [] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = scan.nextInt(); // taking array elements from user
        }

        // reverse loop for ignoring the last(biggest) element
        for(int j = n-1; j>=0; j--) 
        {
            // loop for compareing adjecent elements
            for(int i =0; i<=j-1; i++) 
            {
                if(arr[i]>arr[i+1])
                {
                    // swapping the bigger element with smaller element
                    int compare = arr[i];   
                    arr[i] = arr[i+1];
                    arr[i+1] = compare;
                    
                }

            }
        }
        //printing array elements
        for(int i =0; i<n; i++) System.out.print(arr[i] + " "); 
        scan.close();
    }
}
