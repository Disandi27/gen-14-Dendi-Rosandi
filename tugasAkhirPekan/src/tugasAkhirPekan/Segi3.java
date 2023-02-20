package tugasAkhirPekan;

public class Segi3 extends BidangDatar {
	private double alas;
	private double tinggi;
	private double sisi1;
	private double sisi2;
	private double sisi3;
				
	public Segi3() {
		super();
	}
	
	public Segi3(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
		super();
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisi1 = sisi1;
		this.sisi2 = sisi2;
		this.sisi3 = sisi3;
	}
	
	

	//Get & Set Alas
	public double getAlas() {
		return alas;
	}
	public void setAlas(double alas) {
		this.alas = alas;
	}
	
	//Get & Set Tinggi
	public double getTinggi() {
		return tinggi;
	}
	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public double getSisi1() {
		return sisi1;
	}

	public void setSisi1(double sisi1) {
		this.sisi1 = sisi1;
	}

	public double getSisi2() {
		return sisi2;
	}

	public void setSisi2(double sisi2) {
		this.sisi2 = sisi2;
	}

	public double getSisi3() {
		return sisi3;
	}

	public void setSisi3(double sisi3) {
		this.sisi3 = sisi3;
	}

		
	
	public String luas() {
		luas = (alas * tinggi)/2;
		return "Luas Segi3 = "+ " " +luas+ " " + " cm^2";
	}
	
	public String keliling() {
		keliling = sisi1 + sisi2 + sisi3;
		return "Keliling Segi3 = "+ " " +keliling+ " " + " cm";
	}
     

}
