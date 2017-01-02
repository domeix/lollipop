import java.util.Scanner;

public class easterdate {
	public static void main(String[] Args) {
		System.out.println("Bitte geben Sie die Jahreszahl zur Berechnung des Osterdatums ein:");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		sc.close();
		
		if(y < 2100 && y >= 1900) {
			int a = (y-1900)%19;
			int b = (7*a+1)/19;
			int m = (11*a+4-b)%29;
			int q = (y-1900)/4;
			int w = (y-1900+q+31-m)%7;
			int d = 25-m-w;
			if(d > 0) {
				System.out.println("Der Ostersonntag im Jahr " + y + " ist am " + d + ". April.");
			} else {
				int d2 = 31+d;
				System.out.println("Der Ostersonntag im Jahr " + y + " ist am " + d2 + ". März.");
			}
		} else {
			System.out.println("Fehlerhafte Eingabe.");
		}
	}
}
