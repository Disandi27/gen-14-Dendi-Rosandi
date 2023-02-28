package TugasTiga;

import java.util.Scanner;

public class Termahal {
    public static void main(String[] args) {
        int oreo = 6000;
        int tanggo = 5000;
        int buavita = 7000;
        int aqua = 3000;
        String barang = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang yang dimiliki: ");
        int uang = scanner.nextInt();

        int maksBarang = 0;
        int kembalian = 0;

        if (uang >= oreo && maksBarang < oreo) {
            maksBarang = oreo;
            barang = "Oreo";
        }
        if (uang >= tanggo && maksBarang < tanggo) {
            maksBarang = tanggo;
            barang = "Tanggo";
        }
        if (uang >= buavita && maksBarang < buavita) {
            maksBarang = buavita;
            barang = "Buavita";
        }
        if (uang >= aqua && maksBarang < aqua) {
            maksBarang = aqua;
            barang = "Aqua";
        }

        if (maksBarang == 0) {
            System.out.println("Maaf, uang tidak mencukupi untuk membeli barang apapun.");
        } else {
            kembalian = uang - maksBarang;
            System.out.println("Barang yang bisa dibeli dengan uang tersebut adalah"+" " + barang +" " + "seharga " + maksBarang + ".");
            System.out.println("Kembalian yang akan diterima adalah " + kembalian + ".");
        }
        scanner.close();
    }
}
