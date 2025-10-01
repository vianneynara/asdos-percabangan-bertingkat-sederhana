import java.util.Scanner;

/**
 * <h1>Percabangan Sederhana - Membandingkan Bilangan</h1><br>
 * Dengan menggunakan dua input bilangan bulat, buat program untuk menentukan
 * perbandingan antara kedua input bilangan yang dimasukkan. Program harus bisa
 * mencetak pesan yang sesuai dengan kondisi perbandingan bilangan tersebut:
 * <ul>
 * <li> Sama besar
 * <li> Bilangan pertama lebih besar dari bilangan kedua
 * <li> Bilangan kedua lebih besar dari bilangan pertama
 * </ul>
 *
 * @author <a href="https://github.com/vianneynara">nara</a>
 * */
public class A_PercabanganSederhana {

	public static void main(String[] args) {
		// deklarasi variabel
		Scanner sc = new Scanner(System.in);

		int bil1;
		int bil2;
		int selisih;

		// input: integer
		System.out.print("Masukkan bilangan pertama: ");
		bil1 = sc.nextInt();
		System.out.print("Masukkan bilangan kedua: ");
		bil2 = sc.nextInt();

		/* Percabangan Dimulai */
		// JIKA bil1 SAMA DENGAN bil2: Terangkan
		// NAMUN JIKA bil1 LEBIH BESAR DARI bil2: Terangkan
		// SELAIN ITU: Terangkan
		if (bil1 == bil2) {
			System.out.println("Bilangan pertama dan kedua sama besar.");
		} else if (bil1 > bil2) {
			System.out.println("Bilangan pertama lebih besar dari bilangan kedua.");
		} else {
			System.out.println("Bilangan kedua lebih kecil dari bilangan pertama.");
		}
		/* Percabangan Selesai */

		selisih = bil2 - bil1;					// hitung selisih bil1 dengan bil2

		// output
		System.out.println("Selisih bilangan kedua dan pertama adalah " + selisih);
	}
}
