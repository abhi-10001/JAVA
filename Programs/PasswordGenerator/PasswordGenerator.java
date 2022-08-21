//PasswordGenerator
//This class will generate random password with ASCII characters of length 10

public class PasswordGenerator
{
    public static void main(String [] args)
    {
        for(int i = 0; i<10; i++)
        {
           int choice = getRandomNumber(1,5); 
           if(choice ==1) System.out.print(lowAlphabetGenerator());
           if(choice ==2) System.out.print(charGenerator());
           if(choice ==3) System.out.print(numGenerator());
           if(choice ==4) System.out.print(upAlphabetGenerator());
        }
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


    public static char charGenerator()
    {
        return (char)getRandomNumber(33,43);
    }
    public static char numGenerator()
    {
        return (char)getRandomNumber(48, 58); 
    }
    public static char upAlphabetGenerator()
    {
        return (char)getRandomNumber(63, 92);
    }
    public static char lowAlphabetGenerator()
    {
        return (char)getRandomNumber(97, 124);
    }
}
