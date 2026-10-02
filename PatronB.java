
	import java.util.Scanner;

	public class PatronB {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa el número de líneas: ");
	        int nlin = scanner.nextInt();
	      for (int ite = 1; ite <= nlin; ite++) {
	            for (int j = 1; j <= nlin - ite; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= (2 * ite - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}
