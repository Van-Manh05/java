import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten cua ban: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();
    }
}
