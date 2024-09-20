import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu 1: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Nhap so nguyen thu 2: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2; 
        int difference = num1 - num2; 
        int product = num1 * num2; 
        double quotient = num1 / (double) num2; 
        int remainder = num1 % num2;

        System.out.println("\nKet qua:");
        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);
        System.out.println("Thuong: " + quotient);
        System.out.println("Phan du: " + remainder);

        scanner.close();
    }
}
