import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson_9 {
    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("Test9.txt");
//        Scanner scanner = new Scanner(file);
        Scanner scanner = new Scanner(new FileInputStream("Test9.txt"));
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        int sum = 0;

        for (String number: numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println("Количество чисел - " + numbers.length);
        System.out.println("Сумма чисел = " + sum);
        scanner.close();
    }
}
