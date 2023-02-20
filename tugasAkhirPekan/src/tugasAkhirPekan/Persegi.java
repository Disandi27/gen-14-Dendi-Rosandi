package tugasAkhirPekan;

public class Persegi extends BidangDatar {
	
	private double sisi;
	
	
	public Persegi ( ) {
		super();
	}
	
	public Persegi(double sisi) {
		super();
		this.sisi = sisi;		
	}

	public double getSisi() {
		return sisi;
	}

	public void setSisi(double sisi) {
		this.sisi = sisi;
	}
	
	public String luas() {
		luas = (sisi * sisi);
		return "Luas Persegi = "+ " " +luas+ " " + " cm^2";
	}
	
	public String keliling() {
		keliling = (4 * sisi);
		return "Keliling Persegi = "+ " " +keliling+ " " + " cm";
	}

}
