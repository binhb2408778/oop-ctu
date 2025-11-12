package buoi4;

import java.util.*;

public class SDConVat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		ConVat[] ds = new ConVat[n];
		String giong;
		String maulong;
		float cannang;
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap vao loai(bo/heo/de): ");
			giong = scanner.nextLine();
			System.out.print("nhap vao mau long: ");
			maulong = scanner.nextLine();
			System.out.print("Nhap vao can nang: ");
			cannang = scanner.nextFloat();
			scanner.nextLine();
			switch(giong) {
			case "bo":
				ds[i] = new Bo(giong, maulong, cannang);
				break;
			case "heo":
				ds[i] = new Heo(giong, maulong, cannang);
				break;
			case "de":
				ds[i] = new De(giong, maulong, cannang);
				break;
			}
			
		}
		for (int i =0;i<n;i++) {
			ds[i].Keu();
		}
	}

}
