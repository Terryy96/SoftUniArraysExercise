import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();


        String[] firstArray = firstRow.split(" ");
        String[] secondArray = secondRow.split(" ");

        for (String el2 : secondArray){
            for (String el1 : firstArray){
                if (el1.equals(el2)){
                    System.out.print(el2 + " ");
                }
            }
        }
    }
}
