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

public class bidangDatar {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		//Luas & Keliling Segitiga
		Segi3[] bidangSegi3 = new Segi3[1];
		
		Segi3 stg1 = new Segi3();
		
		stg1.setAlas(10);
		stg1.setTinggi(13);
		stg1.setSisi1(10);
		stg1.setSisi2(12);
		stg1.setSisi3(12);
		
		double luasSegi3 = (stg1.getAlas() * stg1.getTinggi())/2;
		double kelilingSegi3 = (stg1.getSisi1() + stg1.getSisi2() 
								+ stg1.getSisi3()) ;
		
		bidangSegi3[0] = stg1;
		for (int i=0; i<bidangSegi3.length; i++) {
			System.out.println("Segitiga, "+ " " +
					"Luas : "+ " " + luasSegi3 +" " +"m^2," + " "+
					"Keliling :" +" " +kelilingSegi3 + " m.");
		}
		
		//Luas & Keliling Persegi
		Persegi[] bidangPersegi = new Persegi[1];
		
		Persegi psg1 = new Persegi();
		psg1.setSisi(10);
		
		double luasPersegi = (psg1.getSisi()*psg1.getSisi());
		double kelilingPersegi = (psg1.getSisi()*4);

		bidangPersegi[0] = psg1;
		for (int i=0; i<bidangPersegi.length; i++) {
			System.out.println("Persegi, "+ " " +
					"Luas : "+ " " + luasPersegi +" " +"m^2," + " "+
					"Keliling :" +" " +kelilingPersegi + " m.");
		}
		
		//Luas & Keliling Lingkaran
		Lingkaran[] bidangLingkaran = new Lingkaran[1];
		
		Lingkaran blt1 = new Lingkaran();
		blt1.setRadius(51);
		
		double luasO = (3.14 * (blt1.getRadius()*blt1.getRadius()));
		double kelilingO = (2*3.14*blt1.getRadius());

		bidangLingkaran[0] = blt1;
		for (int i=0; i<bidangLingkaran.length; i++) {
			System.out.println("Lingkaran, "+ " " +
					"Luas : "+ " " + luasO +" " +"m^2," + " "+
					"Keliling :" +" " +kelilingO + " m.");
		}
		
		//Luas & Keliling Belah Ketupat
		BelahKetupat[] bidangBelahKetupat = new BelahKetupat[1];
		
		BelahKetupat bkt1 = new BelahKetupat();
		bkt1.setSisiBKT(15);
		bkt1.setDiagonal1(13);
		bkt1.setDiagonal2(13);
		
		double luasBKT = (bkt1.getDiagonal1()*bkt1.getDiagonal2())/2;
		double kelilingBKT = (4*bkt1.getSisiBKT());

		bidangBelahKetupat[0] = bkt1;
		for (int i=0; i<bidangBelahKetupat.length; i++) {
			System.out.println("Belah Ketupat, "+ " " +
					"Luas : "+ " " + luasBKT +" " +"m^2," + " "+
					"Keliling :" +" " +kelilingBKT + " m.");
		}
	}
}

