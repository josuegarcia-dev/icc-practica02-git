import java.util.Scanner;

public class PatronD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el numero de lineas: ");
        int lin=scanner.nextInt();
        for (int ite=1;ite<=lin;ite++) {
            for (int j=1;j<=lin-ite;j++) {
                System.out.print("  ");
            }
            for (int j=1;j<=ite;j++) {
                System.out.print(j+ " ");
            }
            for (int j=ite-1;j>=1;j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
