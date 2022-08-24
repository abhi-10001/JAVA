import java.util.Scanner;

public class SolidRectangle
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int r = scan.nextInt();

        System.out.print("Enter no of column: ");
        int c = scan.nextInt();

        for(int i =0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
