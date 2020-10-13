import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException{
        java.io.File file = new java.io.File("Exercise12_15.txt");

        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Write formatted output to file
        for (int i = 0; i< 100; i++) {
            output.print((int)(Math.random() * 5 + 0.5) + " ");
        }

        output.close();

        // Create file instance to read
        Scanner input = new Scanner(file);
        int[] arrayOfInts = new int[100];


        for (int i = 0; i < 100; i++) {
            arrayOfInts[i] = input.nextInt();
        }

        Arrays.sort(arrayOfInts);

       System.out.println(Arrays.toString(arrayOfInts));

//        while (input.hasNext()) {
//            String firstName = input.next();
//            String mi = input.next();
//            String lastName = input.next();
//            int score = input.nextInt();
//            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
//        }




        // Close the file
        input.close();
    }
}