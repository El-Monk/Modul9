import com.sun.jdi.event.StepEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson_9 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Test9.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        int sum = 0;

        for (String number: numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println(sum);
    }
}
