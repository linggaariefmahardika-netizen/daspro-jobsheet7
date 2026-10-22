import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalPenjualan = 0;
        int jumlahPelanggan;

        System.out.print("Masukkan jumlah pelanggan: ");
        jumlahPelanggan = input.nextInt();

        for (int i = 1; i <= jumlahPelanggan; i++) {
            int tiket;

            System.out.println("\nPelanggan ke-" + i);
            System.out.print("Masukkan jumlah tiket: ");
            tiket = input.nextInt();

            while (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                System.out.print("Masukkan ulang jumlah tiket: ");
                tiket = input.nextInt();
            }

            double harga = tiket * 50000;
            double diskon = 0;

            if (tiket > 10) {
                diskon = 0.15 * harga;
            } else if (tiket > 4) {
                diskon = 0.10 * harga;
            }

            double total = harga - diskon;
            totalPenjualan += total;

            System.out.println("Harga awal: Rp" + harga);
            System.out.println("Diskon: Rp" + diskon);
            System.out.println("Total bayar: Rp" + total);
        }

        System.out.println("\nTotal penjualan hari ini: Rp"
                + totalPenjualan);

        input.close();
    }
}