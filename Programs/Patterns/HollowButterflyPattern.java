import java.util.Scanner; 

public class HollowButterflyPattern
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height of butterfly: ");
        int height = scan.nextInt();

        for(int i = 1,start=1,end=height; i<=height; i++)
        {
            for(int j = 1; j<=height; j++)
            {
                if(i<=height/2){

                if(j>start && j<end)
                System.out.print(" ");
                else{
                    if(j>1 && j<=start-1)
                        System.out.print(" ");
                     else if(j>=end+1 && j<height)
                        System.out.print(" ");
                    else
                    System.out.print("*");
                }
                }
                if(i>height/2){

                if(j<start && j>end)

                System.out.print(" ");
                else {
                    if(j<end && j>1 )
                        System.out.print(" ");
                    else if(j>start && j<height )
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                }
            }
            System.out.println();
            start++;
            end--;
        }
        scan.close();
    }
}
