
    class Faktur extends Barang {
        private String noFaktur;
        private int jumlahBeli;
        private double total;
    
        public Faktur(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
            super(kodeBarang, namaBarang, hargaBarang);
            this.noFaktur = noFaktur;
            this.jumlahBeli = jumlahBeli;
            this.total = 0;
        }
    
        // Method untuk menghitung total harga
        public void hitungTotal() throws IllegalArgumentException {
            if (jumlahBeli < 1) {
                throw new IllegalArgumentException("Jumlah beli harus lebih dari 0!");
            }
            this.total = this.hargaBarang * this.jumlahBeli;
        }
    
        // Method untuk menampilkan faktur
        public void tampilkanFaktur() {
            System.out.println("\n=== Faktur Penjualan ===");
            System.out.println("No Faktur   : " + this.noFaktur);
            System.out.println("Kode Barang : " + this.kodeBarang);
            System.out.println("Nama Barang : " + this.namaBarang);
            System.out.printf("Harga Barang: Rp%.2f%n", this.hargaBarang);
            System.out.println("Jumlah Beli : " + this.jumlahBeli);
            System.out.printf("Total       : Rp%.2f%n", this.total);
        }
    }
    

