# Java For-loop
![java-for-loop](https://github.com/danielurra/java-for-loop/assets/51704179/f805ca28-a442-491f-b872-4f7c9dd96f0e)<br>
For loop being used along with scanner to get x amount of numbers from the user via console
# Create iteration loop
Start typing, select from menu and hit TAB<br>
<img width="291" alt="start-typing" src="https://github.com/danielurra/java-for-loop/assets/51704179/8d80fd7e-5c69-4360-8a35-db24f13d1885"><br>
Your IDE will help you to write the for-loop needed structure (boiler plate code)<br>
![for-loop](https://github.com/danielurra/java-for-loop/assets/51704179/f67abd41-3915-443c-b04e-262d3d036b19)<br>
# Intellij Idea - For loop
IntelliJ Idea will leave the cursor just where it has to be for you to complete the for loop code.<br>
<img width="391" alt="for-loop-intellij" src="https://github.com/danielurra/java-for-loop/assets/51704179/68829686-c7d5-4a6a-ac93-9e9706c8a9cb"><br>
# Two "For" loops are actually needed
<img width="1074" alt="two-for-loops-executed" src="https://github.com/danielurra/java-for-loop/assets/51704179/ba0d078e-afa6-4475-8982-66c89247a25f"><br>

# Grab the code
```java
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
```

