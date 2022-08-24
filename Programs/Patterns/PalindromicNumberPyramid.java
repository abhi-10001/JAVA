import java.util.Scanner;

public class PalindromicNumberPyramid
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height of pyramid: ");
        int height = scan.nextInt();

        for(int i = 1, u=height-1; i<=height; i++)
        {
            for(int k = u; k>0; k--) System.out.print(" ");
             for(int j = i;j>1; j--)
            {
                System.out.print(j);
            }           
            for(int j = 1;j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
            u--;
        }
    }
}
