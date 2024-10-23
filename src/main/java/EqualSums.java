import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }

        int leftSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int rightSum = totalSum - leftSum - numbers[i];


            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }

            leftSum += numbers[i];
        }
        System.out.println("no");
    }
}
