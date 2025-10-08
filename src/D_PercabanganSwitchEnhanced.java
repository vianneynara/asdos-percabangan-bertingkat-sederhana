import java.util.Scanner;

public class D_PercabanganSwitchEnhanced {

	/**
	 * <h1>Percabangan Switch Biasa - Harga Jenis Kue</h1>
	 * <p>
	 * Deskripsi:
	 * Program ini (secara konsep) akan menampilkan harga kue berdasarkan
	 * jenis kue yang dimasukkan pengguna menggunakan struktur percabangan switch.
	 * Pada berkas ini, logika tidak diimplementasikan; hanya skenario kasus yang didokumentasikan.
	 *
	 * <h2>Contoh Kasus</h2>
	 * Misalkan pengguna memasukkan nilai variabel <code>jenisKue</code> berupa nama kue.
	 * Program akan mencocokkan nama kue tersebut dan menampilkan harga sesuai daftar berikut:
	 *
	 * <table border="1" cellpadding="4" cellspacing="0">
	 *   <thead>
	 *     <tr>
	 *       <th>Jenis Kue</th>
	 *       <th>Harga (Rp)</th>
	 *     </tr>
	 *   </thead>
	 *   <tbody>
	 *     <tr>
	 *       <td>Cake</td>
	 *       <td>50.000</td>
	 *     </tr>
	 *     <tr>
	 *       <td>Pastry</td>
	 *       <td>40.000</td>
	 *     </tr>
	 *     <tr>
	 *       <td>Pasta</td>
	 *       <td>30.000</td>
	 *     </tr>
	 *     <tr>
	 *       <td>Pie</td>
	 *       <td>6.000</td>
	 *     </tr>
	 *   </tbody>
	 * </table>
	 *
	 * <h3>Contoh Input/Output</h3>
	 * <ul>
	 *   <li>Input: <code>kategori = "Cake", jumlah = 2</code> → Output: <code>Harga Cake: Rp 50.000 x 2 = Rp 100.000</code></li>
	 * </ul>
	 *
	 * <h3>Catatan</h3>
	 * - Ini hanya dokumentasi skenario. Tidak ada implementasi kode pada metode <code>main</code>.<br>
	 * - Penamaan input diharapkan sesuai (case-sensitive) dengan daftar di atas untuk memudahkan pencocokan pada switch.
	 *
	 * @author <a href="https://github.com/vianneynara">nara</a>
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("(Cake, Pastry, Pasta, Pie, Other)");
		System.out.print("Masukkan kategori kue	: ");
		String kategori = sc.nextLine();

		System.out.print("Masukkan jumlah kue		: ");
		int jumlah = sc.nextInt();

		double harga = 0;

		switch (kategori.toUpperCase()) {
			case "CAKE" -> harga = Category.CAKE.harga;
			case "PASTRY" -> harga = Category.PASTRY.harga;
			case "PASTA" -> harga = Category.PASTA.harga;
			case "PIE" -> harga = Category.PIE.harga;
			default -> {
				System.out.printf("Jenis kue \"%s\" tidak tersedia", kategori);
				return;
			}
		}

		System.out.printf("Anda membeli %s sebanyak %d, dengan total Rp. %,.2f",
			kategori, jumlah, harga * jumlah);
	}

	public enum Category {
		CAKE("CAKE", 50_000),
		PASTRY("PASTRY", 40_000),
		PASTA("PASTA", 30_000),
		PIE("PIE", 6_000),
		OTHER("OTHER", 0);

		public final String kategori;
		public final double harga;

		Category(String kategori, double harga) {
			this.kategori = kategori;
			this.harga = harga;
		}

		public static Category fromString(String value) {
			for (Category category : Category.values()) {
				if (category.kategori.equalsIgnoreCase(value)) {
					return category;
				}
			}
			throw new IllegalArgumentException("Invalid category: " + value);
		}
	}
}