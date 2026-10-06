import java.util.Scanner;

public class CalcBinjav {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
     System.out.println("Bienvenido a esta calculadora en Binario\n"
     		+ "Indica que operacion quieres hacer:\n"
     		+ "1.Suma\n"
     		+ "2.Resta\n"
     		+ "3.Multiplicacion\n"
     		+ "4.Division");
     int opcion=scanner.nextInt();
     switch(opcion) {
     case 1:
    	scanner.nextLine();
    	System.out.println("Perfecto, escribe tu numero como binario de  bits");
     	String n1=scanner.nextLine();
     	int b11, b12, b13, b14, b15, b16, b17, b18;
     	if (n1.length()!=8) {
     		System.out.println("No es un binario de 8 bits");
     	} if(n1.matches("[01]+")) {
     		if(n1.charAt(0)=='1') {
     			b18=1;
     		} else {
     			b18=0;
     		}
     		if(n1.charAt(1)=='1') {
     			b17=1;
     		}else {
     			b17=0;
     		}
     		if(n1.charAt(2)=='1') {
     			b16=1;
     		} else {
     			b16=0;
     		}
     		if(n1.charAt(3)=='1') {
     			b15=1;
     		} else {
     			b15=0;
     		}
     		if(n1.charAt(4)=='1') {
     			b14=1;
     		} else {
     			b14=0;
     		}
     		if(n1.charAt(5)=='1') {
     			b13=1;
     		} else {
     			b13=0;
     		}
     		if(n1.charAt(6)=='1') {
     			b12=1;
     		} else {
     			b12=0;
     		}
     		if(n1.charAt(7)=='1') {
     			b11=1;
     		} else {
     			b11=0;
     		}
         	System.out.println("Ingrese un segundo binario");
         	String n2=scanner.nextLine();
         	int b21,b22,b23,b24,b25,b26,b27,b28;
         	if (n2.length()!=8) {
         		System.out.println("No es un binario de 8 bits");
         	} else if(n2.matches("[01]+")) {
         		if(n2.charAt(0)=='1') {
         			b28=1;
         		} else {
         			b28=0;
         		}
         		if(n2.charAt(1)=='1') {
         			b27=1;
         		}else {
         			b27=0;
         		}
         		if(n2.charAt(2)=='1') {
         			b26=1;
         		} else {
         			b26=0;
         		}
         		if(n2.charAt(3)=='1') {
         			b25=1;
         		} else {
         			b25=0;
         		}
         		if(n2.charAt(4)=='1') {
         			b24=1;
         		} else {
         			b24=0;
         		}
         		if(n2.charAt(5)=='1') {
         			b23=1;
         		} else {
         			b23=0;
         		}
         		if(n2.charAt(6)=='1') {
         			b22=1;
         		} else {
         			b22=0;
         		}
         		if(n2.charAt(7)=='1') {
         			b21=1;
         		} else {
         			b21=0;
         		}
         		int ac=0;
         		int r1=0,r2=0,r3=0,r4=0,r5=0,r6=0,r7=0,r8=0;
         		if(b11+b21==1) {
         			ac=0;
         			r1=1;
         		} else if (b11==0 && b21==0) {
         			ac=0;
         			r1=0;
         		}else {
         			ac=1;
         			r1=0;
         		}
         		if(b12+b22+ac==1) {
         			ac=0;
         			r2=1;
         		}else if(b12+b22+ac==2) {
         			ac=1;
         			r2=0;
         		}else if(b12+b22+ac==3) {
         			ac=1;
         			r2=1;
         		}else {
         			ac=0;
         			r2=0;
         		}
         		if(b13+b23+ac==1) {
         			ac=0;
         			r3=1;
         		}else if(b13+b23+ac==2) {
         			ac=1;
         			r3=0;
         		}else if(b13+b23+ac==3) {
         			ac=1;
         			r3=1;
         		}else {
         			ac=0;
         			r3=0;
         		}
         		if(b14+b24+ac==1) {
         			ac=0;
         			r4=1;
         		}else if(b14+b24+ac==2) {
         			ac=1;
         			r4=0;
         		}else if(b14+b24+ac==3) {
         			ac=1;
         			r4=1;
         		}else {
         			ac=0;
         			r4=0;
         		}
         		if(b15+b25+ac==1) {
         			ac=0;
         			r5=1;
         		}else if(b15+b25+ac==2) {
         			ac=1;
         			r5=0;
         		}else if(b15+b25+ac==3) {
         			ac=1;
         			r5=1;
         		}else {
         			ac=0;
         			r5=0;
         		}
         		if(b16+b26+ac==1) {
         			ac=0;
         			r6=1;
         		}else if(b16+b26+ac==2) {
         			ac=1;
         			r6=0;
         		}else if(b16+b26+ac==3) {
         			ac=1;
         			r6=1;
         		}else {
         			ac=0;
         			r6=0;
         		}
         		if(b17+b27+ac==1) {
         			ac=0;
         			r7=1;
         		}else if(b17+b27+ac==2) {
         			ac=1;
         			r7=0;
         		}else if(b17+b27+ac==3) {
         			ac=1;
         			r7=1;
         		}else {
         			ac=0;
         			r7=0;
         		}
         		if(b18+b28+ac==1) {
         			ac=0;
         			r8=1;
         		}else if(b18+b28+ac==2) {
         			ac=1;
         			r8=0;
         		}else if(b18+b28+ac==3) {
         			ac=1;
         			r8=1;
         		}else {
         			ac=0;
         			r8=0;
         		}
         		if(ac==1) {
         			System.out.println("Nop, aqui hay un overflow");
         		} else {
         			String resultado = "" + r8 + r7 + r6 + r5 + r4 + r3 + r2 + r1;
         			System.out.println("El resultado es "+resultado);
         		}
         	}else {
         		System.out.println("No es un binario");
         	}
     	} else {
     		System.out.println("No es un binario");
     	}
     	break;
     case 2:
    	 scanner.nextLine();
    	 System.out.println("Ingresa el minuendo(solo 8 bits)");
    	 String nr1=scanner.nextLine();
    	 int br11,br12,br13,br14,br15,br16,br17,br18;
    	 if(nr1.length()!=8) {
    		 System.out.println("No es un binario de 8 bits");
    	 } else if(nr1.matches("[01]+")) {
    		 if(nr1.charAt(0)=='1') {
      			br18=1;
      		} else {
      			br18=0;
      		}
      		if(nr1.charAt(1)=='1') {
      			br17=1;
      		}else {
      			br17=0;
      		}
      		if(nr1.charAt(2)=='1') {
      			br16=1;
      		} else {
      			br16=0;
      		}
      		if(nr1.charAt(3)=='1') {
      			br15=1;
      		} else {
      			br15=0;
      		}
      		if(nr1.charAt(4)=='1') {
      			br14=1;
      		} else {
      			br14=0;
      		}
      		if(nr1.charAt(5)=='1') {
      			br13=1;
      		} else {
      			br13=0;
      		}
      		if(nr1.charAt(6)=='1') {
      			br12=1;
      		} else {
      			br12=0;
      		}
      		if(nr1.charAt(7)=='1') {
      			br11=1;
      		} else {
      			br11=0;
      		}
      		System.out.println("Ingrese un sustraendo(Solo 8 bits)");
         	String nr2=scanner.nextLine();
         	int br21,br22,br23,br24,br25,br26,br27,br28;
         	if (nr2.length()!=8) {
         		System.out.println("No es un binario de 8 bits");
         	} if(nr2.matches("[01]+")) {
         		String nr2i = nr2.replace('0', 'X').replace('1', '0').replace('X', '1');
         		if(nr2i.charAt(0)=='1') {
         			br28=1;
         		} else {
         			br28=0;
         		}
         		if(nr2i.charAt(1)=='1') {
         			br27=1;
         		}else {
         			br27=0;
         		}
         		if(nr2i.charAt(2)=='1') {
         			br26=1;
         		} else {
         			br26=0;
         		}
         		if(nr2i.charAt(3)=='1') {
         			br25=1;
         		} else {
         			br25=0;
         		}
         		if(nr2i.charAt(4)=='1') {
         			br24=1;
         		} else {
         			br24=0;
         		}
         		if(nr2i.charAt(5)=='1') {
         			br23=1;
         		} else {
         			br23=0;
         		}
         		if(nr2i.charAt(6)=='1') {
         			br22=1;
         		} else {
         			br22=0;
         		}
         		if(nr2i.charAt(7)=='1') {
         			br21=1;
         		} else {
         			br21=0;
         		}
         		int acr=1;
         		int rr1=0,rr2=0,rr3=0,rr4=0,rr5=0,rr6=0,rr7=0,rr8=0;
         		if(br11+br21+acr==3) {
         			acr=1;
         			rr1=1;
         		}else if(br11+br21+acr==2) {
         			acr=1;
         			rr1=0;
         		}else if(br11+br21+acr==1) {
         			acr=0;
         			rr1=1;
         		}else {
         			acr=0;
         			rr1=0;
         		}
         		if(br12+br22+acr==3) {
         			acr=1;
         			rr2=1;
         		}else if(br12+br22+acr==2) {
         			acr=1;
         			rr2=0;
         		}else if(br12+br22+acr==1) {
         			acr=0;
         			rr2=1;
         		}else {
         			acr=0;
         			rr2=0;
         		}
         		if(br13+br23+acr==3) {
         			acr=1;
         			rr3=1;
         		}else if(br13+br23+acr==2) {
         			acr=1;
         			rr3=0;
         		}else if(br13+br23+acr==1) {
         			acr=0;
         			rr3=1;
         		}else {
         			acr=0;
         			rr3=0;
         		}
         		if(br14+br24+acr==3) {
         			acr=1;
         			rr4=1;
         		}else if(br14+br24+acr==2) {
         			acr=1;
         			rr4=0;
         		}else if(br14+br24+acr==1) {
         			acr=0;
         			rr4=1;
         		}else {
         			acr=0;
         			rr4=0;
         		}
         		if(br15+br25+acr==3) {
         			acr=1;
         			rr5=1;
         		}else if(br15+br25+acr==2) {
         			acr=1;
         			rr5=0;
         		}else if(br15+br25+acr==1) {
         			acr=0;
         			rr5=1;
         		}else {
         			acr=0;
         			rr5=0;
         		}
         		if(br16+br26+acr==3) {
         			acr=1;
         			rr6=1;
         		}else if(br16+br26+acr==2) {
         			acr=1;
         			rr6=0;
         		}else if(br16+br26+acr==1) {
         			acr=0;
         			rr6=1;
         		}else {
         			acr=0;
         			rr6=0;
         		}
         		if(br17+br27+acr==3) {
         			acr=1;
         			rr7=1;
         			acr=1;
         			rr7=0;
         		}else if(br17+br27+acr==1) {
         			acr=0;
         			rr7=1;
         		}else {
         			acr=0;
         			rr7=0;
         		}
         		if(br18+br28+acr==3) {
         			acr=1;
         			rr8=1;
         		}else if(br18+br28+acr==2) {
         			acr=1;
         			rr8=0;
         		}else if(br18+br28+acr==1) {
         			acr=0;
         			rr8=1;
         		}else {
         			acr=0;
         			rr8=0;
         		}
         		if(acr==1) {
         			String rresultado = "" + rr8 + rr7 + rr6 + rr5 + rr4 + rr3 + rr2 + rr1;
         			System.out.println("El resultado es "+rresultado);
         		} else {
         			String rresultado = "" + rr8 + rr7 + rr6 + rr5 + rr4 + rr3 + rr2 + rr1;
         			System.out.println("El resultado es "+rresultado+" expresado en complemento a 2");
         		}
         	} else {
         		System.out.println("No es un binario");
         	}
    	 }else {
    		 System.out.println("No es un binario");
    	 } break;
     case 3: 
         System.out.println("Ingrese el primer operando: ");
         int nm1 = scanner.nextInt();
         System.out.print("Ingrese el segundo operando: ");
         int nm2 = scanner.nextInt();
         if (nm1 < -128 || nm1 > 127 || nm2 < -128 || nm2 > 127) {
             System.out.println("No se puede representar algun operando con 8 bits");
         }
         int prod = 0;
         prod+=((nm2&(1<<0))!=0)?(nm1<<0):0;
         prod+=((nm2&(1<<1))!=0)?(nm1<<1):0; 
         prod+=((nm2&(1<<2))!=0)?(nm1<<2):0;
         prod+=((nm2&(1<<3))!=0)?(nm1<<3):0; 
         prod+=((nm2&(1<<4))!=0)?(nm1<<4):0; 
         prod+=((nm2&(1<<5))!=0)?(nm1<<5):0; 
         prod+=((nm2&(1<<6))!=0)?(nm1<<6):0; 
         if ((nm2&(1<<7))!=0) {
             prod-=(nm1<<7);
         }
         if (prod<-128||prod>127){
             System.out.println("Hay un overflow");
         }
         char brm8=((prod&(1<<7))!=0)?'1':'0';
         char brm7=((prod&(1<<6))!=0)?'1':'0';
         char brm6=((prod&(1<<5))!=0)?'1':'0';
         char brm5=((prod&(1<<4))!=0)?'1':'0';
         char brm4=((prod&(1<<3))!=0)?'1':'0';
         char brm3=((prod&(1<<2))!=0)?'1':'0';
         char brm2=((prod&(1<<1))!=0)?'1':'0';
         char brm1=((prod&(1<<0))!=0)?'1':'0';
         String repProd = "" + brm8 + brm7 + brm6 + brm5 + brm4 + brm3 + brm2 + brm1;
         System.out.println("El resultado de la multiplicacion es " + prod);
         System.out.println("Su representación binaria: " + repProd);
         break;
     case 4:
    	 scanner.nextInt();
    	 System.out.print("Ingrese el dividendo ");
         int nd1=scanner.nextInt();
         System.out.print("Ingrese el divisor ");
         int nd2=scanner.nextInt();
         if(nd1<-128||nd1>127||nd2<-128||nd2>127){
             System.out.println("Algun operador esta fuera de rango");
         }else if(nd2==0){
             System.out.println("No dividas entre 0 porfa");
         }else if(nd1==-128&&nd2==-1){
             System.out.println("Habemus overflow");
         }else{
             int nmd=nd1/nd2;
             int dmd=nd1%nd2;
             char cq8=((nmd&(1<<7))!=0)?'1':'0';
             char cq7=((nmd&(1<<6))!=0)?'1':'0';
             char cq6=((nmd&(1<<5))!=0)?'1':'0';
             char cq5=((nmd&(1<<4))!=0)?'1':'0';
             char cq4=((nmd&(1<<3))!=0)?'1':'0';
             char cq3=((nmd&(1<<2))!=0)?'1':'0';
             char cq2=((nmd&(1<<1))!=0)?'1':'0';
             char cq1=((nmd&(1<<0))!=0)?'1':'0';
             char cr8=((dmd&(1<<7))!=0)?'1':'0';
             char cr7=((dmd&(1<<6))!=0)?'1':'0';
             char cr6=((dmd&(1<<5))!=0)?'1':'0';
             char cr5=((dmd&(1<<4))!=0)?'1':'0';
             char cr4=((dmd&(1<<3))!=0)?'1':'0';
             char cr3=((dmd&(1<<2))!=0)?'1':'0';
             char cr2=((dmd&(1<<1))!=0)?'1':'0';
             char cr1=((dmd&(1<<0))!=0)?'1':'0';
             String bndq=""+cq8+cq7+cq6+cq5+cq4+cq3+cq2+cq1;
             String bndr=""+cr8+cr7+cr6+cr5+cr4+cr3+cr2+cr1;
             System.out.println("El cociente es "+nmd+" ("+bndq+")");
             System.out.println("El residuo es "+dmd+" ("+bndr+")");
         } break;
        default: 
        	System.out.println("No existe esa opcion, reintenta");
        	break;
     }
    }
}