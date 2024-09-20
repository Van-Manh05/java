import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        double height;
        char initial;
        boolean likesProgramming;
        
        System.out.print("Nhap ten cua ban: ");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi cua ban: ");
        age = scanner.nextInt();
        System.out.print("Nhap chieu cao cua ban (m): ");
        height = scanner.nextDouble();
        System.out.print("Ban có thich lap trinh khong (co/khong): ");
        likesProgramming = scanner.nextBoolean();
        System.out.println("\nThong tin ca nhan:");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Chieu cao: " + height + " m");
        System.out.println("Co thich lap trinh ko: " + likesProgramming);

        scanner.close();
    }
}
