import java.util.Scanner;

public class InvertedHalfPyramid
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter height of the pyramid: ");
        int height = scan.nextInt();

        for(int i = 1; i<= height; i++)
        {
            for(int j = 1;j<=height; j++)
            {
                if(j>height-i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
