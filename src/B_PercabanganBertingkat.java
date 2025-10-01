import java.util.Scanner;

/**
 * <h1>Percabangan Bertingkat - Kasir</h1><br>
 * Buatlah program kasir sederhana untuk menghitung total belanjaan pelanggan.
 * Program memliki fitur diskon 15% hingga 150.000 jika total belanjaan menyentuh 300.000 .
 * <br>
 * <br>
 * Jika belanjaan mendapatkan diskon, maka program mencetak keterangan bahwa pelanggan
 * mendapatkan diskon dan mencetak jumlah diskon yang diterima. Tidak berhenti di situ,
 * jika diskon yang diberikan sudah maksimal, maka program mencetak keterangan bahwa
 * diskon yang diberikan sudah maksimal.
 * <br><br>
 * Jika belanjaan tidak mendapatkan diskon, maka program mencetak keterangan bahwa
 * pelanggan tidak mendapatkan diskon.
 * <br><br>
 * Setelah itu, program mencetak total belanjaan yang harus dibayar oleh pelanggan,
 * sudah termasuk diskon jika ada.
 *
 * @author <a href="https://github.com/vianneynara">nara</a>
 * */
public class B_PercabanganBertingkat {

	public static void main(String[] args) {
		// deklarasi variabel
		Scanner sc = new Scanner(System.in);
		double totalBelanja;
		double potongan = 0.0;
		double totalBayar = 0.0;
		String namaPelanggan;

		// cetak dan input total belanja
		System.out.print("Total belanja: Rp ");
		totalBelanja = sc.nextDouble();

		// memakan \n yang tersisa dari nextDouble/nextInt/nextLong/...
		sc.nextLine();

		// cetak dan input nama pelanggan
		System.out.print("Nama Pelanggan: ");
		namaPelanggan = sc.nextLine();

		// output
		System.out.println();
		System.out.println("=".repeat(45));
		System.out.println("\t\t\t\tStruk Belanja");
		System.out.println("=".repeat(45));
		System.out.printf("%-20s Rp %20s\n", "Total Belanja", String.format("%,.0f", totalBelanja));

		/* Percabangan LUAR Dimulai */
		if (totalBelanja >= 300_000) {
			potongan = 0.15 * totalBelanja;
			/* Percabangan DALAM Dimulai: */
			// 1. JIKA potongan bernilai lebih besar dari 150000: Pastikan potongannya hanya 150000
			// 2. SELAIN ITU: Biarkan saja potongan aslinya
			if (potongan > 150_000) {
				potongan = 150_000;
				System.out.printf("%-20s Rp %20s\n", "Diskon (MAKS)", String.format("%,.0f", potongan));
			} else {
				System.out.printf("%-20s Rp %20s\n", "Diskon", String.format("%,.0f", potongan));
			}
			/* Percabangan DALAM Selesai */
		} else {
			System.out.printf("%-20s\n", "Tidak dapat diskon");
		}
		/* Percabangan LUAR Selesai */

		totalBayar = totalBelanja - potongan;

		// output
		System.out.println("=".repeat(45));
		System.out.printf("%-20s Rp %20s\n", "Total Bayar", String.format("%,.0f", totalBayar));

		System.out.println("-".repeat(45));
		System.out.println("Terima kasih atas kunjungan Anda, " + namaPelanggan + "!");
		System.out.println("=".repeat(45));
	}
}
