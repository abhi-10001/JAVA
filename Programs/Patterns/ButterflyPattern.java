import java.util.Scanner; 

public class ButterflyPattern
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height of butterfly: ");
        int height = scan.nextInt();

        for(int i = 1,start=1,end=height,rstart=1,rend=height; i<=height; i++)
        {
            for(int j = 1; j<=height; j++)
            {
                if(i<=height/2){
                if(j>start && j<end)
                System.out.print(" ");
                else System.out.print("*");
                }
                if(i>height/2){
                if(j<start && j>end)
                System.out.print(" ");
                else System.out.print("*");
                }
            }
            System.out.println();
            start++;
            end--;
        }
    }
}
