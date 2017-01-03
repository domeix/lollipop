import java.util.Scanner;

public class wurzelziehen {
	public static void main(String[] args) {
		System.out.println("Bitte geben Sie eine positive Dezimalzahl ein.");
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		sc.close();
		if(A > 0) {
			double a = wurzelRek(1,A);
			System.out.println("Die Wurzel aus " + A + " ist " + a + ".");
		} else {
			System.out.println("Fehlerhafte Eingabe.");
		}
	}
	
	public static double wurzelRek(double xN, double A) {
		double xNplus1 = (xN + A/xN)/2;
		System.out.println(xNplus1);
		if(Math.abs(xNplus1 * xNplus1 - A)> 0.00001) {
			xNplus1 = wurzelRek(xNplus1, A);
		}
		return xNplus1;
	}
}