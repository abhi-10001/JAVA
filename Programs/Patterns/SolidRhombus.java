import java.util.Scanner;

public class SolidRhombus
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the Rhombus: ");
        int len = scan.nextInt();

        for(int i = 1,k=5; i<=len; i++)
        {
            for(int s=k; s>0;s--) System.out.print(" ");
            for(int j = 1; j<=len; j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
            k--;
        }
    }
}
