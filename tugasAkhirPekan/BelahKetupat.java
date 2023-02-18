package tugasAkhirPekan;

public class BelahKetupat {
	private double sisiBKT;
	private double diagonal1;
	private double diagonal2;
	private double luasBelahKetupat;
	private double kelilingBelahKetupat;
	private String BelahKetupat;
	
	public BelahKetupat ( ) {
		super();
	}
	
	public BelahKetupat(String BelahKetupat, double luasBelahKetupat, double kelilingBelahKetupat) {
		super();
		this.BelahKetupat = BelahKetupat;
		this.luasBelahKetupat = luasBelahKetupat;
		this.kelilingBelahKetupat = kelilingBelahKetupat;
		
	}

	public double getSisiBKT() {
		return sisiBKT;
	}

	public void setSisiBKT(double sisiBKT) {
		this.sisiBKT = sisiBKT;
	}

	public double getDiagonal1() {
		return diagonal1;
	}

	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public double getDiagonal2() {
		return diagonal2;
	}

	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}

}
