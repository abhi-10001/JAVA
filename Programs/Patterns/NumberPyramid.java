import java.util.Scanner; 

public class NumberPyramid
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        int height = scan.nextInt();

        for(int i = 1,u=height-1; i<=height; i++)
        {
            for(int k = u;k>0; k--) System.out.print(" ");
            for(int j = 1; j<=i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            u--;
        }
    }
}
