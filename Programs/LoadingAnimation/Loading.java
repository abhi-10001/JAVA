//Loading...

public class Loading
{
    public static void main(String [] args) throws InterruptedException
    {
        System.out.print("Loading...");
        char[] arr = new char[]{'.','.','.','.','.','.','.','.','.','.'};
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = '#';
            Thread.currentThread().sleep(1000);
            System.out.print(arr[i]);
        }
    }
}
