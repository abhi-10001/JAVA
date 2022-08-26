import java.util.Scanner;

public class TowerOfHanoi
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of rings: ");
        int n = scan.nextInt();
        towerOfHanoi(n, "S", "H", "D");
        System.out.println("Total no of steps: "+ ((int)Math.pow(2, n) - 1));
        scan.close();
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest)
    {
        // int count =1;
        if(n==1)
        {
            System.out.println("transfer disk " + n + " from "+ src+" to "+dest);
           // System.out.println("No of steps: " +count);
            return;
        }
        // if(n!=1) {count++;
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
        // System.out.println("No of steps: " +count);
    }
}
