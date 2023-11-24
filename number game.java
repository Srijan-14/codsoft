import java.util.Random;
import java.util.Scanner;

class RandomNumberGenerator {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int j = 0;
        int randomNumber = generateRandomNumber(min, max);
        System.out.println("generated number is :" + randomNumber);
        for (int i = 1; i <= 4; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number to be guessed");
            int n = sc.nextInt();
            if (n == randomNumber) {
                j = 1;
                break;
            }
        }
        if (j == 1) {
            System.out.println("guessed number is right ");
        } else {
            System.out.println("limit of guessing number exceeded and guessed number is not matched with generated number ");
        }
    }
    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;

    }
}