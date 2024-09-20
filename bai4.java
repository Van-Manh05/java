import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        
        try (Scanner Nhap = new Scanner(System.in)) {
            
            int tien, sthang;
            double lsuat, tongtien;

            System.out.print("Nhap so tien gui: ");
            tien = Nhap.nextInt();
            System.out.print("Nhap lai suat hang nam (vi du: 0.05 cho 5%): ");
            lsuat = Nhap.nextDouble();
            System.out.print("Nhap so thang gui tien: ");
            sthang = Nhap.nextInt();

            tongtien = tien * Math.pow((1 + lsuat / 12), sthang);

            System.out.printf("So tien lai nhan duoc la: %.2f%n", tongtien - tien);
        }

    }
}