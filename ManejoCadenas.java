import java.util.Scanner;
public class ManejoCadenas {

	public static void main(String[] args) {
		System.out.println("Bienvenido usuario, a continuacion tecleé una palabra: ");
		try(Scanner scanner=new Scanner(System.in)){
			String palabra=scanner.nextLine();
			System.out.println("Perfecto, ahora seleccione que quiere hacer\n"
					+"1. Mostrar la longitud de la cadena.\n"+"2. Mostrar cada carácter de la cadena en una línea distinta.\n"+
					"3. Mostrar la cadena en orden inverso.\n"+"4. Contar apariciones de un caracter\n"+
					"5. Buscar una subcadena\n"+"6. Checar anagrama");
			int opcion=scanner.nextInt();
			switch(opcion) {
			case 1: 
				System.out.println("Tu cadena tiene "+palabra.length()+" caracteres");
				break;
			case 2:
				System.out.println("Mostrando cada caracter en lineas distintas");
				int longitud=palabra.length();
				for(int n=0;longitud > n;n++) {
					System.out.println(palabra.charAt(n));
				} break;
			case 3:
				System.out.println("De acuerdo, la cadena invertida es");
				String inv="";
				for(int n=palabra.length()-1;n >= 0; n--) {
					inv += palabra.charAt(n);
				}
			     System.out.println(inv);
			     break;
			case 4:
				System.out.println("Elija que caracter sera el buscado en la cadena:");
				scanner.nextLine();
				String caracter=scanner.nextLine();
				if(caracter.length()==1) {
					char buscarac=caracter.charAt(0);
					int contador=0;
					for(int n=0;n < palabra.length();n++) {
						if(palabra.charAt(n)==buscarac) {
							contador++;
						}
					}
					System.out.println("El caracter esta en la cadena " + contador + " veces");
				} else {
					System.out.println("Solo puedes introducir 1 caracter.");
				}break;
			case 5:
				scanner.nextLine();
				System.out.println("Ingrese la subcadena que quiere buscar ");
				String sub=scanner.nextLine();
				if(palabra.contains(sub)) {
					int possub=palabra.indexOf(sub);
					System.out.println("La subcadena esta en la posicion "+possub);
				}else {
					System.out.println("No esta la subcadena");
				}break;
			case 6:
				scanner.nextLine();
				System.out.println("Introdusca el posible anagrama, solo una palabra");
				String anag=scanner.nextLine();
				anag=anag.toLowerCase();
				palabra=palabra.toLowerCase();
				String espacios=" ";
				if(palabra.contains(espacios)||anag.contains(espacios)) {
					System.out.println("Solo se puede introducir una palabra, reintente");
				}else {
					if(palabra.length() != anag.length()) {
						
					} else {
						for(int n=0;palabra.length() > n;n++) {
							String ns=String.valueOf(palabra.charAt(n));
							if(anag.contains(ns)) {
								anag=anag.replaceFirst(ns, "");
							} else {
								break;
							}
						}
					}
					if(anag.isEmpty()) {
						System.out.println("SON ANAGRAMAS");
					} else {
						System.out.println("NO SON ANAGRAMAS");
					}
					break;
				} break;
			default: 
				System.out.println("No existe esa opcion, reintente");
				break;
			}
	}
	}

}
