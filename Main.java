import java.util.Scanner;

// Main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input data dari user
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Membuat objek Faktur
            Faktur faktur = new Faktur(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);
            // Menghitung total dan menampilkan faktur
            faktur.hitungTotal();
            faktur.tampilkanFaktur();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
}
