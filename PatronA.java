import java.util.Scanner;

	public class PatronA {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa el número de líneas: ");
	        int nlin = scanner.nextInt();
	      for(int ite=1;ite<=nlin;ite++) { 
	    	  for(int spc=1;spc<=nlin-ite;spc++) {
	    		  System.out.print(" ");
	    	  }
	    	  int numdec=2*ite-1;
	    	  for (int n=1;n<=numdec;n++) {
	                if (n==1||n==numdec) {
	                    System.out.print("1");
	                } else {
	                    System.out.print("*");
	                }
	            }
	    	   System.out.println();
	      }
	    }
	}
