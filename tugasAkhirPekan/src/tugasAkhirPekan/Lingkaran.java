package tugasAkhirPekan;

public class Lingkaran extends BidangDatar {
	
	private double radius;
		
	public Lingkaran( ) {
		super();
	}
	
	public Lingkaran(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String luas() {
		luas = 3.14 * radius * radius;
		return "Luas Lingkaran = "+ " " +luas+ " " + " cm^2";
	}
	
	public String keliling() {
		keliling = 2 * 3.14 * radius;
		return "Keliling Lingkaran = "+ " " +keliling+ " " + " cm";
	}
	
}
