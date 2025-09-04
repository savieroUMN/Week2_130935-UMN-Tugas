package week02.saviero.id.ac.umn;
import java.util.Scanner;
public class Tugas2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan angka: ");
		int angka = input.nextInt();
		
		boolean prima = true;
		
		if (angka <= 1) {
			prima = false;
		} else {
			for(int i=2; i <= Math.sqrt(angka); i++) {
				if(angka % i ==0) {
					prima = false; break;
				}
			}
		}
		if (prima) {
			System.out.println("Angka " + angka + " adalah angka prima");
		} else {
			System.out.println("Angka " + angka + " adalah bukan angka prima");
		}
		
		input.close();

	}

}
