package tugasAkhirPekan;

public class Lingkaran {

	private String Lingkaran;
	private double radius;
	private double luasO;
	private double kelilingO;
	
	public Lingkaran( ) {
		super();
	}
	
	public Lingkaran(String Lingkaran, double luasO, double kelilingO) {
		super();
		this.Lingkaran = Lingkaran;
		this.luasO = luasO;
		this.kelilingO = kelilingO;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
