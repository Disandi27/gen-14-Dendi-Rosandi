import java.io.Serializable;

public class Barang implements Serializable {

	private static final long serialVersionUID = 1L;
	private String barang;
	private int harga;
	private int persediaan;

	Barang() {
	};

	Barang(String barang, int harga, int persediaan) {
		this.barang = barang;
		this.harga = harga;
		this.persediaan = persediaan;
	}

	@Override
	public String toString() {
		return "Barang:" + barang +", " +"Harga: " + harga +", " +"Persediaan: " + persediaan + ".";
	}
}