import java.util.Scanner;

public class SelectionSort
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = scan.nextInt();
        System.out.print("Enter the elements of an array: ");
        int [] arr = new int[n];

        for(int i = 0; i<n; i++) arr[i] = scan.nextInt();
        scan.close();

        for(int j = 0; j<n-1; j++){
            int smallest = j;
            for(int i =j+1; i<n; i++)
            {
                if(arr[smallest]>arr[i])
                {
                    smallest = i;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[j];
            arr[j] =temp;
        }
        for(int i = 0; i<n; i++) System.out.print(arr[i] +" ");
    }
}
