package package_java_for_loop;

import java.util.Scanner;

public class classJavaForLoop {
    public static void main(String[] args) {
        Scanner dannyScan = new Scanner(System.in);
        int[] eachNumber = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter one number: ");
            int numberFromScanner = Integer.parseInt(dannyScan.nextLine());
            eachNumber[i] = numberFromScanner;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Position #" + i + ": " + eachNumber[i]);
        }

    }
}
