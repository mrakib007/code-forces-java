import java.util.ArrayList;
import java.util.Scanner;
 
public class cf1323a {
 
	public static void main(String[] args) {
 
		Scanner nik = new Scanner(System.in);
		int t = nik.nextInt();
		StringBuilder st = new StringBuilder();
		while (t-- > 0) {
			int n = nik.nextInt();
			int[] a = new int[n];
 
			boolean b = true;
			ArrayList<Integer> a1 = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				a[i] = nik.nextInt();
			}
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 0) {
					b = false;
					System.out.println(1 + "\n" + (i + 1) + " ");
					break;
				} else {
					a1.add(i + 1);
				}
			}
			if (b) {
				if (a1.size() <= 1) {
					System.out.println(-1);
				} else {
					System.out.println(2 + "\n" + a1.get(0) + " " + a1.get(1));
				}
			}
		}
	}
 
}