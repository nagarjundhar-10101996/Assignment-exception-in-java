import java.util.Random;
import java.util.Scanner;

class Arrayrev
{
    protected int length ;
    private int[] a ;
    Arrayrev(int i) {
          this.length = i;
    }
    void add(int [] arg)
    {
        this.a=arg;
    }
    int cirarr(int i)
    {
        try {
                System.out.println("Result :");
                return this.a[i]; 
            
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handeling "+ e);
            System.out.println("Result :");
            return this.a[Math.abs(Math.abs(this.a.length)+i%this.a.length)];
        }
    }
}
public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("Arrays : ");
        Arrayrev a = new Arrayrev(100);
        int [] atr = new int[a.length];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            atr[i] = rand.nextInt(1000);
            System.out.print(atr[i]);
            if (i < a.length-1) {
               System.out.print(",");  
            }
        }
        System.out.println();
            a.add(atr);
            System.out.print("Input the index element : ");
            System.out.println(a.cirarr(sc.nextInt()));
       
    }
    
}
