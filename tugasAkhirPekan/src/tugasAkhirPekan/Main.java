/**
 * 
 */
package tugasAkhirPekan;



/**
 * @author Dendi Rosandi
 * 
 * 1. Buatlah class bidang datar (Segitiga, Persegi, Lingkaran, BelahKetupat) 
 *    berikut dengan atributnya masing-masing dan jangan lupa setter dan getternya,
 *    juga constructornya

   2. Buatlah fungsi untuk menghitung luas dan keliling dari masing-masing 
      bidang datar yang telah dibuat.

   3. Buat program untuk menampilkan luas dari kumpulan (array) bidang datar yang telah dibuat.
 *
 */

public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		//menggunakan Setter
		Segi3 segi3 = new Segi3 ();
		segi3.setAlas(10);
		segi3.setTinggi(12);
		segi3.setSisi1(10);
		segi3.setSisi2(12);
		segi3.setSisi3(12);
		
		//menggunakan constructor
        Persegi persegi = new Persegi(10);
        Lingkaran lingkaran = new Lingkaran(14);
        BelahKetupat belahKetupat = new BelahKetupat(10,12,12);
        BidangDatar[] kumpulanBidangDatar = {segi3,persegi,lingkaran,belahKetupat};

        for (BidangDatar i : kumpulanBidangDatar) {
            System.out.println(i.luas()+ "||| " + i.keliling());
        }
	}	
}

