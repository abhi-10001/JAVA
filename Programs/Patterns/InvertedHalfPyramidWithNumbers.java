import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        int height = scan.nextInt();

        for(int i = 0; i<height; i++)
        {
            for(int j = 1; j<=height-i; j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
