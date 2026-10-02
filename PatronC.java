import java.util.Scanner;

public class PatronC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el numero de lineas: ");
        int nlin = scanner.nextInt();
        for (int ite=1;ite<=nlin;ite++) {
            for (int j=1;j<=nlin-ite;j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=(2*ite-1);k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int ite2=nlin-1;ite2>=1;ite2--) {
            for (int j2=1;j2<=nlin-ite2;j2++) {
                System.out.print(" ");
            }
            for (int k2=1;k2<=(2*ite2-1);k2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
