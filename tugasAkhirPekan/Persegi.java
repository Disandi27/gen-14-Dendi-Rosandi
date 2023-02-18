package tugasAkhirPekan;

public class Persegi extends bidangDatar {
	
	private double sisi;
	private double luasPersegi;
	private double kelilingPersegi;
	private String Persegi;
	
	public Persegi ( ) {
		super();
	}
	
	public Persegi(String Persegi, double luasPersegi, double kelilingPersegi) {
		super();
		this.Persegi = Persegi;
		this.luasPersegi = luasPersegi;
		this.kelilingPersegi = kelilingPersegi;
		
	}

	public double getSisi() {
		return sisi;
	}

	public void setSisi(double sisi) {
		this.sisi = sisi;
	}

}
