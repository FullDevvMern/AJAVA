import java.util.*;

public class d2 {
    public static void main(String[] args) {

        int count = 1;

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int target = r.nextInt(50); // number between 0–49

        System.out.println("In total, you have only two attempts!");

        while (true) {
            System.out.println("Enter a number:");
            int guess = sc.nextInt();

            if (count == 2 && guess != target) {
                System.out.println("No attempts left!");
                System.out.println("The correct number was: " + target);
                break;
            }

            if (guess == target) {
                System.out.println("Congrats!! You guessed right. The number is " + target);
                break;
            } else if (guess > target) {
                System.out.println("The number is lower... Guess again");
            } else {
                System.out.println("The number is higher... Guess again");
            }

            count++;
        }

        sc.close();
    }
}