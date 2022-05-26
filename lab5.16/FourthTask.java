package FourthTask;

import java.util.Scanner;

public class FourthTask {

	public static void main(String[] args) {
		int randomNum1, randomNum2, randomNum3, inputNum1, inputNum2, inputNum3, count;
        count = 0;
        inputNum1 = 0;
        inputNum2 = 0;
        inputNum3 = 0;
        randomNum1 = 0;

        do {
            count++;
            System.out.println("Enter three integers between 1 and 3 (you have 2 attempts left):");
            Scanner scanner = new Scanner(System.in);
            randomNum1 = (int) (Math.random() * 3 + 1);
            randomNum2 = (int) (Math.random() * 3 + 1);
            randomNum3 = (int) (Math.random() * 3 + 1);

            if (scanner.hasNextInt()) {
                inputNum1 = scanner.nextInt();
                inputNum2 = scanner.nextInt();
                inputNum3 = scanner.nextInt();
                if (randomNum1 == inputNum1 && randomNum2 == inputNum2 && randomNum3 == inputNum3) {
                    System.out.println("You guessed all three numbers");
                } else {
                    System.out.println("Sorry, you could not guess, please try again (1 try left):");
                    randomNum1 = (int) (Math.random() * 3 + 1);
                    randomNum2 = (int) (Math.random() * 3 + 1);
                    randomNum3 = (int) (Math.random() * 3 + 1);
                    if (scanner.hasNextInt()) {
                        inputNum1 = scanner.nextInt();
                        inputNum2 = scanner.nextInt();
                        inputNum3 = scanner.nextInt();
                        if (randomNum1 == inputNum1 && randomNum2 == inputNum2 && randomNum3 == inputNum3) {
                            System.out.println("You guessed all three numbers");
                        } else {
                            System.out.println("Sorry, you used all the attempts and didn't guess the three numbers");


                        }
                    }
                    else {
                        System.out.println("You did not enter an integer (");
                    }
                   }
                }
            else {
                System.out.println("You did not enter an integer (");
            }
        }
        while (count != 1) ;

	}

}
