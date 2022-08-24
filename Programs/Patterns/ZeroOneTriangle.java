import java.util.Scanner;

public class ZeroOneTriangle
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = scan.nextInt();

        for(int i =1; i<=height; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((j+i)%2==0) System.out.print("1"+" ");
                else System.out.print("0"+" ");
            }
            System.out.println();
        }
    }
}
