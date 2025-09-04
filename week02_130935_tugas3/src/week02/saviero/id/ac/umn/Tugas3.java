package week02.saviero.id.ac.umn;
import java.util.Scanner;
public class Tugas3 {
	static boolean cekPrima(int n) {
		if(n <= 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i ==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukan nilai terkecil: ");
		int min = input.nextInt();
		System.out.print("masukan nilai terbesar: ");
		int max = input.nextInt();
		int jumlah = 0;
		
		for(int i = min; i <= max; i++) {
			if(cekPrima(i)) {
				jumlah += i;
			}
		}
		System.out.println("Jumlah dari semua nilai prima dari " + min + " Sampai " + max + " adalah " + jumlah);
		input.close();
	}

}
