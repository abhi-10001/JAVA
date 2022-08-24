import java.util.Scanner;

public class DiamondPattern
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int val = scan.nextInt();

        for(int i = 1,u=val; i<=val; i++)
        {
            for(int k = u; k>0 ;k--) System.out.print(" ");
            for(int j = 1; j<=2*i -1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            u--;
        }
        for(int i = val,u=1; i>0; i--)
        {
            for(int k = 1; k<=u ;k++) System.out.print(" ");
            for(int j = 1; j<=2*i -1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            u++;
        }
    }
}
