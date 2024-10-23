import java.util.Arrays;
import java.util.Scanner;

public class TheLift {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleWaiting = Integer.parseInt(scanner.nextLine());

        int[] lift  = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int maxCapacity = 4;

        // Go through each wagon and try to add people
        for (int i = 0; i < lift.length; i++) {
            // Determine how many people can fit in the current wagon
            int availableSpace = maxCapacity - lift[i];

            // Add people to the current wagon if there is available space
            if (availableSpace > 0) {
                if (peopleWaiting >= availableSpace) {
                    lift[i] += availableSpace;  // Fill the wagon
                    peopleWaiting -= availableSpace;  // Deduct people from the queue
                } else {
                    lift[i] += peopleWaiting;  // Add all remaining people
                    peopleWaiting = 0;  // No more people waiting
                    break;  // No need to check other wagons
                }
            }
        }

        // Output based on remaining people and lift status
        boolean liftHasEmptySpots = Arrays.stream(lift).anyMatch(w -> w < 4);

        if (peopleWaiting == 0 && liftHasEmptySpots) {
            // No more people, but the lift has empty spots
            System.out.println("The lift has empty spots!");
            System.out.println(Arrays.toString(lift).replaceAll("[\\[\\],]", ""));
        } else if (peopleWaiting > 0 && !liftHasEmptySpots) {
            // There are still people in the queue but no available space
            System.out.println("There isn't enough space! " + peopleWaiting + " people in a queue!");
            System.out.println(Arrays.toString(lift).replaceAll("[\\[\\],]", ""));
        } else {
            // The lift is full and no more people are left
            System.out.println(Arrays.toString(lift).replaceAll("[\\[\\],]", ""));
        }
    }
}


