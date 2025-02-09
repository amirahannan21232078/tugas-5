class PerhitunganSaldo {
    public static void main(String[] args) {
        // Input
        double saldoAwal = 1000000; // Saldo awal
        double bunga = 10.0 / 100; // Bunga dalam bentuk desimal
        int lamaBulan = 5; // Lama menabung dalam bulan

        // Perhitungan saldo tiap bulan
        double saldo = saldoAwal;
        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            saldo += saldo * bunga; // Menambahkan bunga ke saldo
            System.out.printf("Saldo di bulan ke-%d : Rp. %,.0f%n", bulan, saldo);
        }
    }
}
