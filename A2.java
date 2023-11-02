import java.util.InputMismatchException;
import java.util.Scanner; 
/**
 * 
 */
class NoVowelsException extends RuntimeException{
    NoVowelsException()
    {

    }
    NoVowelsException(String word)
    {
        super(word);
    }
    
}
public class A2 extends Throwable {
    public static void main(String[] args) {
        System.out.print("Enter the String :");
        try (Scanner str = new Scanner(System.in)) 
        {
            String string = str.nextLine();
            int v = Vowels(string);
             try {
                if (!(v == 0)) {
                   throw new NoVowelsException("Vowels found :"+v); 
                }
                else
                {
                    System.out.println("Not found Vowels");
                }
             } catch (NoVowelsException e) {
                System.err.println(e.getMessage());
             }
             throw new InputMismatchException();
        }
        catch(InputMismatchException e)
        {
            System.err.println("Exit");
        }
    }
    static int Vowels(String i)
    {
        int count = 0;
        for (int k = 0; k < i.length(); k++) {
           if("aeiouAEIOU".contains(i.charAt(k)+""))
            {
                count ++;
            }       
        }
      return count;
    }
    
}


    