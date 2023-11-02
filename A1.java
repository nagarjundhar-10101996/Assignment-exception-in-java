import java.lang.*;
import java.util.InputMismatchException;
import java.util.Scanner; 
/**
 * 
 */
class NoMatchException extends RuntimeException{
    NoMatchException()
    {

    }
    NoMatchException(String word)
    {
        super(word);
    }
    
}
public class A1 extends Throwable {
    public static void main(String[] args) {
        System.out.print("Enter the String which matches India");
        try (Scanner str = new Scanner(System.in)) 
        {
            String string = str.nextLine();
             try {
                if (!match(string ,"India")) {
                   throw new NoMatchException("Not found"); 
                }
                else
                {
                    System.out.println("Match");
                }
             } catch (NoMatchException e) {
                System.err.println(e.getMessage());
             }
             throw new InputMismatchException();
        }
        catch(InputMismatchException e)
        {
            System.err.println("Exit");
        }
    }
    static boolean match(String i,String n)
    {
        return i.indexOf(n) == -1 ? false :true;  
    }
    
}


    