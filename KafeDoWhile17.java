import java.util.Scanner;
public class KafeDoWhile17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar):");
            String namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.println("Jumlah kopi: ");
            int kopi = sc.nextInt();
            System.out.println("Jumlah teh: ");
            int teh = sc.nextInt();
            System.out.println("Jumlah roti: ");
            int roti = sc.nextInt();

            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);

            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}