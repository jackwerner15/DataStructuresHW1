import java.util.ArrayList;
import java.util.Scanner;

import java.util.Collections;

public class Array {

    public void run() {

        ArrayList<Integer> myArray = new ArrayList<Integer>(3);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("\nType a number ");
            myArray.add(Integer.parseInt(scanner.nextLine()));
        }

        System.out.println(myArray.toString());

        System.out.println("Min Value: " + Collections.min(myArray));

        System.out.println("Max Value: " + Collections.max(myArray));

        double sum = 0;
        for (int i : myArray) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        int prod = 1;
        for (int x : myArray) {
            prod *= x;
        }
        System.out.println("Product: " + prod);

    }

}
