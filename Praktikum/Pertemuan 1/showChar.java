import java.util.Scanner;

public class showChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        char grade = ' ';

        System.out.print("Masukkan value: ");
        value = input.nextInt();
        input.close();

        if (value >= 80 && value <= 100) grade = 'A';
        if (value >= 65 && value <= 79) grade = 'B';
        if (value >= 55 && value <= 64) grade = 'C';
        if (value >= 40 && value <= 54) grade = 'D';
        if (value < 40 || value > 100) grade = 'E';
        System.out.println("value huruf: " + grade);
    }
}
