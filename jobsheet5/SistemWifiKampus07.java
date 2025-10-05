package jobsheet5;
import java.util.Scanner;

public class SistemWifiKampus07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah Anda mahasiswa terdaftar? (true/false): ");
        boolean mahasiswa = sc.nextBoolean();

        if (mahasiswa) {
            System.out.println("Silakan login menggunakan NIM Anda.");
        } else {
            System.out.println("Akses ditolak. Hanya untuk mahasiswa aktif.");
        }

        sc.close();
    }
}
