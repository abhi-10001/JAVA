import java.util.Scanner;

public class FloydsTriangle
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height of the Triangle: ");
        int height = scan.nextInt();

        for(int i = 1,n=1; i<=height; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}
