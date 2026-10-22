import java.util.Scanner;

public class Parkir17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis;
        int durasi;
        int total = 0;

        do {
            System.out.println("=== PROGRAM PARKIR ===");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }

                System.out.println("Total sementara: Rp" + total);
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid!");
            }

        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp" + total);

        input.close();
    }
}