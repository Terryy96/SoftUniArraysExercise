import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("swap")) {
                int position1 = Integer.parseInt(command.split(" ")[1]);
                int position2 = Integer.parseInt(command.split(" ")[2]);

                int firstNumber = numbers[position1];
                int secondNumber = numbers[position2];

                numbers[position1] = secondNumber;
                numbers[position2] = firstNumber;

            } else if (command.contains("multiply")) {
                int position1 = Integer.parseInt(command.split(" ")[1]);
                int position2 = Integer.parseInt(command.split(" ")[2]);

                int firstNumber = numbers[position1];
                int secondNumber = numbers[position2];

                int product = firstNumber*secondNumber;
                numbers [position1]= product;


            } else if (command.contains("decrease")) {
                for (int position = 0; position <=numbers.length - 1 ; position++) {
                    numbers[position] --;
                }
            }
            command = scanner.nextLine();
        }

        for (int position = 0; position <=numbers.length - 1 ; position++) {
           int number = numbers[position];
           if (position!= numbers.length -1){
               System.out.print(number + ", ");
           }else {
               System.out.print(number);
           }
        }
    }
}
