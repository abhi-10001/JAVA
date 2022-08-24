import java.util.Scanner;

public class HollowRectangle
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter no of columns: ");
        int column = scan.nextInt();

        for(int i = 1; i<=rows; i++)
        {
            for(int j =1; j<=column; j++)
            {
                if(i==1 || i==rows || j==1 || j == column) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
