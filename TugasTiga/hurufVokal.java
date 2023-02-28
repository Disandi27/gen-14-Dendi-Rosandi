package TugasTiga;

import java.util.Scanner;

public class hurufVokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine().toLowerCase(); // Mengubah kalimat menjadi huruf kecil
        int jumlahA = 0, jumlahE = 0, jumlahI = 0, jumlahO = 0, jumlahU = 0;
        // Menghitung jumlah huruf vokal dalam kalimat
        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = kalimat.charAt(i);
            if (huruf == 'a') {
                jumlahA++;
            } else if (huruf == 'e') {
                jumlahE++;
            } else if (huruf == 'i') {
                jumlahI++;
            } else if (huruf == 'o') {
                jumlahO++;
            } else if (huruf == 'u') {
                jumlahU++;
            }
        }
        // Menampilkan jumlah tiap huruf vokal yang ditemukan
        System.out.println("Jumlah tiap huruf vokal dalam kalimat tersebut adalah:");
        System.out.println("a: " + jumlahA);
        System.out.println("e: " + jumlahE);
        System.out.println("i: " + jumlahI);
        System.out.println("o: " + jumlahO);
        System.out.println("u: " + jumlahU);
        scanner.close();
    }
}
