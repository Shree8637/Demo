import java.util.Random;
import java.util.Scanner;

class Number {
    int num, cnum;
    Number(int n) {
        num = n;
    }
    void checkInput(int n, int cn) {
        cnum = cn;

        if (num < cnum)
            System.out.printf("Entered Number is Smaller\nTry Entering a Greater Number\n");

        if (num > cnum)
            System.out.printf("Entered Number is Greater\nTry Entering a Smaller Number\n");

        if (num == cnum){
            System.out.printf("Number Guessed Correctly\n");
            System.out.printf("\n--------------------------------------------------------");
        }
    }
}
public class Guess_the_number2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int cnum = r.nextInt(1,100);
        int num = 0, count = 0;

        for (int i = 0; i <= 100; i++) {
            System.out.printf("\nEnter a number: ");
            num = s.nextInt();
            Number n = new Number(num);
            n.checkInput(num, cnum);
            ++count;
            if ( num == cnum )
                break;
        }

        System.out.printf("\n\nYour Score is %d", count);
    }
}
