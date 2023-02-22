/**
 * 
 */
package TugasDua;

import java.util.Scanner;

/**
 * @author Dendi Rosandi
 *
 */
public class Tugas3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int g = 100;
		int[] bilanganGanjil = new int[g];
		int k = 0;
        for (int i = 1; i <= 2*g; i += 2) {
            bilanganGanjil[k] = i;
            k++;
        }
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan ukuran: ");
        int n = scanner.nextInt();
        
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(bilanganGanjil[i]+" ");
            }
            System.out.println();
            scanner.close();
        }

	}

}
