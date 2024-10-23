import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int sum=0;

        int[] people = new int[wagons];
        for (int i = 0; i < wagons; i++) {
            people[i] = Integer.parseInt(scanner.nextLine());
            sum+=people[i];
        }
        for (int person : people){
            System.out.print(person + " ");
        }
        System.out.println("\n" + sum);

    }
}
