package tugasAkhirPekan;

public class Segi3 extends bidangDatar {
	private double alas;
	private double tinggi;
	private double sisi1;
	private double sisi2;
	private double sisi3;
	private String Segi3;
	private double luasSegi3;
	private double kelilingSegi3;
			
	public Segi3() {
		super();
	}
	
	public Segi3(String Segi3, double luasSegi3, double kelilingSegi3) {
		super();
		this.Segi3 = Segi3;
		this.luasSegi3 = luasSegi3;
		this.kelilingSegi3 = kelilingSegi3;
		
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

		
	/*
	public double luasSegi3(double luasSegi3) {
		this.luasSegi3 = luasSegi3;
		luasSegi3 = this.alas * this.tinggi;
		return this.luasSegi3;
	}
	
	/*public String toString() {
		return ("Segitiga, "+ " " +
				"Luas : "+ " " + this.luasSegi3 +" " +"m^2")
				;
	}*/
     

}
