import java.util.Scanner;
import java.lang.Math;

public class circle {
    public static void main(String[] args) {
        System.out.print("Jari-jari lingkaran: ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        input.close();
        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;
        System.out.println("Luas lingkaran: " + area);
        System.out.println("Keliling lingkaran: " + circumference);
    }
}