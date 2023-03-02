import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriterReader {

	public static void main(String[] args) {

		Barang b1 = new Barang("Oreo", 5000, 10);
		Barang b2 = new Barang("Silverqueen", 50000, 20);
		Barang b3 = new Barang("Kacang Garuda", 2000, 50);
		Barang b4 = new Barang("Ultra", 7000, 13);

		try {
			FileOutputStream f = new FileOutputStream(new File("Barang.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Tulis Objek ke File
			o.writeObject(b1);
			o.writeObject(b2);
			o.writeObject(b3);
			o.writeObject(b4);

			o.close();
			f.close();

			FileInputStream fi = new FileInputStream(new File("Barang.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			// Baca objek
			Barang pr1 = (Barang) oi.readObject();
			Barang pr2 = (Barang) oi.readObject();
			Barang pr3 = (Barang) oi.readObject();
			Barang pr4 = (Barang) oi.readObject();

			System.out.println(pr1.toString());
			System.out.println(pr2.toString());
			System.out.println(pr3.toString());
			System.out.println(pr4.toString());
			

			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}